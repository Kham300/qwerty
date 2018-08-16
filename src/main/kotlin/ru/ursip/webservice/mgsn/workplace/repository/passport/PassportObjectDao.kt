package ru.ursip.webservice.mgsn.workplace.repository.passport

import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObject
import java.util.*

interface PassportObjectDao : CrudRepository<PassportObject, UUID> {
}