package sakirabusinesslabs.tournamentstorage.repository.tournament_maker_tournament.entity

import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import sakirabusinesslabs.tournamentstorage.repository.organization_allowed_sport.entity.OrganizationAllowedSport
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament
import java.io.Serializable

data class TournamentMakerTournamentId(
    var tournament: Tournament,
//    var tournamentMaker: User
) : Serializable
