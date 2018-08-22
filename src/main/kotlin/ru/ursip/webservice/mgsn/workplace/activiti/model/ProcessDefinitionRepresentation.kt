package ru.ursip.webservice.mgsn.workplace.activiti.model

import org.activiti.engine.repository.ProcessDefinition

data class ProcessDefinitionRepresentation(
        var id: String? = null,
        var name: String? = null,
        var suspended: Boolean? = null,
        var key: String? = null,
        var description: String? = null
)
fun ProcessDefinition.toRepresentation() = ProcessDefinitionRepresentation(
        id,
        name,
        isSuspended,
        key,
        description
)