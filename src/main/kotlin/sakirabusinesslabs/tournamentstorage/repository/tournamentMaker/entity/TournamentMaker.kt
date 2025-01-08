package sakirabusinesslabs.tournamentstorage.repository.tournamentMaker.entity

import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import sakirabusinesslabs.tournamentstorage.repository.user.entity.Passport
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User

//@Entity
//@Table(name = "user_tournament_maker")
//@PrimaryKeyJoinColumn(name = "id")
//class TournamentMaker(
//) : User()

@Entity
@Table(name = "user_tournament_maker")
class TournamentMaker(
    id: Int = 0,
    login: String,
    email: String,
    phoneNumber: String,
    photoId: String? = null,
    firstName: String? = null,
    lastName: String? = null,
    patronymic: String? = null,
    passport: Passport? = null,
    password: String

) : User(id, login, email, phoneNumber, photoId, firstName, lastName, patronymic, passport, password)
