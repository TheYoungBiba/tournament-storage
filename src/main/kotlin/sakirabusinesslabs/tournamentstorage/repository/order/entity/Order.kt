package sakirabusinesslabs.tournamentstorage.repository.order.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sportsman.entity.Sportsman
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament

class Order (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sportsman_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sportsman: Sportsman? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournament: Tournament? = null,

    var isApproved: Boolean
)
