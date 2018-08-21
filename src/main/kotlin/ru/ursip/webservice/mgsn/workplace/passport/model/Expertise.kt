package ru.ursip.webservice.mgsn.workplace.passport.model

import io.swagger.annotations.ApiModel
import ru.ursip.webservice.mgsn.workplace.passport.model.generated.PassportObject
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@ApiModel("Заключение экспертизы")
@Table(name = "expertise", schema = "documents")
class Expertise(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,

        var passportId: UUID? = null,

        var expNum: String? = null,

        var expDate: LocalDate? = null,

        var expInfo: String? = null,

        var expOrg: String? = null,

        var expAccredNum: String? = null,

        @Enumerated(EnumType.STRING)
        var type: ExpType? = null
)

enum class ExpType {
    GovernmentExp, NonGovernmentExp, EcologicalExp
}

fun PassportObject.GovernmentExp.toDomainExpertise(passportId: UUID?) = Expertise(
        null,
        passportId,
        expNum,
        expDate?.toLocalDate(),
        expInfo,
        type = ExpType.GovernmentExp
)

fun PassportObject.NonGovernmentExp.toDomainExpertise(passportId: UUID?) = Expertise(
        null,
        passportId,
        expNum,
        expDate?.toLocalDate(),
        null,
        expOrg,
        expAccredNum,
        ExpType.NonGovernmentExp
)

fun PassportObject.EcologicalExp.toDomainExpertise(passportId: UUID?) = Expertise(
        null,
        passportId,
        expNum,
        expDate?.toLocalDate(),
        expInfo,
        type = ExpType.EcologicalExp
)