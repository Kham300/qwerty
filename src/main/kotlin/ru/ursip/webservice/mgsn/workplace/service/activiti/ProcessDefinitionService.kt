package ru.ursip.webservice.mgsn.workplace.service.activiti

import org.activiti.engine.repository.ProcessDefinition

interface ProcessDefinitionService {

    fun getAll(name: String? = null, startableByUser: String? = null, latest: Boolean = true): List<ProcessDefinition>?
}