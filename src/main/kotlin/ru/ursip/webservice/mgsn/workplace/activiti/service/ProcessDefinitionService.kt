package ru.ursip.webservice.mgsn.workplace.activiti.service

import org.activiti.engine.repository.ProcessDefinition
import ru.ursip.webservice.mgsn.workplace.activiti.model.ProcessDefinitionRepresentation

interface ProcessDefinitionService {

    fun getAll(name: String? = null, startableByUser: String? = null, latest: Boolean = true): List<ProcessDefinitionRepresentation>?
}