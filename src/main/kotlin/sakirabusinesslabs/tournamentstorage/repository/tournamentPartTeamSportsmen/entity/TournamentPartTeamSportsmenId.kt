package sakirabusinesslabs.tournamentstorage.repository.tournamentPartTeamSportsmen.entity

import java.io.Serializable

data class TournamentPartTeamSportsmenId(
    var sportsmenId: Long = 0,
    var tournamentPartTeamId: Long = 0
) : Serializable