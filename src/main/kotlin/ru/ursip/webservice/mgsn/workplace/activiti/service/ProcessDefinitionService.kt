package ru.ursip.webservice.mgsn.workplace.activiti.service

import org.activiti.engine.repository.ProcessDefinition

interface ProcessDefinitionService {

    fun getAll(name: String? = null, startableByUser: String? = null, latest: Boolean = true): List<ProcessDefinition>?
}