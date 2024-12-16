package sakirabusinesslabs.tournamentstorage.repository.tournamentMaker.entity

import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User

@Entity
@Table(name = "user_tournament_maker")
@PrimaryKeyJoinColumn(name = "id")
class TournamentMaker(
) : User()