package ru.ursip.webservice.mgsn.workplace.service.activiti.impl

import org.activiti.engine.ProcessEngine
import org.activiti.engine.TaskService
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.model.activiti.TaskRepresantation
import ru.ursip.webservice.mgsn.workplace.model.activiti.toRepresentation
import ru.ursip.webservice.mgsn.workplace.service.activiti.CustomTaskService

@Service
class TaskService(val procsEngine: ProcessEngine,
                  val taskService: TaskService) : CustomTaskService {

    override fun getAllTasks(name: String?, assignee: String?, owner: String?,
                             processInstanceId: String?, processDefinitionId: String?,
                             processDefinitionKey: String?, includeProcessVariables: Boolean): List<TaskRepresantation>? {
        var tq = taskService.createTaskQuery()
        name?.let { tq = tq.taskNameLike(it) }
        assignee?.let { tq = tq.taskAssignee(it) }
        owner?.let { tq = tq.taskOwner(it) }
        processInstanceId?.let { tq = tq.processInstanceId(it) }
        processDefinitionId?.let { tq = tq.processDefinitionId(it) }
        processDefinitionKey?.let { tq = tq.processDefinitionKey(it) }
        if (includeProcessVariables) tq = tq.includeProcessVariables()
        return tq.list().map { it.toRepresentation() }
    }

    override fun completeTask(taskId: String, variables: MutableMap<String, Any>) =
            taskService.complete(taskId, variables)
}
