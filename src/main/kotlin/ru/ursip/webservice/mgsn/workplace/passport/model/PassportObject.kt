package ru.ursip.webservice.mgsn.workplace.passport.model

import io.swagger.annotations.ApiModel
import ru.ursip.webservice.mgsn.workplace.passport.model.generated.DocData
import java.time.LocalDate
import java.util.*
import javax.persistence.*
import javax.xml.datatype.XMLGregorianCalendar

@Entity
@ApiModel("Паспорт объекта")
@Table(name = "passport_object", schema = "documents")
class PassportObject(
        @Id
        var id: UUID? = null,

        var isArchive: Boolean? = null,

        var deloNum: String? = null,

        var dbType: String? = null,

        var inArchiveReason: String? = null,

        var inArchiveReasonAdd: String? = null,

        var inArchiveDate: LocalDate? = null,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "passportId")
        var specMark: Set<SpecMark>? = null,

        var constrState: String? = null,

        var mapHTMLLong: String? = null,

        var mapObjID: String? = null,

        var mapRegParams: String? = null,

        var objAddress: String? = null,

        var dcStreet: String? = null,

        var dcStreetLaw: String? = null,

        var dcRegionMassBuild: String? = null,

        var dcMicroDistrict: String? = null,

        var dcBlok: String? = null,

        var dcHouse: String? = null,

        var dcHouseNum: String? = null,

        var dcFlat: String? = null,

        var dcFlatNum: String? = null,

        var dcAddrLandmark: String? = null,

        var dcAddressComment: String? = null,

        var allDistPrefect: String? = null,

        var dcPrefect: String? = null,

        var dcDist: String? = null,

        var dcSelectViewAdr: String? = null,

        var buildStartDate: LocalDate? = null,

        var buildEndDate: LocalDate? = null,

        var constractPOSDate: String? = null,

        var numberOrder: String? = null,

        var objName: String? = null,

        var objTotalArea: String? = null,

        var objLength: String? = null,

        var objFloor: String? = null,

        var responsibilityLevel: String? = null,

        var objkod: String? = null,

        var objCategoriesBuild: String? = null,

        var stageBuilding: String? = null,

        var nfoCode: String? = null,

        var fnoCode: String? = null,

        var fnoName: String? = null,

        var fnoSubgroupCode: String? = null,

        var fnoGroupCode: String? = null,

        var parentName: String? = null,

        var typeBuild: String? = null,

        var objProjektSeries: String? = null,

        var powerName: String? = null,

        var powerValue: String? = null,

        var metricUnitsName: String? = null,

        var objFinSourse: String? = null,

        var frontSystem: String? = null,

        var objInspector: String? = null,

        var objInspectorDep: String? = null,

        var objInspectorPosition: String? = null,

        var objInspectorOrder: String? = null,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "passportId")
        var objInspectorHistory: Set<ObjInspectorHistory>? = null,

        var objComment: String? = null,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "passportId")
        var objOrganization: Set<ObjOrganization>? = null,

        var objSMR: Int? = null,

        var objOPO: Int? = null,

        var objEO: Int? = null,

        var objGPR: Int? = null,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "passportId")
        var opoReg: Set<OpoReg>? = null,

        var isNoReestr: Int? = null,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "passportId")
        var expertise: Set<Expertise>? = null,

        var projectPresentRem: String? = null,

        var projectPresentFl: Boolean? = null,

        var apo: String? = null,

        var ops: String? = null,

        var sen: String? = null,

        var ogpn: String? = null,

        var axAct: String? = null,

        var axActRem: String? = null,

        var objHandOver: String? = null,

        var objHandOverDate: LocalDate? = null,

        var objPostAddress: String? = null,

        var objAdrStrGK: String? = null,

        var objAdrStrGKYur: String? = null,

        var objAdrHouseGK: String? = null,

        var objAdrKorpGK: String? = null,

        var factPowerValue: String? = null,

        var objCritRem: String? = null,

        var fio: String? = null,

        var department: String? = null,

        var objCritRemove: String? = null,

        var objCritRemoveDate: LocalDate? = null,

        var objCritRemoveRem: String? = null,

        @OneToMany(cascade = [CascadeType.ALL])
        @JoinColumn(name = "passportId")
        var commission: Set<Commission>? = null,

        var rcNum: String? = null,

        var rcDate: LocalDate? = null,

        var rcActNum: String? = null,

        var rcActDate: LocalDate? = null,

        var projCharact: String? = null
)

