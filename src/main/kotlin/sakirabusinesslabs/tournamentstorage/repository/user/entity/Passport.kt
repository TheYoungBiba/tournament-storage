package sakirabusinesslabs.tournamentstorage.repository.user.entity

import jakarta.persistence.*

@Entity
@Table(name = "passport")
data class Passport(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    val id: Long = 0,

    @Column(name = "series", nullable = false, length = 4)
    var series: String = "",

    @Column(name = "number", nullable = false, length = 6)
    var number: String = "",

    @Column(name = "registration", length = 256)
    var registration: String? = null
)
