package ru.ursip.webservice.mgsn.workplace.model.passport

import io.swagger.annotations.ApiModel
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ApiModel("История изменения инспектора в формате ФИО - УН - Распоряжение")
class ObjInspectorHistory(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,

        var passportId: UUID? = null,

        var value: String? = null
)
