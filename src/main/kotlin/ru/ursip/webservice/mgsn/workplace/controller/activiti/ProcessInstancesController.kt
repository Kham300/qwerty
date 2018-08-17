package ru.ursip.webservice.mgsn.workplace.controller.activiti

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.ursip.webservice.mgsn.workplace.service.activiti.ProcessInstancesService

@Api(tags = ["Работа с instance процессов активити"])
@RestController
@RequestMapping("v1/activiti/processInstances", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@CrossOrigin
class ProcessInstancesController(private val processInstancesService: ProcessInstancesService) {

    @ApiOperation("Получение всех экземляров процессов")
    @GetMapping("/getAll")
    fun getAll(@ApiParam("Ключ definition процесса") @RequestParam(required = false) processDefinitionKey: String?,
               @ApiParam("Идентификатор definition процесса") @RequestParam(required = false) processDefinitionId: String?): ResponseEntity<*> =
            ResponseEntity.ok().body(processInstancesService.getAll(processDefinitionKey, processDefinitionId))

    @ApiOperation("Старт процесса")
    @GetMapping("/startProcess")
    fun startProcessInstanceByKey(@ApiParam("Ключ definition процесса") processDefinitionKey: String,
                                  @ApiParam("Бизнес ключ") @RequestParam(required = false) businessKey: String?,
                                  @ApiParam("Переменные") @RequestParam(required = false) variables: Map<String, Any>?): ResponseEntity<*> =
            ResponseEntity.ok().body(processInstancesService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables))
}