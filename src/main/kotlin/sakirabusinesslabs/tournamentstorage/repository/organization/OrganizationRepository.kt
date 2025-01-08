package sakirabusinesslabs.tournamentstorage.repository.organization

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.organization.entity.Organization

interface OrganizationRepository: JpaRepository <Organization, Int> {
}