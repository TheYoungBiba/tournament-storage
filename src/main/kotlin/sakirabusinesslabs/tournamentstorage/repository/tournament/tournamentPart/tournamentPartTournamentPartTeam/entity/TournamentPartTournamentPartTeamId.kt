//package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity
//
//import jakarta.persistence.Column
//import jakarta.persistence.Embeddable
//import java.io.Serializable
//
//@Embeddable
//data class TournamentPartTournamentPartTeamId(
//    @Column(name = "tournament_part_id")
//    var tournamentPartId: Int = 0,
//
//    @Column(name = "tournament_part_team_id")
//    var tournamentPartTeamId: Int = 0
//) : Serializable
package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
data class TournamentPartTournamentPartTeamId(
    val tournamentPart: Int = 0,
    val tournamentPartTeam: Int = 0
) : Serializable
