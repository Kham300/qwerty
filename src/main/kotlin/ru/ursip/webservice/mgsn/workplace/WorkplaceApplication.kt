package ru.ursip.webservice.mgsn.workplace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["ru.ursip.webservice.mgsn.workplace"])
class WorkplaceApplication

fun main(args: Array<String>) {
    runApplication<WorkplaceApplication>(*args)
}