package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity

import java.io.Serializable

data class TournamentPartTournamentPartTeamId(
    var tournamentPartId: Long = 0,
    var tournamentPartTeamId: Long = 0
) : Serializable