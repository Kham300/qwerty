package ru.ursip.webservice.mgsn.workplace.service.impl

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.model.OrganizationJur
import ru.ursip.webservice.mgsn.workplace.model.OrganizationJurProjection
import ru.ursip.webservice.mgsn.workplace.model.toProjection
import ru.ursip.webservice.mgsn.workplace.model.toSpecification
import ru.ursip.webservice.mgsn.workplace.repository.OrganizationJurDao
import ru.ursip.webservice.mgsn.workplace.service.OrganizationJurService
import java.util.*

@Service
class OrganizationJurServiceImpl(private val organizationJurDao: OrganizationJurDao) : OrganizationJurService {

    override fun create(organizationJur: OrganizationJur): OrganizationJur {
        if (organizationJur.id == null) return organizationJurDao.save(organizationJur)
        else throw Exception("Для создания новой организации ее id Должен быть равен NULL")
    }

    override fun update(organizationJur: OrganizationJur): OrganizationJur {
        if (organizationJur.id != null) return organizationJurDao.save(organizationJur)
        else throw Exception("Для обновления организации ее id Должен быть не равен NULL")
    }

    override fun getAll(filter: OrganizationJurProjection?, pageable: Pageable): Page<OrganizationJur> =
            organizationJurDao.findAll(filter?.toSpecification(), pageable)

    override fun getAllProjection(filter: OrganizationJurProjection?, pageable: Pageable): Page<OrganizationJurProjection> =
            organizationJurDao.findAll(filter?.toSpecification(), pageable).map { it.toProjection() }

    override fun getById(id: UUID): OrganizationJur? = organizationJurDao.getById(id)

    override fun deleteById(id: UUID) = organizationJurDao.deleteById(id)
}