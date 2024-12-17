import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.3.3"
    id("io.spring.dependency-management") version "1.1.6"
    id("io.gitlab.arturbosch.detekt") version "1.23.7"
    id("org.openapi.generator") version "7.8.0"
}

detekt {
    toolVersion = "1.23.7"
    config.setFrom(file("config/detekt/detekt.yml"))
    buildUponDefaultConfig = true
    autoCorrect = true
    ignoreFailures = false
}

group = "SakiraBusinessLabs"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("jakarta.validation:jakarta.validation-api:3.1.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    // Detekt custom rules
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.7")

    // Spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework:spring-webflux")

    // Database
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")

    // OpenApi
    implementation("io.swagger.core.v3:swagger-models:2.2.23")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.23")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")

    // Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(kotlin("script-runtime"))
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencyManagement {
    configurations.matching { it.name == "detekt" }.all {
        resolutionStrategy.eachDependency {
            if (requested.group == "org.jetbrains.kotlin") {
                useVersion(io.gitlab.arturbosch.detekt.getSupportedKotlinVersion())
            }
        }
    }
}

data class OpenApiContract(val gradleTaskName: String, val specPathSuffix: String, val generatedPackageName: String) {
    val specPath: String
        get() = "$rootDir/src/main/resources/openapi/tournament-storage/v1/$specPathSuffix"
}

val openApiSpecs = listOf(
    OpenApiContract("generateTournamentApi", "tournament/tournament.yaml", "tournament"),
    OpenApiContract("generateUserApi", "user/user.yaml", "user"),
    OpenApiContract("generateSportsmenApi", "sportsmen/sportsmen.yaml", "sportsmen"),
    OpenApiContract("generateSeasonApi", "season/season.yaml", "season"),
    OpenApiContract("generatePersonDataApi", "personData/person-data.yaml", "personData")
)

val outputDirPath = "${project.layout.buildDirectory.get().asFile}/generated"

openApiSpecs.forEach {
    val openApiGenerateInterface = tasks.register<GenerateTask>(it.gradleTaskName) {
        generatorName.set("kotlin-spring")
        inputSpec.set(it.specPath)
        outputDir.set(outputDirPath)
        apiPackage.set("ru.tournament.${it.generatedPackageName}.interfaces")
        modelPackage.set("ru.tournament.${it.generatedPackageName}.dto")

        generateApiTests.set(false)
        generateModelTests.set(false)
        generateApiDocumentation.set(false)
        generateModelDocumentation.set(false)

        configOptions.putAll(
            mapOf(
                "interfaceOnly" to "true",
                "dateLibrary" to "java8",
                "serializationLibrary" to "jackson",
                "useSpringBoot3" to "true",
                "useTags" to "true",
                "requestMappingMode" to "api_interface"
            )
        )
    }

    tasks.named("compileKotlin") {
        dependsOn(openApiGenerateInterface)
    }
}

sourceSets.main {
    java {
        srcDir("$outputDirPath/src/main/kotlin")
    }
}
