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

    override fun getSportsmenGames(
        sportsmenGamesRequest: SportsmenGamesRequest
    ): ResponseEntity<List<SportsmenGamesResponse>> {
        return ResponseEntity(
            listOf(
                SportsmenGamesResponse(
                    sportsmenGamesRequest.id,
                    123,
                    sportsmenGamesRequest.sport,
                    true,
                    2
                )
            ),
            HttpStatus.OK
        )
    }

    override fun getSportsmenInfo(
        sportsmenInfoRequest: SportsmenInfoRequest
    ): ResponseEntity<SportsmenInfoResponse> {
        return ResponseEntity(
            SportsmenInfoResponse(
                sportsmenInfoRequest.id,
                sportsmenInfoRequest.sport,
                true,
                LocalDate.of(2004, 12, 29),
                80.5,
                1.82
            ),
            HttpStatus.OK
        )
    }

    override fun getSportsmenSanctions(
        sportsmenSanctionsRequest: SportsmenSanctionsRequest
    ): ResponseEntity<List<SportsmenSanctionsResponse>> {
        return ResponseEntity(
            listOf(
                SportsmenSanctionsResponse(
                    sportsmenSanctionsRequest.id,
                    321
                )
            ),
            HttpStatus.OK
        )
    }

    override fun updateSportsmenRate(
        sportsmenRateRequest: SportsmenRateRequest
    ): ResponseEntity<SportsmenRateResponse> {
        return ResponseEntity(
            SportsmenRateResponse(0),
            HttpStatus.OK
        )
    }
}
