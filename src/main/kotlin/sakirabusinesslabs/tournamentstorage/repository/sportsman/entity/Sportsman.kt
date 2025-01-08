//package sakirabusinesslabs.tournamentstorage.repository.sportsman.entity
//
//import jakarta.persistence.Column
//import jakarta.persistence.Entity
//import jakarta.persistence.PrimaryKeyJoinColumn
//import jakarta.persistence.Table
//import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
//import java.time.LocalDate
//import java.time.OffsetDateTime
//
//@Entity
//@Table(name = "sportsman")
//@PrimaryKeyJoinColumn(name = "id")
//class Sportsman(
//
//    @Column(nullable = false)
//    val birthday: LocalDate = LocalDate.now(),
//
//    @Column(nullable = false)
//    val is_male: String = "Male",
//
//    @Column(nullable = false)
//    val height: Float = 0f,
//
//    @Column
//    val height_updated_at: OffsetDateTime = OffsetDateTime.now(),
//
//    @Column
//    val height_checked_at: OffsetDateTime = OffsetDateTime.now(),
//
//    @Column(nullable = false)
//    val weight: Float = 0f,
//
//    @Column
//    val weight_updated_at: OffsetDateTime = OffsetDateTime.now(),
//
//    @Column
//    val weight_checked_at: OffsetDateTime = OffsetDateTime.now(),
//
//    @Column(nullable = false)
//    val club_id: Int = 0
//) : User()

package sakirabusinesslabs.tournamentstorage.repository.sportsman.entity

import jakarta.persistence.*
import sakirabusinesslabs.tournamentstorage.repository.user.entity.Passport
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "sportsmen")
class Sportsman(
    id: Int,
    login: String,
    email: String,
    phoneNumber: String,
    photoId: String? = null,
    firstName: String? = null,
    lastName: String? = null,
    patronymic: String? = null,
    passport: Passport? = null,
    password: String,

    @Column(nullable = false)
    val birthday: LocalDate,

    @Column(nullable = false)
    val isMale: Boolean,
    @Column
    val height: Float? = null,

    @Column
    val heightUpdatedAt: LocalDate? = null,

    @Column
    val heightCheckedAt: LocalDate? = null,

    @Column
    val weight: Float? = null,

    @Column
    val weightUpdatedAt: LocalDate? = null,

    @Column
    val weightCheckedAt: LocalDate? = null,

    @Column
    val clubId: Int? = null

) : User(id, login, email, phoneNumber, photoId, firstName, lastName, patronymic, passport, password)
