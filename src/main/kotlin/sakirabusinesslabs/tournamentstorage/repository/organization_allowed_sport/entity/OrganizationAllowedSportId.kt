package sakirabusinesslabs.tournamentstorage.repository.organization_allowed_sport.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport
import java.io.Serializable

@Embeddable
data class OrganizationAllowedSportId(

    var organizationId: Int = 0,
    var sportId: Int = 0
) : Serializable