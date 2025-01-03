package sakirabusinesslabs.tournamentstorage.repository.sport.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "sport")
class Sport (

    @Id
    var id: Int = 0,

    @Column(name = "name", nullable = false, length = 128)
    var name: String,
)