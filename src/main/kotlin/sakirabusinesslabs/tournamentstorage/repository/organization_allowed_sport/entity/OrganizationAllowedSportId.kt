package sakirabusinesslabs.tournamentstorage.repository.organization_allowed_sport.entity

import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import java.io.Serializable

data class OrganizationAllowedSportId(
    var organization: Organization,
    var sport: OrganizationAllowedSport
) : Serializable