package ru.ursip.webservice.mgsn.workplace.repository.organisation

import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationJur
import java.util.*

interface OrganizationJurDao : CrudRepository<OrganizationJur, UUID>, JpaSpecificationExecutor<OrganizationJur> {
    @EntityGraph(attributePaths = ["sro"])
    fun getById(id: UUID): OrganizationJur?
}