data class PassportObjectProjection(
        var id: UUID? = null,
        var objFinSourse: String? = null,
        var deloNum: String? = null,
        var objAddress: String? = null,
        var allDistPrefect: String? = null,
        var objName: String? = null,
        var orgName: String? = null,
        var buildStartDate: LocalDate? = null,
        var buildEndDate: LocalDate? = null,
        var constrState: String? = null
)

fun DocData.toDomainPassportObject(): PassportObject? {
    var passportObject: PassportObject? = null
    docContent.apply {
        val id = objID.toUUID()

        val domainOrganistions = organization?.map { it.toDomainOrganization(id) }?.toMutableSet()
        organizationAuthor?.let { domainOrganistions?.add(it.toDomainOrganization(id)) }
        organizationBuilder?.let { domainOrganistions?.add(it.toDomainOrganization(id)) }
        organizationCustomer?.let { domainOrganistions?.add(it.toDomainOrganization(id)) }
        organizationGeneral?.let { domainOrganistions?.add(it.toDomainOrganization(id)) }
        organizationOperating?.let { domainOrganistions?.add(it.toDomainOrganization(id)) }

        val domainExpertise = governmentExp.map { it.toDomainExpertise(id) }.toMutableSet()
        domainExpertise.addAll(nonGovernmentExp.map { it.toDomainExpertise(id) })
        domainExpertise.addAll(ecologicalExp.map { it.toDomainExpertise(id) })

        passportObject = PassportObject(
                id,
                isIsArchive,
                deloNum,
                dbType,
                inArchiveReason,
                inArchiveReasonAdd,
                inArchiveDate?.toLocalDate(),
                specMark?.map { SpecMark(null, id, it) }?.toSet(),
                constrState,
                mapHTMLLong,
                mapObjID,
                mapRegParams,
                objAddress?.objAddress,
                objAddress?.dcStreet,
                objAddress?.dcStreetLaw,
                objAddress?.dcRegionMassBuild,
                objAddress?.dcMicroDistrict,
                objAddress?.dcBlok,
                objAddress?.dcHouse,
                objAddress?.dcHouseNum,
                objAddress?.dcFlat,
                objAddress?.dcFlatNum,
                objAddress?.dcAddrLandmark,
                objAddress?.dcAddressComment,
                objAddress?.allDistPrefect,
                objAddress?.dcDistPrefect?.singleOrNull()?.dcPrefect,
                objAddress?.dcDistPrefect?.singleOrNull()?.dcDist,
                objAddress?.dcSelectViewAdr,
                buildStartDate?.toLocalDate(),
                buildEndDate?.toLocalDate(),
                constractPOSDate,
                numberOrder,
                objName,
                objTotalArea,
                objLength,
                objFloor,
                responsibilityLevel,
                objkod,
                objCategoriesBuild,
                stageBuilding,
                nfoCode,
                fno?.fnoCode,
                fno?.fnoName,
                fno?.fnoSubgroupCode,
                fno?.fnoGroupCode,
                parentName,
                typeBuild,
                objProjektSeries,
                powerName,
                powerValue,
                metricUnitsName,
                objFinSourse,
                frontSystem,
                objInspector,
                objInspectorDep,
                objInspectorPosition,
                objInspectorOrder,
                objInspectorHistory?.map { ObjInspectorHistory(null, id, it) }?.toSet(),
                objComment,
                domainOrganistions,
                objCat?.objSMR?.toInt(),
                objCat?.objOPO?.toInt(),
                objCat?.objEO?.toInt(),
                objCat?.objGPR?.toInt(),
                opoReg?.map { it.toDomainOpoReg(id) }?.toSet(),
                isNoReestr?.toInt(),
                domainExpertise,
                projectPresentRem,
                isProjectPresentFl,
                apo,
                ops,
                sen,
                ogpn,
                axAct,
                axActRem,
                objHandOver,
                objHandOverDate?.toLocalDate(),
                objPostAddress,
                objAdrStrGK,
                objAdrStrGKYur,
                objAdrHouseGK,
                objAdrKorpGK,
                factPowerValue,
                objCritRem,
                fio,
                department,
                objCritRemove,
                objCritRemoveDate?.toLocalDate(),
                objCritRemoveRem,
                commission?.map { it.toDomainCommission(id) }?.toSet(),
                rcNum,
                rcDate?.toLocalDate(),
                rcActNum,
                rcActDate?.toLocalDate(),
                projCharact
        )
    }
    return passportObject
}

fun XMLGregorianCalendar.toLocalDate() = toGregorianCalendar().toZonedDateTime().toLocalDate()

fun String.toUUID() = UUID.fromString(this.replaceFirst(
        Regex("(.{8})(.{4})(.{4})(.{4})(.{12})"),
        "$1-$2-$3-$4-$5"))