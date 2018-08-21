package ru.ursip.webservice.mgsn.workplace.passport.model

import io.swagger.annotations.ApiModel
import ru.ursip.webservice.mgsn.workplace.passport.model.generated.PassportObject
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@ApiModel("Свидетельство о регистрации ОПО")
@Table(name = "opo_reg", schema = "documents")
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