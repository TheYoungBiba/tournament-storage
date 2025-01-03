package sakirabusinesslabs.tournamentstorage.repository.organization_allowed_sport.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport

@Entity
@Table(name = "organization_allowed_sport")
class OrganizationAllowedSport (

    @EmbeddedId
    var organizationAllowedSportId: OrganizationAllowedSportId? = null,

    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @MapsId("organizationId")
    @JoinColumn(name = "organization_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var organization: Organization? = null,

    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @MapsId("sportId")
    @JoinColumn(name = "sport_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var sport: Sport? = null
)

