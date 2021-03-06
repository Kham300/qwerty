package ru.ursip.webservice.mgsn.workplace.activiti.service

import ru.ursip.webservice.mgsn.workplace.activiti.model.TaskRepresantation

interface CustomTaskService {
    fun getAllTasks(name: String? = null, assignee: String? = null, owner: String? = null,
                    processInstanceId: String? = null, processDefinitionId: String? = null,
                    processDefinitionKey: String? = null, includeProcessVariables: Boolean = false): List<TaskRepresantation>?

    fun completeTask(taskId: String, variables: MutableMap<String, Any>)
}