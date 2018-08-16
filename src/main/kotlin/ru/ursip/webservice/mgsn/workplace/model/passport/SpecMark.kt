package ru.ursip.webservice.mgsn.workplace.model.passport

import io.swagger.annotations.ApiModel
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ApiModel("Особые пометки")
class SpecMark(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,
        var passportId: UUID? = null,
        var value: String? = null
)
