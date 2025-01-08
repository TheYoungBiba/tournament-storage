package sakirabusinesslabs.tournamentstorage.repository.tournamentPartTeamSportsman.entity

import jakarta.persistence.*

@Entity
@Table(name = "tournament_part_team_sportsmen")
@IdClass(TournamentPartTeamSportsmanId::class)
data class TournamentPartTeamSportsman(

    @Id
    @Column(name = "sportsmen_id", nullable = false)
    var sportsmanId: Int = 0,

    @Id
    @Column(name = "tournament_part_team_id", nullable = false)
    var tournamentPartTeamId: Int = 0,
)
