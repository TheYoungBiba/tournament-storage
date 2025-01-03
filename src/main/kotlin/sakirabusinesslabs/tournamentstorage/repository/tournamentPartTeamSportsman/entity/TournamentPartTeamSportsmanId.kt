package sakirabusinesslabs.tournamentstorage.repository.tournamentPartTeamSportsman.entity

import java.io.Serializable

data class TournamentPartTeamSportsmanId(
    var sportsmanId: Long = 0,
    var tournamentPartTeamId: Long = 0
) : Serializable