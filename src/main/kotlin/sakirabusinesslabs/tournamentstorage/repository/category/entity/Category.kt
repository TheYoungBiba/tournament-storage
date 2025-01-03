package sakirabusinesslabs.tournamentstorage.repository.category.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport

@Entity
@Table(name = "category")
class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = true, length = 64)
    var name: String = "",

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sport_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sport: Sport? = null
)