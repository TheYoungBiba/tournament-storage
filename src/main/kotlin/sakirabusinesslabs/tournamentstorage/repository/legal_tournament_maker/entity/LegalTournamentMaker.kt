package sakirabusinesslabs.tournamentstorage.repository.legal_tournament_maker.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import sakirabusinesslabs.tournamentstorage.repository.user.entity.User
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity
@Table(name = "legal_tournament_maker")
@PrimaryKeyJoinColumn(name = "id")
class LegalTournamentMaker(

    @Column(name = "organization_id")
    var organization_id: Long
) : User()