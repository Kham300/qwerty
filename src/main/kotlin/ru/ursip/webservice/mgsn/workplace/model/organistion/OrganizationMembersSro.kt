package ru.ursip.webservice.mgsn.workplace.model.organistion

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@ApiModel("СРО")
@Entity
data class OrganizationMembersSro(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @ApiModelProperty("Идентификатор")
        var id: UUID? = null,

        @ApiModelProperty("Название СРО")
        var name: String? = null,

        @ApiModelProperty("Номер в реестре СРО")
        var memberNum: String? = null,

        @ApiModelProperty("Дата регистрации в СРО")
        var memberDate: LocalDate? = null,

        @ApiModelProperty("Дата выхода из СРО")
        var memberExitDate: LocalDate? = null,

        @ApiModelProperty("Идентификатор организации СРО")
        var sroId: UUID? = null,

        @ApiModelProperty("Идентификатор организации")
        var organizationId: UUID? = null
)
