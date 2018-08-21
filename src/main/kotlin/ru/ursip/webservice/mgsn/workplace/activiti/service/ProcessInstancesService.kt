package ru.ursip.webservice.mgsn.workplace.activiti.service

import org.activiti.engine.runtime.ProcessInstance
import ru.ursip.webservice.mgsn.workplace.activiti.model.ProcessInstanceRepresantation


interface ProcessInstancesService {

    fun getAll(processDefinitionKey: String? = null, processDefinitionId: String? = null): List<ProcessInstanceRepresantation>

    fun startProcessInstanceByKey(processDefinitionKey: String, businessKey: String? = null, variables: Map<String, Any>? = null): ProcessInstance?
}