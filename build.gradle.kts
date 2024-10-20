import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.3.3"
    id("io.spring.dependency-management") version "1.1.6"
    id("io.gitlab.arturbosch.detekt") version "1.23.7"
    id("org.openapi.generator") version "7.8.0"
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
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // Database
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")

    // Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // https://mvnrepository.com/artifact/jakarta.validation/jakarta.validation-api
    implementation("jakarta.validation:jakarta.validation-api:3.1.0")

    // https://mvnrepository.com/artifact/io.swagger.core.v3/swagger-models
    implementation("io.swagger.core.v3:swagger-models:2.2.23")
    // https://mvnrepository.com/artifact/io.swagger.core.v3/swagger-annotations
    implementation("io.swagger.core.v3:swagger-annotations:2.2.23")

    // https://mvnrepository.com/artifact/org.springframework/spring-webflux
    implementation("org.springframework:spring-webflux")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

configurations.all {
    resolutionStrategy.eachDependency {
        if (requested.group == "org.jetbrains.kotlin") {
            useVersion(io.gitlab.arturbosch.detekt.getSupportedKotlinVersion())
        }
    }
}


var buildDir: File = project.layout.buildDirectory.get().asFile
val outputDirPath = "$buildDir/generated"

// root points of openApiSpec
val openApiSpecs = listOf(
    "$rootDir/src/main/resources/openapi/v1/tournament.yaml",
)

openApiSpecs.forEachIndexed { index, openApiSpec ->
    val openApiGenerateInterface = tasks.register<GenerateTask>("OpenApiGenerateInterface$index") {
        generatorName.set("kotlin-spring")
        inputSpec.set(openApiSpec)
        outputDir.set(outputDirPath)
        apiPackage.set("ru.tournament.api")
        modelPackage.set("ru.tournament.model")

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

    val openApiGenerateClient = tasks.register<GenerateTask>("OpenApiGenerateClient$index") {
        generatorName.set("kotlin")
        inputSpec.set(openApiSpec)
        outputDir.set(outputDirPath)
        apiPackage.set("ru.tournament.client")
        modelPackage.set("ru.tournament.model")

        generateApiTests.set(false)
        generateModelTests.set(false)
        generateApiDocumentation.set(false)
        generateModelDocumentation.set(false)

        configOptions.putAll(
            mapOf(
                "useTags" to "false",
                "library" to "jvm-spring-webclient",
                "dateLibrary" to "java8",
                "serializationLibrary" to "jackson",
                "useSpringBoot3" to "true",
                "apiSuffix" to "StorageApiClient",
            )
        )
    }

    tasks.named("compileKotlin") {
        dependsOn(openApiGenerateInterface)
        dependsOn(openApiGenerateClient)
    }
}


sourceSets.main {
    java {
        srcDir("$buildDir/generated/src/main/kotlin")
    }
}
