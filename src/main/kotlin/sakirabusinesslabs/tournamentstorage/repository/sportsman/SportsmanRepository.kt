package sakirabusinesslabs.tournamentstorage.repository.sportsman

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.sportsman.entity.Sportsman

interface SportsmanRepository: JpaRepository<Sportsman, Long> {
}