package ru.ursip.webservice.mgsn.workplace.organisation.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationFiz
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationFizExternal
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationFizProjection
import java.util.*

interface OrganizationFizService {
    fun getById(id: UUID): OrganizationFiz?
    fun deleteById(id: UUID)
    fun create(organizationFiz: OrganizationFiz): OrganizationFiz
    fun update(organizationFiz: OrganizationFiz): OrganizationFiz
    fun getAll(predicate: OrganizationFizProjection?, pageable: Pageable): Page<OrganizationFiz>
    fun getAllProjection(predicate: OrganizationFizProjection?, pageable: Pageable): Page<OrganizationFizProjection>
    fun getAllExternal(search: String, pageable: Pageable): List<OrganizationFizExternal>
    fun saveInTask(taskId: String, variableName: String, organizationFiz: OrganizationFiz)
}