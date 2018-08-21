package ru.ursip.webservice.mgsn.workplace.repository

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import org.springframework.test.context.junit4.SpringRunner
import ru.ursip.webservice.mgsn.workplace.passport.repository.PassportObjectDao

@SpringBootTest
@RunWith(SpringRunner::class)
class PassportObjectDaoTest {

    @Autowired
    lateinit var passportObjectDao: PassportObjectDao

    @Test
    fun getAll() {
        val all = passportObjectDao.getAllProjection(PageRequest(1, 10))
        print(all)
    }
}