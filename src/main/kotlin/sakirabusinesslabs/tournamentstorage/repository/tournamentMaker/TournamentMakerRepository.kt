package sakirabusinesslabs.tournamentstorage.repository.tournamentMaker

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.tournamentMaker.entity.TournamentMaker

interface TournamentMakerRepository: JpaRepository<TournamentMaker, Int> {
}