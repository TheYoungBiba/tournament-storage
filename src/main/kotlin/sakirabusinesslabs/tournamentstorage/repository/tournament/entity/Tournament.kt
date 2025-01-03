package sakirabusinesslabs.tournamentstorage.repository.tournament.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity.TournamentPart
import java.math.BigDecimal
import java.time.LocalDate
import java.util.Date

@Entity
@Table(name = "tournament")
data class Tournament (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(nullable = false, unique = true, length = 128)
    var name: String = "",

    @Column(name = "sport_id" ,nullable = false)
    var sportId: Int = 0,

    @Column(nullable = false, unique = true, length = 256)
    var place: String = "",

    @Column(name = "start_time")
    var startTime: Date? = null,

    @Column(name = "end_time")
    var endTime: Date? = null,

    @Column(name = "is_official")
    var isOfficial: Boolean = false,

    @Column(name = "participation_fee")
    var participationFee: BigDecimal? = null,

    @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournamentPart: List<TournamentPart>? = null,

    @Column(name = "max_count_commands",nullable = false, length = 256)
    var maxCountCommands: Int = 0,
)