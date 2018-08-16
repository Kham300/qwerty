package ru.ursip.webservice.mgsn.workplace.migration

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.service.passport.PassportObjectService

@Service
class MigrationService(private val passportObjectService: PassportObjectService,
                       private val template: NamedParameterJdbcTemplate) {

    /**
     * Для миграции данных о паспортах из оракла
     */
    fun migration() {
        val query = template.query("select xml from documents.xml_from_oracle")
        { rs, _ -> rs.getBinaryStream("xml") }
        var count = 0
        val end = query.size
        query.forEach {
            val passportObject = passportObjectService.unmarshall(it)
            passportObject?.let { po ->
                passportObjectService.create(po)
                print(po)
            } ?: print("passport object was empty after marshalling")
            print("=========${end - count} till the end========")
            count++
        }
    }
}