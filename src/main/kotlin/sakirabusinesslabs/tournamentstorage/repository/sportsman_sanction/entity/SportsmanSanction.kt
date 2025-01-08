package sakirabusinesslabs.tournamentstorage.repository.sportsman_sanction.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sportsman.entity.Sportsman
import sakirabusinesslabs.tournamentstorage.repository.sanction.entity.Sanction
import java.time.LocalDate

@Entity
@Table(name = "sportsmen_sanction")
class SportsmanSanction(
    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sportsmen_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sportsman: Sportsman? = null,

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sanction_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sanction: Sanction? = null,

    @Column(name = "disqualification")
    var disqualification: LocalDate? = null
)
