package sakirabusinesslabs.tournamentstorage.repository.sportsmen

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.sportsmen.entity.Sportsmen

interface SportsmenRepository: JpaRepository<Sportsmen, Long>