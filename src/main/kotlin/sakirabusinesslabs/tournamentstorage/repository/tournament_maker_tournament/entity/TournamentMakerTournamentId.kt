package sakirabusinesslabs.tournamentstorage.repository.tournament_maker_tournament.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
data class TournamentMakerTournamentId(
    var tournamentId: Int = 0,
    var tournamentMakerId: Int = 0
) : Serializable
