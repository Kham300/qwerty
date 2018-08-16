package ru.ursip.webservice.mgsn.workplace.service.organisation

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationJur
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationJurProjection
import java.util.*

interface OrganizationJurService {
    fun create(organizationJur: OrganizationJur): OrganizationJur
    fun update(organizationJur: OrganizationJur): OrganizationJur
    fun getById(id: UUID): OrganizationJur?
    fun deleteById(id: UUID)
    fun getAll(filter: OrganizationJurProjection?, pageable: Pageable): Page<OrganizationJur>
    fun getAllProjection(filter: OrganizationJurProjection?, pageable: Pageable): Page<OrganizationJurProjection>
}