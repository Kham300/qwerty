package ru.ursip.webservice.mgsn.workplace.organisation.repository

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationFiz
import java.util.*

interface OrganizationFizDao : CrudRepository<OrganizationFiz, UUID>, JpaSpecificationExecutor<OrganizationFiz>