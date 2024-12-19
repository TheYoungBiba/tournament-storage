package sakirabusinesslabs.tournamentstorage.repository.organization.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "organization")
@Entity
class Organization (

    @Id
    var id: Long,

    @Column(nullable = false, length = 256)
    var name: String,

    @Column(nullable = false, length = 15)
    var ogrn: String,

    @Column(nullable = false, length = 256)
    var reg_address: String,

    @Column(nullable = false, length = 10)
    var inn: String

)