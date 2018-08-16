package ru.ursip.webservice.mgsn.workplace.repository.organisation

import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationMembersSro
import java.util.*

interface OrganizationMembersSroDao : CrudRepository<OrganizationMembersSro, UUID>