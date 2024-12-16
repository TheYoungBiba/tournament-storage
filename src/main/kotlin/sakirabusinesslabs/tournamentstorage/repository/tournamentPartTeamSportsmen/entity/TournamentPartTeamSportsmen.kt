package sakirabusinesslabs.tournamentstorage.repository.tournamentPartTeamSportsmen.entity

import jakarta.persistence.*

@Entity
@Table(name = "tournament_part_tournament_part_team")
@IdClass(TournamentPartTeamSportsmenId::class)
data class TournamentPartTeamSportsmen(

    @Id
    @Column(name = "sportsmen_id", nullable = false)
    var sportsmenId: Long = 0,

    @Id
    @Column(name = "tournament_part_team_id", nullable = false)
    var tournamentPartTeamId: Long = 0,
)
