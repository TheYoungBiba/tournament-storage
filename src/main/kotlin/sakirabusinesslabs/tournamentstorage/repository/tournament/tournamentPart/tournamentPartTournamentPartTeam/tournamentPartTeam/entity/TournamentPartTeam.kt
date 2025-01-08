package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.tournamentPartTeam.entity

import jakarta.persistence.*

@Entity
@Table(name = "tournament_part_team")
data class TournamentPartTeam(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(nullable = false, length = 128)
    var name: String = ""
)