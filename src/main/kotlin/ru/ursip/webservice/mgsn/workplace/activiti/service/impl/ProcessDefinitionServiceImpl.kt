package ru.ursip.webservice.mgsn.workplace.activiti.service.impl

import org.activiti.engine.RepositoryService
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.activiti.model.ProcessDefinitionRepresentation
import ru.ursip.webservice.mgsn.workplace.activiti.model.toRepresentation
import ru.ursip.webservice.mgsn.workplace.activiti.service.ProcessDefinitionService

@Service
class ProcessDefinitionServiceImpl(private val repositoryService: RepositoryService) : ProcessDefinitionService {

    override fun getAll(name: String?, startableByUser: String?, latest: Boolean): List<ProcessDefinitionRepresentation>? {
        var pdq = repositoryService.createProcessDefinitionQuery()
        name?.let { pdq = pdq.processDefinitionName(name) }
        startableByUser?.let { pdq = pdq.startableByUser(startableByUser) }
        if (latest) pdq = pdq.latestVersion()
        return pdq.list().map { it.toRepresentation() }
    }
}