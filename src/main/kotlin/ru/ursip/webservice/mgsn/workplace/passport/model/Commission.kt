package ru.ursip.webservice.mgsn.workplace.passport.model

import io.swagger.annotations.ApiModel
import ru.ursip.webservice.mgsn.workplace.passport.model.generated.PassportObject
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@ApiModel("Комиссия")
@Table(name = "commission", schema = "documents")
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