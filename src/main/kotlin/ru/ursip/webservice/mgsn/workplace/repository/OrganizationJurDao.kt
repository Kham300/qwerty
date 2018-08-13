package ru.ursip.webservice.mgsn.workplace.repository

import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.OrganizationFiz
import ru.ursip.webservice.mgsn.workplace.model.OrganizationJur
import java.util.*

interface OrganizationJurDao : CrudRepository<OrganizationJur, UUID>, JpaSpecificationExecutor<OrganizationJur> {
    @EntityGraph(attributePaths = ["sro"])
    fun getById(id: UUID): OrganizationJur?
}