//package sakirabusinesslabs.tournamentstorage
//
//import com.fasterxml.jackson.databind.ObjectMapper
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import sakirabusinesslabs.tournamentstorage.repository.user.UserRepository
//import sakirabusinesslabs.tournamentstorage.repository.user.entity.Passport
//import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
//
//@Configuration
//class Test(
//    private val userRepository: UserRepository,
//    private val objectMapper: ObjectMapper
//) {
//
//    @Bean
//    fun creatingUser(): User {
//        userRepository.deleteAll()
//        val user = userRepository.save(User(
//            login = "qwerty",
//            email = "qwerty",
//            phoneNumber = "qwerty",
//            passport = Passport(
//                series = "1234",
//                number = "123456",
//                registration = "qwerty"
//            ),
//            password = "qwerty"
//        ))
//        throw RuntimeException(
//            objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user)
//        )
//    }
//}