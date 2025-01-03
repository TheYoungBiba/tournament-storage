package sakirabusinesslabs.tournamentstorage.repository.season_tournament.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.season.entity.Season
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament


@Entity
@Table(name = "season_tournament")
class SeasonTournament(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "season_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var season: Season? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournament: Tournament? = null
)