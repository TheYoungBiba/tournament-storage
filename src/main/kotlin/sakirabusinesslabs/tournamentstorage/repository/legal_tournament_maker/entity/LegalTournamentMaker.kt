package sakirabusinesslabs.tournamentstorage.repository.legal_tournament_maker.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity
@Table(name = "legal_tournament_maker")
@PrimaryKeyJoinColumn(name = "id")
class LegalTournamentMaker(

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "organization_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    var organization: Organization
) : User()