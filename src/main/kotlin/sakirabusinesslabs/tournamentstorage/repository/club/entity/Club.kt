package sakirabusinesslabs.tournamentstorage.repository.club.entity

import jakarta.persistence.*

@Entity
@Table(name = "club")
class Club(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(name = "name", nullable = false, length = 128)
    var name: String = ""
)
