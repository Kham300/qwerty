package ru.ursip.webservice.mgsn.workplace.controller.organisation

import io.swagger.annotations.*
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationJur
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationJurProjection
import ru.ursip.webservice.mgsn.workplace.service.organisation.OrganizationJurService
import java.util.*

@Api(tags = ["Работа с юр. лицами"])
@RestController
@RequestMapping("v1/OrganizationJur", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@CrossOrigin
class OrganizationJurController(private val organizationJurService: OrganizationJurService) {

    @ApiImplicitParams(ApiImplicitParam(name = "page", dataType = "integer", paramType = "query"),
            ApiImplicitParam(name = "size", dataType = "integer", paramType = "query"),
            ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query"))
    @ApiOperation("Получение юр. лиц")
    @GetMapping("/getAll")
    fun getAll(@ApiParam("фильтр", required = false) filter: OrganizationJurProjection? = null, @PageableDefault pageable: Pageable): ResponseEntity<Any> {
        val organizations = organizationJurService.getAll(filter, pageable)
        return if (organizations.hasContent()) ResponseEntity.ok(organizations)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiImplicitParams(ApiImplicitParam(name = "page", dataType = "integer", paramType = "query"),
            ApiImplicitParam(name = "size", dataType = "integer", paramType = "query"),
            ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query"))
    @ApiOperation("Получение юр. лиц для витрины")
    @GetMapping("/getAllProjection")
    fun getAllProjection(@ApiParam("фильтр", required = false) filter: OrganizationJurProjection? = null, @PageableDefault pageable: Pageable): ResponseEntity<Any> {
        val organizations = organizationJurService.getAllProjection(filter, pageable)
        return if (organizations.hasContent()) ResponseEntity.ok(organizations)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiOperation("Получение юр. лиц по идентификатору")
    @GetMapping("/get/{id}")
    fun getById(@ApiParam("Идентификатор") @PathVariable id: UUID): ResponseEntity<Any> {
        val organization = organizationJurService.getById(id)
        return if (organization != null) ResponseEntity.ok(organization)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiOperation("Создание юр. лица")
    @PostMapping("/create")
    fun create(@ApiParam("Юр.лицо") @RequestBody organizationJur: OrganizationJur): ResponseEntity<Any> = ResponseEntity.ok().body(organizationJurService.create(organizationJur))

    @ApiOperation("Обновление юр. лица")
    @PostMapping("/update")
    fun update(@ApiParam("Юр.лицо") @RequestBody organizationJur: OrganizationJur): ResponseEntity<Any> = ResponseEntity.ok().body(organizationJurService.update(organizationJur))

    @ApiOperation("Удаление юр. лица")
    @PostMapping("/delete")
    fun delete(@ApiParam("Идентификатор") @RequestParam id: UUID) = organizationJurService.deleteById(id)

    @ApiOperation("Сохранение в задачу активти")
    @PostMapping("/saveInTask")
    fun saveInTask(@ApiParam("Номер задачи") @RequestParam taskId: String,
                   @ApiParam("Название переменной") @RequestParam variableName: String,
                   @ApiParam("Юр.лицо") @RequestBody organizationJur: OrganizationJur) =
            organizationJurService.saveInTask(taskId, variableName, organizationJur)
}