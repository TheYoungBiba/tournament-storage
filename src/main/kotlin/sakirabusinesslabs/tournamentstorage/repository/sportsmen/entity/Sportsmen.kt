package sakirabusinesslabs.tournamentstorage.repository.sportsmen.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn
import sakirabusinesslabs.tournamentstorage.repository.user.entity.Passport
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate

@Entity
@PrimaryKeyJoinColumn(name = "id")
class Sportsmen(
    login: String = "",
    email: String = "",
    phoneNumber: String = "",
    photoId: String? = null,
    firstName: String? = null,
    lastName: String? = null,
    patronymic: String? = null,
    passport: Passport? = null,
    password: String = "",

    @Column(nullable = false)
    var birthday: LocalDate = LocalDate.MIN,

    @Column(nullable = false)
    var isMale: Boolean = true,


): User(
    login = login,
    email = email,
    phoneNumber = phoneNumber,
    photoId = photoId,
    firstName = firstName,
    lastName = lastName,
    patronymic = patronymic,
    passport = passport,
    password = password,
)
