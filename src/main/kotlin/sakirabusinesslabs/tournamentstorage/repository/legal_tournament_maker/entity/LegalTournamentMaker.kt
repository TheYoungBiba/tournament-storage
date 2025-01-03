package sakirabusinesslabs.tournamentstorage.repository.legal_tournament_maker.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import sakirabusinesslabs.tournamentstorage.repository.user.entity.Passport
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate
import java.time.OffsetDateTime

//@Entity
//@Table(name = "legal_tournament_maker")
//@PrimaryKeyJoinColumn(name = "id")
//class LegalTournamentMaker(
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
//    @JoinColumn(name = "organization_id")
//    @OnDelete(action = OnDeleteAction.SET_NULL)
//    var organization: Organization
//) : User()

//@Entity
//@Table(name = "legal_tournament_maker")
//class LegalTournamentMaker(
//
//    @Id
//    @OneToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    var user: User,
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
//    @JoinColumn(name = "organization_id", referencedColumnName = "id")
//    var organization: Organization
//)

@Entity
@Table(name = "legal_tournament_maker")
class LegalTournamentMaker(

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    var organization: Organization? = null

) : User(id, login, email, phoneNumber, photoId, firstName, lastName, patronymic, passport, password)