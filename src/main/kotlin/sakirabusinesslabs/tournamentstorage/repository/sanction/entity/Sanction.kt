package sakirabusinesslabs.tournamentstorage.repository.sanction.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport

@Entity
@Table(name = "sanction")
class Sanction(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(name = "name", nullable = false, length = 128)
    var name: String,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sport_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sport: Sport? = null
)
