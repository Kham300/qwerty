package ru.ursip.webservice.mgsn.workplace.model.organistion

import au.com.console.jpaspecificationdsl.and
import au.com.console.jpaspecificationdsl.like
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import org.springframework.data.jpa.domain.Specifications
import java.io.Serializable
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@ApiModel("Физ. лица")
@Entity
@Table(name = "organization_fiz", schema = "documents")
data class OrganizationFiz(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @ApiModelProperty("Идентификатор")
        var id: UUID? = null,

        @ApiModelProperty("Организационная форма")
        var orgForm: String? = null,

        @ApiModelProperty("Фамилия")
        var lastName: String? = null,

        @ApiModelProperty("Имя")
        var firstName: String? = null,

        @ApiModelProperty("Отчество")
        var middleName: String? = null,

        @ApiModelProperty("Полное наименование ")
        var orgNameFull: String? = null,

        @ApiModelProperty("Краткое наименование")
        var orgNameShort: String? = null,

        @ApiModelProperty("Дата рождения")
        var birthDate: String? = null,

        @ApiModelProperty("СНИЛС")
        var snils: String? = null,

        @ApiModelProperty("ИНН")
        var orgInn: String? = null,

        @ApiModelProperty("Фактический адрес")
        var orgAddressFact: String? = null,

        @ApiModelProperty("Номер свидетельства о допуске к работам")
        var workToleranceNum: String? = null,

        @ApiModelProperty("Дата свидетельства о допуске к работам")
        var workToleranceDate: LocalDate? = null,

        @ApiModelProperty("Пол")
        var sex: String? = null,

        @ApiModelProperty("Серия паспорта")
        var passportSer: String? = null,

        @ApiModelProperty("Номер паспорта")
        var passportNum: String? = null,

        @ApiModelProperty("Дата выдачи паспорта")
        var passportDate: LocalDate? = null,

        @ApiModelProperty("Кем выдан")
        var passportIssue: String? = null,

        @ApiModelProperty("Место рождения")
        var birthPlace: String? = null,

        @ApiModelProperty("Адрес регистрации")
        var orgAddressPost: String? = null,

        @ApiModelProperty("Адрес регистрации (КЛАДР)")
        var KLADRAddressPost: String? = null,

        @ApiModelProperty("Код (КЛАДР)")
        var kladrCode: String? = null,

        @ApiModelProperty("Телефон/ факс")
        var orgPhone: String? = null,

        @ApiModelProperty("Адрес электронной почты")
        var orgEmail: String? = null,

        @ApiModelProperty("Идентификатор заявителя ИСИ")
        var orgPguId: String? = null,

        @ApiModelProperty("Признак удаления")
        var isTrash: Boolean? = null,

        @ApiModelProperty("Признак аннулирования")
        var isCanceled: Boolean? = null,

        @ApiModelProperty("ID запроса в БР")
        var RequestId: String? = null,

        @ApiModelProperty("Дата отправки запроса в БР")
        var requestDate: LocalDate? = null,

        @ApiModelProperty("Кто отправил запрос в БР")
        var requestSpecialistFio: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР (id)")
        var requestSpecialistNorm: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР (должность)")
        var requestSpecialistPosition: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР (подразделение)")
        var requestSpecialistDepartment: String? = null,

        @ApiModelProperty("Дата последнего ответа из БР")
        var requestStatusDate: LocalDate? = null,

        @ApiModelProperty("Статус последнего по дате запроса документа")
        var requestStatus: String? = null,

        @ApiModelProperty("Комментарий к последнему статусу запроса")
        var requestStatusComment: String? = null,

        @ApiModelProperty("Дата начала действия")
        var orgStartDate: String? = null,

        @ApiModelProperty("Дата окончания действия")
        var orgendDate: LocalDate? = null,

        @ApiModelProperty("Является вышестоящей")
        var orgHigher: String? = null,

        @ApiModelProperty("Организация")
        var orgNameNorm: String? = null
) : Serializable

/**
 * Проекция физ. лица для других модулей
 */
data class OrganizationFizExternal(
        var orgNameFull: String? = null,
        var orgInn: String? = null,
        var snils: String? = null
)

/**
 * Проекция физ. лица для витрины
 */
data class OrganizationFizProjection(
        var orgNameNorm: String? = null,
        var orgInn: String? = null,
        var snils: String? = null,
        var passportSer: String? = null,
        var passportNum: String? = null,
        var orgAddressFact: String? = null,
        var orgAddressPost: String? = null
)

fun OrganizationFizProjection.toSpecification(): Specifications<OrganizationFiz> = and(
        orgNameNorm?.let { OrganizationFiz::orgNameNorm.like("%$it%") },
        orgInn?.let { OrganizationFiz::orgInn.like("%$it%") },
        snils?.let { OrganizationFiz::snils.like("%$it%") },
        passportSer?.let { OrganizationFiz::passportSer.like("%$it%") },
        passportNum?.let { OrganizationFiz::passportNum.like("%$it%") },
        orgAddressFact?.let { OrganizationFiz::orgAddressFact.like("%$it%") },
        orgAddressPost?.let { OrganizationFiz::orgAddressPost.like("%$it%") }
)

fun OrganizationFiz.toProjection(): OrganizationFizProjection = OrganizationFizProjection(
        orgNameNorm,
        orgInn,
        snils,
        passportSer,
        passportNum,
        orgAddressFact,
        orgAddressPost
)

fun OrganizationFiz.toExternal(): OrganizationFizExternal = OrganizationFizExternal(
        orgNameFull,
        orgInn,
        snils
)