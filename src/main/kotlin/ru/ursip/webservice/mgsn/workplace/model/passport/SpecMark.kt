package ru.ursip.webservice.mgsn.workplace.model.passport

import io.swagger.annotations.ApiModel
import java.util.*
import javax.persistence.*

@Entity
@ApiModel("Особые пометки")
@Table(name = "spec_mark", schema = "documents")
class SpecMark(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,
        var passportId: UUID? = null,
        var value: String? = null
)
