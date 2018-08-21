package ru.ursip.webservice.mgsn.workplace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import springfox.documentation.annotations.ApiIgnore

@SpringBootApplication(scanBasePackages = ["ru.ursip.webservice.mgsn.workplace"])
class WorkplaceApplication

fun main(args: Array<String>) {
    runApplication<WorkplaceApplication>(*args)
}

@RequestMapping(path = ["v1"], produces = ["application/json; charset=utf-8"])
@Controller
@CrossOrigin
@ApiIgnore
class ApiInfoController {

    /**
     * Редирект на страницу сваггера с /v1/
     */
    @GetMapping
    fun getInfo() =
            try {
                "redirect:/swagger-ui.html"
            } catch (ex: Exception) {
                ex.message
            }
}