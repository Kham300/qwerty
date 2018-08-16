package ru.ursip.webservice.mgsn.workplace.repository.organisation

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationFiz
import java.util.*

interface OrganizationFizDao : CrudRepository<OrganizationFiz, UUID>, JpaSpecificationExecutor<OrganizationFiz>