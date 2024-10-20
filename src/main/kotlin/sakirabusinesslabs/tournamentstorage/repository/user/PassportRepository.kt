package sakirabusinesslabs.tournamentstorage.repository.user

import org.springframework.data.jpa.repository.JpaRepository
import sakirabusinesslabs.tournamentstorage.repository.user.entity.Passport

interface PassportRepository: JpaRepository<Passport, Long>
