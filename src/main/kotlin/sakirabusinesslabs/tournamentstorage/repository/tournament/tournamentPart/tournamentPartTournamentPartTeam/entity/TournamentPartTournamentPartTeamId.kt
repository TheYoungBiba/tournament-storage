package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
data class TournamentPartTournamentPartTeamId(
    var tournamentPartId: Int = 0,
    var tournamentPartTeamId: Int = 0
) : Serializable
