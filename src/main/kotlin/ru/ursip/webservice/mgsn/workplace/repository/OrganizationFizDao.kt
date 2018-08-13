package ru.ursip.webservice.mgsn.workplace.repository

import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.OrganizationFiz
import java.util.*

interface OrganizationFizDao : CrudRepository<OrganizationFiz, UUID>, JpaSpecificationExecutor<OrganizationFiz>