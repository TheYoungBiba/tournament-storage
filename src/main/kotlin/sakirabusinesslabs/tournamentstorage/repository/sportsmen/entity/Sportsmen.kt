package sakirabusinesslabs.tournamentstorage.repository.sportsmen.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity
@Table(name = "sportsmen")
@PrimaryKeyJoinColumn(name = "id")
class Sportsmen(

    @Column(nullable = false)
    val birthday: LocalDate = LocalDate.now(),

    @Column(nullable = false)
    val is_male: String = "Male",

    @Column(nullable = false)
    val height: Float = 0f,

    @Column
    val height_updated_at: OffsetDateTime = OffsetDateTime.now(),

    @Column
    val height_checked_at: OffsetDateTime = OffsetDateTime.now(),

    @Column(nullable = false)
    val weight: Float = 0f,

    @Column
    val weight_updated_at: OffsetDateTime = OffsetDateTime.now(),

    @Column
    val weight_checked_at: OffsetDateTime = OffsetDateTime.now(),

    @Column(nullable = false)
    val club_id: Int = 0
) : User()