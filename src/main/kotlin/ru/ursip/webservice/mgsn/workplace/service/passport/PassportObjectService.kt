package ru.ursip.webservice.mgsn.workplace.service.passport

import org.springframework.data.domain.Pageable
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObject
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObjectProjection
import java.io.InputStream

interface PassportObjectService {

    fun create(passportObject: PassportObject): PassportObject

    fun update(passportObject: PassportObject): PassportObject

    fun getAll(): List<PassportObject>

    fun getAllProjection(pageable: Pageable): List<PassportObjectProjection>

    fun unmarshall(xml: String): PassportObject?

    fun unmarshall(xml: InputStream): PassportObject?
}