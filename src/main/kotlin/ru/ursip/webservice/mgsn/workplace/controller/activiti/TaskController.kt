package ru.ursip.webservice.mgsn.workplace.controller.activiti

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.ursip.webservice.mgsn.workplace.service.activiti.CustomTaskService

@Api(tags = ["Работа с задачами активити"])
@RestController
@RequestMapping("v1/activiti/tasks", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@CrossOrigin
class TaskController(val customTaskService: CustomTaskService) {

    @GetMapping("/getAll")
    @ApiOperation("Получить задачи")
    fun getAll(@ApiParam("Название") @RequestParam(required = false) name: String?,
               @ApiParam("Кому назначено") @RequestParam(required = false) assignee: String?,
               @ApiParam("Кто владеет") @RequestParam(required = false) owner: String?,
               @ApiParam("Идентификатор экземпляра процесса") @RequestParam(required = false) processInstanceId: String?,
               @ApiParam("Идентификатор определения процесса") @RequestParam(required = false) processDefinitionId: String?,
               @ApiParam("Ключ определения процесса") @RequestParam(required = false) processDefinitionKey: String?,
               @ApiParam("Ключ определения процесса") @RequestParam(required = false) includeProcessVariables: Boolean = false)
            : ResponseEntity<*> = ResponseEntity.ok()
            .body(customTaskService.getAllTasks(name, assignee, owner, processInstanceId,
                    processDefinitionId, processDefinitionKey, includeProcessVariables))

    @PostMapping("/complete")
    @ApiOperation("Выполнить задачу")
    fun completeTask(@ApiParam("Название") @RequestParam taskId: String,
                     @ApiParam("Переменные") @RequestBody(required = false) variables: MutableMap<String, Any>)
            : ResponseEntity<*> = ResponseEntity.ok()
            .body(customTaskService.completeTask(taskId, variables))
}