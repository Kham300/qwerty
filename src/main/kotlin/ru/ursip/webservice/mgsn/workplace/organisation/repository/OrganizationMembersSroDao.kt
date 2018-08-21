package ru.ursip.webservice.mgsn.workplace.organisation.repository

import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationMembersSro
import java.util.*

interface OrganizationMembersSroDao : CrudRepository<OrganizationMembersSro, UUID>