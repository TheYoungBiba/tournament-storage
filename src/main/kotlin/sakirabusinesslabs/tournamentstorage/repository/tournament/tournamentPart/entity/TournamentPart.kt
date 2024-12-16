package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity.TournamentPartTournamentPartTeam
import java.time.LocalDate

@Entity
@Table(name = "tournament_part")
data class TournamentPart(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "tournament_id", referencedColumnName = "id", nullable = false)
//    @Column(name = "tournament_id" ,nullable = false)
//    var tournamentId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id", referencedColumnName = "id", nullable = false)
    @Column(name = "tournament_id" ,nullable = false)
    var tournament: Tournament? = null,

    @Column(nullable = false, length = 256)
    var name: String = "",

    @Column(name = "start_time")
    var startTime: LocalDate   = LocalDate.now(),

    @Column(name = "end_time")
    var endTime: LocalDate = LocalDate.now(),

    @Column(name = "category_id",nullable = false, length = 256)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "column_id", referencedColumnName = "id", nullable = false)
    var columnId: Int = 0,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournamentPartTournamentPartTeam: List<TournamentPartTournamentPartTeam>? = null
)
