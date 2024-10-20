package sakirabusinesslabs.tournamentstorage.repository.user.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
open class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false, unique = true, length = 128)
    var login: String = "",

    @Column(nullable = false, unique = true, length = 128)
    var email: String = "",

    @Column(nullable = false, unique = true, length = 12)
    var phoneNumber: String = "",

    @Column(length = 1024)
    var photoId: String? = null,

    @Column(length = 64)
    var firstName: String? = null,

    @Column(length = 64)
    var lastName: String? = null,

    @Column(length = 64)
    var patronymic: String? = null,

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "passport_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var passport: Passport? = null,

    @Column(nullable = false, length = 256)
    var password: String = "",
)
