package ru.ursip.webservice.mgsn.workplace.service.activiti

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class ProcessDefinitionServiceImplTest {

    @Autowired
    lateinit var processDefinitionService: ProcessDefinitionService

    @Test
    fun getAll() {
        val all = processDefinitionService.getAll()
        print(all)
    }
}