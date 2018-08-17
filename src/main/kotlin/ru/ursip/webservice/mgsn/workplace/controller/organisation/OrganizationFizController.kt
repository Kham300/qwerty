package ru.ursip.webservice.mgsn.workplace.controller.organisation

import io.swagger.annotations.*
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationFiz
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationFizProjection
import ru.ursip.webservice.mgsn.workplace.service.organisation.OrganizationFizService
import java.util.*

@Api(tags = ["Работа с физ. лицами"])
@RestController
@RequestMapping("v1/OrganizationFiz", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@CrossOrigin
class OrganizationFizController(private val organizationFizService: OrganizationFizService) {

    @ApiImplicitParams(ApiImplicitParam(name = "page", dataType = "integer", paramType = "query"),
            ApiImplicitParam(name = "size", dataType = "integer", paramType = "query"),
            ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query"))
    @ApiOperation("Получение физ. лиц")
    @PostMapping("/getAll")
    fun getAll(@ApiParam("фильтр", required = false) filter: OrganizationFizProjection? = null,
               @PageableDefault pageable: Pageable): ResponseEntity<Any> {
        val organizations = organizationFizService.getAll(filter, pageable)
        return if (organizations.hasContent()) ResponseEntity.ok(organizations)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiOperation("Получение физ. лиц для витрины")
    @GetMapping("/getAllProjection")
    fun getAllProjection(@ApiParam("фильтр", required = false) filter: OrganizationFizProjection? = null,
                         @PageableDefault pageable: Pageable): ResponseEntity<Any> {
        val organizations = organizationFizService.getAllProjection(filter, pageable)
        return if (organizations.hasContent()) ResponseEntity.ok(organizations)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiOperation("Получение физ. лиц для других модулей")
    @GetMapping("/getAllExternal")
    fun getAllExternal(@ApiParam("Строка для поиска") @RequestParam search: String, @PageableDefault pageable: Pageable): ResponseEntity<Any> {
        val organizations = organizationFizService.getAllExternal(search, pageable)
        return if (organizations.isNotEmpty()) ResponseEntity.ok(organizations)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiOperation("Получение физ. лиц по идентификатору")
    @GetMapping("/get/{id}")
    fun getById(@ApiParam("Идентификатор") @PathVariable id: UUID): ResponseEntity<Any> {
        val organization = organizationFizService.getById(id)
        return if (organization != null) ResponseEntity.ok(organization)
        else ResponseEntity.noContent().build<Any>()
    }

    @ApiOperation("Создание физ. лица")
    @PostMapping("/create")
    fun create(@ApiParam("Физ.лицо") @RequestBody organizationFiz: OrganizationFiz): ResponseEntity<Any> =
            ResponseEntity.ok().body(organizationFizService.create(organizationFiz))

    @ApiOperation("Обноваление физ. лица")
    @PostMapping("/update")
    fun update(@ApiParam("Физ.лицо") @RequestBody organizationFiz: OrganizationFiz): ResponseEntity<Any> =
            ResponseEntity.ok().body(organizationFizService.update(organizationFiz))

    @ApiOperation("Удаление физ. лица")
    @PostMapping("/delete")
    fun delete(@ApiParam("Идентификатор") @RequestParam id: UUID) = organizationFizService.deleteById(id)

    @ApiOperation("Сохранение в задачу активти")
    @PostMapping("/saveInTask")
    fun saveInTask(@ApiParam("Номер задачи") @RequestParam taskId: String,
                   @ApiParam("Название переменной") @RequestParam variableName: String,
                   @ApiParam("Физ.лицо") @RequestBody organizationFiz: OrganizationFiz) =
            organizationFizService.saveInTask(taskId, variableName, organizationFiz)

}