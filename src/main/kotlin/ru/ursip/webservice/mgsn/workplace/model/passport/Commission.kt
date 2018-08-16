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
@ApiModel("Комиссия")
class Commission(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,

        var passportId: UUID? = null,

        var komType: String? = null,

        var dateRealizationCommission: LocalDate? = null,

        var komNum: String? = null,

        var letterheadNum: String? = null,

        var outDate: LocalDate? = null,

        var dateRegistration: LocalDate? = null,

        var docNum: String? = null,

        var docDate: LocalDate? = null,

        var resNum: String? = null,

        var resDate: LocalDate? = null
)

fun PassportObject.Commission.toDomainCommission(passportId: UUID?) = Commission(
        null,
        passportId,
        komType,
        dateRealizationCommission?.toLocalDate(),
        komNum,
        letterheadNum,
        outDate?.toLocalDate(),
        dateRegistration?.toLocalDate(),
        docNum,
        docDate?.toLocalDate(),
        resNum,
        resDate?.toLocalDate()
)