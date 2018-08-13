package ru.ursip.webservice.mgsn.workplace.service.impl

import au.com.console.jpaspecificationdsl.like
import au.com.console.jpaspecificationdsl.or
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.model.*
import ru.ursip.webservice.mgsn.workplace.repository.OrganizationFizDao
import ru.ursip.webservice.mgsn.workplace.service.OrganizationFizService
import java.util.*

@Service
class OrganizationFizServiceImpl(private val organizationFizDao: OrganizationFizDao) : OrganizationFizService {
    override fun create(organizationFiz: OrganizationFiz): OrganizationFiz {
        if (organizationFiz.id == null) return organizationFizDao.save(organizationFiz)
        else throw Exception("Для создания новой организации ее id Должен быть равен NULL")
    }

    override fun update(organizationFiz: OrganizationFiz): OrganizationFiz {
        if (organizationFiz.id != null) return organizationFizDao.save(organizationFiz)
        else throw Exception("Для обновления организации ее id Должен быть не равен NULL")
    }

    override fun getAll(predicate: OrganizationFizProjection?, pageable: Pageable): Page<OrganizationFiz> =
            organizationFizDao.findAll(predicate?.toSpecification(), pageable)

    override fun getAllProjection(predicate: OrganizationFizProjection?, pageable: Pageable): Page<OrganizationFizProjection> =
            organizationFizDao.findAll(predicate?.toSpecification(), pageable).map { it.toProjection() }

    override fun getById(id: UUID): OrganizationFiz? = organizationFizDao.findById(id).get()

    override fun getAllExternal(search: String, pageable: Pageable): List<OrganizationFizExternal> = organizationFizDao.findAll(or(
            OrganizationFiz::orgInn.like("%$search%"),
            OrganizationFiz::snils.like("%$search%"),
            OrganizationFiz::orgNameFull.like("%$search%")), pageable)
            .map { it.toExternal() }
            .content


    override fun deleteById(id: UUID) = organizationFizDao.deleteById(id)
}