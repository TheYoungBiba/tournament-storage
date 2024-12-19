package sakirabusinesslabs.tournamentstorage.repository.organization_allowed_sport.entity

import jakarta.persistence.*
import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport

@PrimaryKeyJoinColumn(name = "id")
class OrganizationAllowedSport (
    @Id
    @OneToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "organization_id")
    var organization: Organization,

    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name = "sport_id")
    var sport: Sport

)

