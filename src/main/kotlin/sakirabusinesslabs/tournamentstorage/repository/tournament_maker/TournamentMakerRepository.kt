package sakirabusinesslabs.tournamentstorage.repository.tournament_maker

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.tournament_maker.entity.TournamentMaker

interface TournamentMakerRepository: JpaRepository<TournamentMaker, Long> {
}