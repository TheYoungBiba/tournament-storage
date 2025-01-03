package sakirabusinesslabs.tournamentstorage.repository.sportsman_sport.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport
import sakirabusinesslabs.tournamentstorage.repository.sportsman.entity.Sportsman

@Entity
@Table(name = "sportsmen_sport")
class SportsmanSport (
    @Id
    var id: Int = 0,

    @JoinColumn(name = "sport_id")
    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sport: Sport? = null,

    @JoinColumn(name = "sportsmen_id")
    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sportsman: Sportsman? = null,

    @Column
    var category_id: Int = 0,

    @Column
    var role_id: Int = 0,

    @Column(length = 64)
    var rank: String? = null,

    @Column(length =  128)
    var license: String? = null,

    @Column(nullable = false)
    var rating: Double
)