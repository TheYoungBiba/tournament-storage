package sakirabusinesslabs.tournamentstorage.repository.sportsmen_sport

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import sakirabusinesslabs.tournamentstorage.repository.sport.entity.Sport
import sakirabusinesslabs.tournamentstorage.repository.sportsmen.entity.Sportsmen

@Entity
@Table
class SportsmanSport (
    @Id
    var id: Long,

    var sport: Sport,

    var sportsmen: Sportsmen,

    var
)