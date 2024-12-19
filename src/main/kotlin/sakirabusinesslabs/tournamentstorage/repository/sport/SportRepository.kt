package sakirabusinesslabs.tournamentstorage.repository.sport

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport

interface SportRepository: JpaRepository<Sport, Long> {
}