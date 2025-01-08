//package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity
//
//import jakarta.persistence.*
//import org.hibernate.annotations.OnDelete
//import org.hibernate.annotations.OnDeleteAction
//import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity.TournamentPart
//import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.tournamentPartTeam.entity.TournamentPartTeam
//
//@Entity
//@Table(name = "tournament_part_tournament_part_team")
//class TournamentPartTournamentPartTeam(
//
//    @EmbeddedId
//    var id: TournamentPartTournamentPartTeamId? = null,
//
//    @MapsId("tournamentPartId")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
//    @JoinColumn(name = "tournament_part_id", nullable = false)
//    var tournamentPart: TournamentPart? = null,
//
//    @MapsId("tournamentPartTeamId")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
//    @JoinColumn(name = "tournament_part_team_id", nullable = false)
//    var tournamentPartTeam: TournamentPartTeam? = null,
//
//    @Column(name = "result")
//    var result: Int? = 0
//)


package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity

import jakarta.persistence.*
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity.TournamentPart
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.tournamentPartTeam.entity.TournamentPartTeam

@Entity
@Table(name = "tournament_part_tournament_part_team")
@IdClass(TournamentPartTournamentPartTeamId::class)
data class TournamentPartTournamentPartTeam(

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_part_id", nullable = false)
    val tournamentPart: TournamentPart,

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_part_team_id", nullable = false)
    val tournamentPartTeam: TournamentPartTeam,

    @Column(nullable = false)
    var result: Int = 0
)

