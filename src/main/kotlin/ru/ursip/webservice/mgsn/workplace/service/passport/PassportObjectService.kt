package ru.ursip.webservice.mgsn.workplace.service.passport

import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObject
import java.io.InputStream

interface PassportObjectService {

    fun create(passportObject: PassportObject): PassportObject

    fun update(passportObject: PassportObject): PassportObject

    fun getAll(): List<PassportObject>

    fun unmarshall(xml: String): PassportObject?

    fun unmarshall(xml: InputStream): PassportObject?
}