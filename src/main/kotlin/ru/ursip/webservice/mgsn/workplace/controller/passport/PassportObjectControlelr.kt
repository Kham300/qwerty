package ru.ursip.webservice.mgsn.workplace.controller.passport

import io.swagger.annotations.Api
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObjectProjection
import ru.ursip.webservice.mgsn.workplace.service.passport.PassportObjectService

@Api(tags = ["Работа с паспортами объектов"])
@RestController
@RequestMapping("v1/passportObj", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@CrossOrigin
class PassportObjectControlelr(val passportObjectService: PassportObjectService) {

    @GetMapping("/getAll")
    fun getAll(@PageableDefault pageable: Pageable): List<PassportObjectProjection> =
            passportObjectService.getAllProjection(pageable)
}