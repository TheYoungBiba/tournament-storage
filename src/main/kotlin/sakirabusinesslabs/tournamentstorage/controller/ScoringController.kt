package sakirabusinesslabs.tournamentstorage.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import ru.tournament.api.TournamentStorageApi
import ru.tournament.model.*
import java.time.LocalDate

@RestController
@Suppress("MagicNumber")
class ScoringController : TournamentStorageApi {
    override fun getAllSportsmenGames(id: Int, sport: String): ResponseEntity<List<SportsmenGame>> {
        return ResponseEntity(
            listOf(SportsmenGame(id, 123, sport, true, 2)),
            HttpStatus.OK
        )
    }

    override fun getGamesLastPeriod(id: Int, sport: String, period: Int): ResponseEntity<List<SportsmenGame>> {
        return ResponseEntity(
            listOf(SportsmenGame(id, 123, sport, true, 2)),
            HttpStatus.OK
        )
    }

    override fun getSanctionLastYear(id: Int, sport: String, period: Int): ResponseEntity<List<SportsmenSanction>> {
        return ResponseEntity(
            listOf(SportsmenSanction(id, 321)),
            HttpStatus.OK
        )
    }

    override fun getSportsmenInfo(id: Int, sport: String): ResponseEntity<SportsmenInfoResponse> {
        return ResponseEntity(
            SportsmenInfoResponse(id, sport, true, LocalDate.of(2004, 12, 29), 80.5, 1.82),
            HttpStatus.OK
        )
    }

    override fun updateSportsmenRate(id: Int, sport: String, rate: Double): ResponseEntity<SportsmenResponseDto> {
        return ResponseEntity(
            SportsmenResponseDto(0, ""),
            HttpStatus.OK
        )
    }
}
