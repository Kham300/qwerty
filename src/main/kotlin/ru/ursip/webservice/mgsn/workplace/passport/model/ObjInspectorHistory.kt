package ru.ursip.webservice.mgsn.workplace.passport.model

import io.swagger.annotations.ApiModel
import java.util.*
import javax.persistence.*

@Entity
@ApiModel("История изменения инспектора в формате ФИО - УН - Распоряжение")
@Table(name = "obj_inspector_history", schema = "documents")
class ObjInspectorHistory(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,

        var passportId: UUID? = null,

        var value: String? = null
)
