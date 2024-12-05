package sakirabusinesslabs.tournamentstorage.repository.tournament_maker.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity
@Table(name = "user_tournament_maker")
@PrimaryKeyJoinColumn(name = "id")
class TournamentMaker(
) : User()