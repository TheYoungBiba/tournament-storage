package sakirabusinesslabs.tournamentstorage.repository.season.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.Date

@Entity
@Table(name = "season")
class Season(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(name = "name", nullable = false, length = 128)
    var name: String,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sport_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sport: Sport,

    @Column(name = "starts_at", nullable = false)
    var startsAt: Date,

    @Column(name = "ends_at", nullable = false)
    var endsAt: Date
)
