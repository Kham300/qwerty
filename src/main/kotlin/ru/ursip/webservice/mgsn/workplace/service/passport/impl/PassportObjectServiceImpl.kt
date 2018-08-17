package ru.ursip.webservice.mgsn.workplace.service.passport.impl

import org.springframework.data.domain.Pageable
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObject
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObjectProjection
import ru.ursip.webservice.mgsn.workplace.model.passport.generated.DocData
import ru.ursip.webservice.mgsn.workplace.model.passport.toDomainPassportObject
import ru.ursip.webservice.mgsn.workplace.repository.passport.PassportObjectDao
import ru.ursip.webservice.mgsn.workplace.service.passport.PassportObjectService
import java.io.InputStream
import java.time.LocalDate
import java.util.*
import javax.xml.transform.stream.StreamSource


@Service
class PassportObjectServiceImpl(private val passportObjectDao: PassportObjectDao,
                                private val marshaller: Jaxb2Marshaller) : PassportObjectService {
    @Transactional
    override fun create(passportObject: PassportObject): PassportObject = passportObjectDao.save(passportObject)

    @Transactional
    override fun update(passportObject: PassportObject): PassportObject = passportObjectDao.save(passportObject)

    override fun getAll(): List<PassportObject> = passportObjectDao.findAll().toList()

    /**
     * Вместо кастомного маппера
     */
    override fun getAllProjection(pageable: Pageable): List<PassportObjectProjection> =
            passportObjectDao.getAllProjection(pageable).map {
                PassportObjectProjection(
                        UUID.fromString(it["id"]?.toString()),
                        it["obj_fin_sourse"]?.toString(),
                        it["delo_num"]?.toString(),
                        it["obj_address"]?.toString(),
                        it["all_dist_prefect"]?.toString(),
                        it["obj_name"]?.toString(),
                        it["org_name"]?.toString(),
                        it["build_start_date"]?.toLocaleDate(),
                        it["build_end_date"]?.toLocaleDate(),
                        it["constr_state"]?.toString()
                )
            }


    override fun unmarshall(xml: String): PassportObject? {
        val docData = unmarshallXml<DocData>(xml)
        return docData.toDomainPassportObject()
    }

    override fun unmarshall(xml: InputStream): PassportObject? {
        val docData = unmarshallXml<DocData>(xml)
        return docData.toDomainPassportObject()
    }

    @Suppress("UNCHECKED_CAST")
    private fun <T> unmarshallXml(xml: InputStream): T =
            xml.use {
                return marshaller.unmarshal(StreamSource(it)) as T
            }

    private fun <T> unmarshallXml(xml: String): T = unmarshallXml(xml.byteInputStream())
}

fun Any.toLocaleDate(): LocalDate? = try {
    LocalDate.parse(this.toString())
} catch (e: Exception) {
    null
}