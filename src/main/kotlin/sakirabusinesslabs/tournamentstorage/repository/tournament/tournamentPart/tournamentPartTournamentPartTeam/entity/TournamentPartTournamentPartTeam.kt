package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity

import jakarta.persistence.*

@Entity
@Table(name = "tournament_part_tournament_part_team")
@IdClass(TournamentPartTournamentPartTeamId::class)
data class TournamentPartTournamentPartTeam(

    @Id
    @Column(name = "tournament_part_id", nullable = false)
    var tournamentPartId: Long = 0,

    @Id
    @Column(name = "tournament_part_team_id", nullable = false)
    var tournamentPartTeamId: Long = 0,

    @Column(nullable = true)
    var result: Int = 0
)