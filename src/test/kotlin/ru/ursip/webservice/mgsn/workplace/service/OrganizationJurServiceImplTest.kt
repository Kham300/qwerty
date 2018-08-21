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
import ru.ursip.webservice.mgsn.workplace.activiti.model.toRepresentation
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationJur
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationJurProjection
import ru.ursip.webservice.mgsn.workplace.organisation.model.OrganizationMembersSro
import ru.ursip.webservice.mgsn.workplace.organisation.model.toProjection
import ru.ursip.webservice.mgsn.workplace.organisation.service.OrganizationJurService

@SpringBootTest
@RunWith(SpringRunner::class)
@Transactional
class OrganizationJurServiceImplTest {

    @Autowired
    lateinit var organizationJurService: OrganizationJurService

    @Autowired
    lateinit var taskService: TaskService

    @Before
    fun setUp() {
        TEST_ORGANIZATION_JUR = organizationJurService.create(OrganizationJur(orgForm = "form", orgInn = "innunique", sro = arrayListOf(OrganizationMembersSro(name = "name"))))
    }

    @After
    fun tearDown() {
        organizationJurService.deleteById(TEST_ORGANIZATION_JUR.id!!)
    }

    @Test
    fun create() {
        val create = organizationJurService.create(TEST_ORGANIZATION_JUR_NULL_ID)
        val byId = organizationJurService.getById(create.id!!)!!
        byId.orgForm.shouldBe(TEST_ORGANIZATION_JUR_NULL_ID.orgForm)
        byId.orgInn.shouldBe(TEST_ORGANIZATION_JUR_NULL_ID.orgInn)
    }

    @Test
    fun update() {
        val organizationJur = OrganizationJur(TEST_ORGANIZATION_JUR.id, orgForm = "newForm", sro = arrayListOf(OrganizationMembersSro(name = "newName")))
        val update = organizationJurService.update(organizationJur)
        val byId = organizationJurService.getById(update.id!!)!!
        update.orgForm.shouldBe(byId.orgForm)
        update.orgInn.shouldBe(byId.orgInn)
        update.sro.shouldBe(byId.sro)
    }

    @Test
    fun getAll() {
        val all = organizationJurService.getAll(OrganizationJurProjection(orgInn = "innunique"), PageRequest.of(1, 10))
        all.contains(TEST_ORGANIZATION_JUR)
    }

    @Test
    fun getAllProjection() {
        val all = organizationJurService.getAllProjection(OrganizationJurProjection(orgInn = "innunique"), PageRequest.of(1, 10))
        all.contains(TEST_ORGANIZATION_JUR.toProjection())
    }

    @Test
    fun getById() {
        val byId = organizationJurService.getById(TEST_ORGANIZATION_JUR.id!!)
        byId.shouldBe(TEST_ORGANIZATION_JUR)
    }

    @Test
    fun deleteById() {
    }

    @Test
    fun saveInTask() {
        organizationJurService.saveInTask("132511", "orgJur", TEST_ORGANIZATION_JUR)
        val tasks = taskService.createTaskQuery()
                .taskId("132511")
                .includeProcessVariables()
                .list().map { it.toRepresentation() }
        print(tasks)

    }
}

val TEST_ORGANIZATION_JUR_NULL_ID = OrganizationJur(orgForm = "form", orgInn = "inn", sro = arrayListOf(OrganizationMembersSro(name = "name")))
lateinit var TEST_ORGANIZATION_JUR: OrganizationJur