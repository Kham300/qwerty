package ru.ursip.webservice.mgsn.workplace.model.activiti

import org.activiti.engine.task.Task

data class TaskRepresantation(
        var id: String? = null,
        var name: String? = null,
        var assignee: String? = null,
        var processInstanceId: String? = null,
        var processVariables: Map<String, Any>?
)

fun Task.toRepresentation() = TaskRepresantation(
        id,
        name,
        assignee,
        processInstanceId,
        processVariables
)