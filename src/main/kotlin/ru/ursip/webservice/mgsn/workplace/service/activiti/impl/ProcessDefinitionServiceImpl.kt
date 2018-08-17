package ru.ursip.webservice.mgsn.workplace.service.activiti.impl

import org.activiti.engine.RepositoryService
import org.activiti.engine.repository.ProcessDefinition
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.service.activiti.ProcessDefinitionService

@Service
class ProcessDefinitionServiceImpl(private val repositoryService: RepositoryService) : ProcessDefinitionService {

    override fun getAll(name: String?, startableByUser: String?, latest: Boolean): List<ProcessDefinition>? {
        var pdq = repositoryService.createProcessDefinitionQuery()
        name?.let { pdq = pdq.processDefinitionName(name) }
        startableByUser?.let { pdq = pdq.startableByUser(startableByUser) }
        if (latest) pdq = pdq.latestVersion()
        return pdq.list()
    }
}