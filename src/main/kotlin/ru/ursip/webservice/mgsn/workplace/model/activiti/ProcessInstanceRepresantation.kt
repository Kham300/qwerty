package ru.ursip.webservice.mgsn.workplace.model.activiti

import org.activiti.engine.runtime.ProcessInstance


data class ProcessInstanceRepresantation(
        var id: String? = null,
        var suspended: Boolean? = null,
        var ended: Boolean? = null,
        var processDefinitionId: String? = null,
        var processDefinitionKey: String? = null,
        var variables: Map<String, Any>? = null,
        var name: String? = null
)

fun ProcessInstance.toRepresentation() = ProcessInstanceRepresantation(
        id,
        isSuspended,
        isEnded,
        processDefinitionId,
        processDefinitionKey,
        processVariables,
        name
)

