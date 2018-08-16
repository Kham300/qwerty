package ru.ursip.webservice.mgsn.workplace.model.passport

import io.swagger.annotations.ApiModel
import ru.ursip.webservice.mgsn.workplace.model.passport.generated.PassportObject
import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ApiModel("Свидетельство о регистрации ОПО")
class OpoReg(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,

        var passportId: UUID? = null,

        var opoRegNum: String? = null,

        var opoRegDate: LocalDate? = null
)

fun PassportObject.OpoReg.toDomainOpoReg(passportId: UUID) = OpoReg(
        null,
        passportId,
        opoRegNum,
        opoRegDate?.toLocalDate()
)