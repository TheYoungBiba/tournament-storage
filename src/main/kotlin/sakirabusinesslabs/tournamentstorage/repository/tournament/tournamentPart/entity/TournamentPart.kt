package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.category.entity.Category
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity.TournamentPartTournamentPartTeam
import java.time.LocalDate
import java.util.*

@Entity
@Table(name = "tournament_part")
data class TournamentPart(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_id", referencedColumnName = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournament: Tournament? = null,

    @Column(nullable = false, length = 256)
    var name: String = "",

    @Column(name = "start_time")
    var startTime: Date? = null,

    @Column(name = "end_time")
    var endTime: Date? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var category: Category? = null,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "tournament_part_tournament_part_team", nullable = false)
    var tournamentPartTournamentPartTeam: List<TournamentPartTournamentPartTeam>? = null
)
