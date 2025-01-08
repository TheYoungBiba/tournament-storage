package sakirabusinesslabs.tournamentstorage.repository.sportsman_achievements.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sportsman_sport.entity.SportsmanSport
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament

@Entity
@Table(name = "sportsmen_achievements")
class SportsmanAchievement (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sportsmen_sport_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sportsmanSport: SportsmanSport? = null,

    @Column(nullable = false)
    var place: Int,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournament: Tournament? = null,


    @Column(name = "achieved_with_category_id")
    var achievedWithCategoryId: Int = 0,

    @Column(name = "description", length = 256)
    var description: String? = null,

    @Column(name = "achieved_at_year", length = 4, nullable = false)
    var achievedAtYear: String? = null
)