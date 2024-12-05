package sakirabusinesslabs.tournamentstorage.repository.tournament

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.tournament.entity.Tournament

interface TournamentRepository: JpaRepository<Tournament, Long> {
}