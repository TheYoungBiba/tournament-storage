package sakirabusinesslabs.tournamentstorage.repository.tournament_maker_tournament.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User

@Entity
@Table(name = "tournament_maker_tournament")
class TournamentMakerTournament (

    @EmbeddedId
    var tournamentMakerTournamentId: TournamentMakerTournamentId? = null,

    @MapsId("tournamentId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournament: Tournament? = null,

    @MapsId("tournamentMakerId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_maker_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var user: User? = null
)