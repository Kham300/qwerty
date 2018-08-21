package ru.ursip.webservice.mgsn.workplace.passport.service

import org.springframework.data.domain.Pageable
import ru.ursip.webservice.mgsn.workplace.passport.model.PassportObject
import ru.ursip.webservice.mgsn.workplace.passport.model.PassportObjectProjection
import java.io.InputStream

interface PassportObjectService {

    fun create(passportObject: PassportObject): PassportObject

    fun update(passportObject: PassportObject): PassportObject

    fun getAll(): List<PassportObject>

    fun getAllProjection(pageable: Pageable): List<PassportObjectProjection>

    fun unmarshall(xml: String): PassportObject?

    fun unmarshall(xml: InputStream): PassportObject?
}