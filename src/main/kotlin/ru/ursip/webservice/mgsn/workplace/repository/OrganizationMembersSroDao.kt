package ru.ursip.webservice.mgsn.workplace.repository

import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.OrganizationMembersSro
import java.util.*

interface OrganizationMembersSroDao : CrudRepository<OrganizationMembersSro, UUID>