package ru.ursip.webservice.mgsn.workplace.service

import io.kotlintest.shouldBe
import org.activiti.engine.TaskService
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional
import ru.ursip.webservice.mgsn.workplace.model.activiti.toRepresentation
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationFiz
import ru.ursip.webservice.mgsn.workplace.model.organistion.OrganizationFizProjection
import ru.ursip.webservice.mgsn.workplace.model.organistion.toExternal
import ru.ursip.webservice.mgsn.workplace.model.organistion.toProjection
import ru.ursip.webservice.mgsn.workplace.service.organisation.OrganizationFizService

@SpringBootTest
@RunWith(SpringRunner::class)
@Transactional
class OrganizationFizServiceImplTest {

    @Autowired
    lateinit var organizationFizService: OrganizationFizService

    @Autowired
    lateinit var taskService: TaskService

    @Before
    fun setUp() {
        TEST_ORGANIZATION_FIZ = organizationFizService.create(OrganizationFiz(lastName = "lastNameUpdate", firstName = "firstNameUpdate",
                middleName = "middleNameUpdate", orgInn = "uniqinnn"))
    }

    @After
    fun tearDown() {
        organizationFizService.deleteById(TEST_ORGANIZATION_FIZ.id!!)
    }

    @Test
    fun create() {
        val create = organizationFizService.create(TEST_ORGANIZATION_FIZ_NULL_ID)
        create.lastName.shouldBe(TEST_ORGANIZATION_FIZ_NULL_ID.lastName)
        create.firstName.shouldBe(TEST_ORGANIZATION_FIZ_NULL_ID.firstName)
        create.middleName.shouldBe(TEST_ORGANIZATION_FIZ_NULL_ID.middleName)
    }

    @Test
    fun update() {
        val organizationFiz = OrganizationFiz(TEST_ORGANIZATION_FIZ.id, lastName = "newName")
        val update = organizationFizService.update(organizationFiz)
        update.id.shouldBe(organizationFiz.id)
        update.lastName.shouldBe(organizationFiz.lastName)
        update.firstName.shouldBe(organizationFiz.firstName)
        update.middleName.shouldBe(organizationFiz.middleName)
    }

    @Test
    fun getAll() {
        val all = organizationFizService.getAll(OrganizationFizProjection(orgInn = "uniqinnn"), PageRequest.of(1, 10))
        all.content.contains(TEST_ORGANIZATION_FIZ)
    }

    @Test
    fun getAllProjection() {
        val all = organizationFizService.getAllProjection(OrganizationFizProjection(orgInn = "uniqinnn"), PageRequest.of(1, 10))
        all.content.contains(TEST_ORGANIZATION_FIZ.toProjection())
    }

    @Test
    fun getById() {
        val byId = organizationFizService.getById(TEST_ORGANIZATION_FIZ.id!!)
        byId!!.shouldBe(TEST_ORGANIZATION_FIZ)
    }

    @Test
    fun getAllExternal() {
        val all = organizationFizService.getAllExternal("uniqinnn", PageRequest.of(1, 10))
        all.contains(TEST_ORGANIZATION_FIZ.toExternal())
    }

    @Test
    fun deleteById() {
    }

    @Test
    fun saveInTask() {
        organizationFizService
                .saveInTask("132511", "orgJur", TEST_ORGANIZATION_FIZ)
        val tasks = taskService.createTaskQuery()
                .taskId("132511")
                .includeProcessVariables()
                .list().map { it.toRepresentation() }
        print(tasks)

    }
}

val TEST_ORGANIZATION_FIZ_NULL_ID = OrganizationFiz(lastName = "lastName", firstName = "firstName", middleName = "middleName")
lateinit var TEST_ORGANIZATION_FIZ: OrganizationFiz
