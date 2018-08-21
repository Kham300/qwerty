package ru.ursip.webservice.mgsn.workplace.service

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import ru.ursip.webservice.mgsn.workplace.activiti.service.impl.TaskService

@SpringBootTest
@RunWith(SpringRunner::class)
class TaskServiceTest {

    @Autowired
    lateinit var taskService: TaskService

    @Test
    fun getAllTasks() {
        val allTasks = taskService.getAllTasks("Review profitability")
        print(allTasks)
    }
}