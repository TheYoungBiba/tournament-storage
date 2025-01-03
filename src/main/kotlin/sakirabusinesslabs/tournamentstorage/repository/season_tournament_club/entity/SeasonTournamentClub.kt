package sakirabusinesslabs.tournamentstorage.repository.season_tournament_club.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.club.entity.Club
import sakirabusinesslabs.tournamentstorage.repository.season_tournament.entity.SeasonTournament
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity.TournamentPart

@Entity
@Table(name = "season_tournament_club")
class SeasonTournamentClub(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "season_tournament_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var seasonTournament: SeasonTournament? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_part_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournamentPart: TournamentPart? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "club_id", nullable = false)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var club: Club? = null
)