package sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.entity.TournamentPart
import sakirabusinesslabs.tournamentstorage.repository.tournament.tournamentPart.tournamentPartTournamentPartTeam.tournamentPartTeam.entity.TournamentPartTeam

@Entity
@Table(name = "tournament_part_tournament_part_team")
class TournamentPartTournamentPartTeam(

    @EmbeddedId
    var tournamentPartTournamentPartTeamId: TournamentPartTournamentPartTeamId? = null,

    @MapsId("tournamentPartId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_part_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournamentPart: TournamentPart? = null,

    @MapsId("tournamentPartTeamId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tournament_part_team_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var tournamentPartTeam: TournamentPartTeam? = null,

    @Column(name = "result")
    var result: Int? = 0
)
