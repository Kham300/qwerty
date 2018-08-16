package ru.ursip.webservice.mgsn.workplace.model.organistion

import au.com.console.jpaspecificationdsl.and
import au.com.console.jpaspecificationdsl.like
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import org.springframework.data.jpa.domain.Specifications
import java.time.LocalDate
import java.util.*
import javax.persistence.*

@ApiModel("Юр. лица")
@Entity
data class OrganizationJur(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @ApiModelProperty("Идентификатор")
        var id: UUID? = null,

        @ApiModelProperty("Организационная форма")
        var orgForm: String? = null,

        @ApiModelProperty("Код ОПФ по ЕГРЮЛ")
        var egrulOrgFormCode: String? = null,

        @ApiModelProperty("Статус организации")
        var orgStatus: String? = null,

        @ApiModelProperty("ОФП по ЕГРЮЛ")
        var egrulOrgForm: String? = null,

        @ApiModelProperty("Организационно-правовая форма")
        var orgFormShort: String? = null,

        @ApiModelProperty("Полное наименование по ЕГРЮЛ")
        var egrulOrgNameFull: String? = null,

        @ApiModelProperty("Полное наименование")
        var orgNameFull: String? = null,

        @ApiModelProperty("Краткое наименование по ЕГРЮЛ")
        var egrulOrgNameShort: String? = null,

        @ApiModelProperty("Краткое наименование")
        var orgNameShort: String? = null,

        @ApiModelProperty("Фирменное наименование по ЕГРЮЛ")
        var egrulOrgNameBrand: String? = null,

        @ApiModelProperty("Прежнее наименование")
        var orgNameFullOld: String? = null,

        @ApiModelProperty("Дата рождения")
        var birthDate: LocalDate? = null,

        @ApiModelProperty("Место рождения")
        var birthPlace: String? = null,

        @ApiModelProperty("Юридический адрес")
        var orgAddressLegal: String? = null,

        @ApiModelProperty("Почтовый адрес ")
        var orgAddressPost: String? = null,

        @ApiModelProperty("Почтовый адрес (КЛАДР)")
        var kladrAddressPost: String? = null,

        @ApiModelProperty("Код (КЛАДР)")
        var kladrCode: String? = null,

        @ApiModelProperty("Фактический адрес")
        var orgAddressFact: String? = null,

        @ApiModelProperty("ИНН")
        var orgInn: String? = null,

        @ApiModelProperty("ОГРН")
        var orgOgrn: String? = null,

        @ApiModelProperty("КПП")
        var orgKpp: String? = null,

        @ApiModelProperty("ОКПО")
        var orgOkpo: String? = null,

        @ApiModelProperty("Свидетельство о гос.регистрации №")
        var gosRegNum: String? = null,

        @ApiModelProperty("Дата")
        var gosRegDate: LocalDate? = null,

        @ApiModelProperty("Является субъектом малого предпринимательства")
        var isSmallBusiness: Boolean? = null,

        @ApiModelProperty("Дата внесения сведений в ЕР СМиСП")
        var smispDate: LocalDate? = null,

        @ApiModelProperty("Вышестоящая организация (id)")
        var headOrgID: String? = null,

        @ApiModelProperty("Вышестоящая организация (наименование)")
        var headOrgName: String? = null,

        @ApiModelProperty("Является членом НП СРО")
        var nameSroId: String? = null,

        @ApiModelProperty("Отношение к СРО")
        var sroAttitude: String? = null,

        @ApiModelProperty("Номер в госреестре СРО")
        var sroRegNum: String? = null,

        @ApiModelProperty("Дата включения в реестр ")
        var sroRegDate: LocalDate? = null,

        @ApiModelProperty("Дата исключения из реестра ")
        var sroExpiryDate: LocalDate? = null,

        @ApiModelProperty("Примечание")
        var comment: String? = null,

        @ApiModelProperty("Телефон/ факс")
        var orgPhone: String? = null,

        @ApiModelProperty("Адрес электронной почты")
        var orgEmail: String? = null,

        @ApiModelProperty("Наименование банка")
        var theNameOfBank: String? = null,

        @ApiModelProperty("БИК")
        var bankBik: String? = null,

        @ApiModelProperty("Кор.счет")
        var bankCorAc: String? = null,

        @ApiModelProperty("Расчётный счет")
        var bankSetAc: String? = null,

        @ApiModelProperty("Адрес банка")
        var theAddressOfBank: String? = null,

        @ApiModelProperty("ФИО")
        var headFio: String? = null,

        @ApiModelProperty("Должность")
        var headPost: String? = null,

        @ApiModelProperty("Идентификатор заявителя ИСИ")
        var OrgPguId: String? = null,

        @ApiModelProperty("Признак удаления")
        var isTrash: Boolean? = null,

        @ApiModelProperty("Признак аннулирования ")
        var isCanceled: Boolean? = null,

        @ApiModelProperty("ID запроса в БР")
        var requestId: String? = null,

        @ApiModelProperty("Дата отправки запроса в БР")
        var requestDate: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР")
        var requestSpecialistFio: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР (id)")
        var requestSpecialistNorm: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР (должность)")
        var requestSpecialistPosition: String? = null,

        @ApiModelProperty("Кто отправил запрос в БР (подразделение)")
        var requestspecialistDepartment: String? = null,

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
        var orgNameNorm: String? = null,

        @ApiModelProperty("Руководитель")
        var orgHead: String? = null,

        @ApiModelProperty("СРО")
        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "organizationId")
        var sro: MutableList<OrganizationMembersSro>? = null
)

/**
 * Проекция юр. лица для витрины
 */
data class OrganizationJurProjection(
        var orgNameNorm: String? = null,
        var orgHead: String? = null,
        var orgInn: String? = null,
        var orgOgrn: String? = null,
        var orgAddressLegal: String? = null,
        var orgAddressPost: String? = null
)

fun OrganizationJurProjection.toSpecification(): Specifications<OrganizationJur> = and(
        orgNameNorm?.let { OrganizationJur::orgNameNorm.like("%$it%") },
        orgInn?.let { OrganizationJur::orgInn.like("%$it%") },
        orgHead?.let { OrganizationJur::orgHead.like("%$it%") },
        orgOgrn?.let { OrganizationJur::orgOgrn.like("%$it%") },
        orgAddressLegal?.let { OrganizationJur::orgAddressLegal.like("%$it%") },
        orgAddressPost?.let { OrganizationJur::orgAddressPost.like("%$it%") }
)


fun OrganizationJur.toProjection(): OrganizationJurProjection = OrganizationJurProjection(
        orgNameNorm,
        orgHead,
        orgInn,
        orgOgrn,
        orgAddressLegal,
        orgAddressPost
)