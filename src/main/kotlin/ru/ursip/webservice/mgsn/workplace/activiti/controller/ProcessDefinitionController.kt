package ru.ursip.webservice.mgsn.workplace.activiti.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.ursip.webservice.mgsn.workplace.activiti.service.ProcessDefinitionService

@Api(tags = ["Работа с definition процессов активити"])
@RestController
@RequestMapping("v1/activiti/processDefinitions", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@CrossOrigin
class ProcessDefinitionController(private val processDefinitionService: ProcessDefinitionService) {

    @ApiOperation("Получение definition процессов")
    @GetMapping("/getAll")
    fun getAll(@ApiParam("Название") @RequestParam(required = false) name: String?,
               @ApiParam("Стартовая группа") @RequestParam(required = false) startableByUser: String?,
               @ApiParam("Последние версии") @RequestParam(required = false) latest: Boolean = true): ResponseEntity<*> =
            ResponseEntity.ok().body(processDefinitionService.getAll())
}