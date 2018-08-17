package ru.ursip.webservice.mgsn.workplace.model.passport

import io.swagger.annotations.ApiModel
import ru.ursip.webservice.mgsn.workplace.model.passport.generated.PassportObject
import java.util.*
import javax.persistence.*

@Entity
@ApiModel("Организации")
@Table(name = "obj_organization", schema = "documents")
class ObjOrganization(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: UUID? = null,

        var passportId: UUID? = null,

        var orgRole: String? = null,

        var orgID: String? = null,

        var orgName: String? = null,

        var orgOGRN: String? = null,

        var orgINN: String? = null,

        var licenseNum: String? = null,

        var orgDogovor: String? = null,

        var orgPredstID: String? = null,

        var orgPredst: String? = null,

        var orgPrikaz: String? = null,

        var orgPredstKontrID: String? = null,

        var orgPredstKontr: String? = null,

        var orgPrikazKontr: String? = null
)

fun PassportObject.Organization.toDomainOrganization(passportId: UUID) = ObjOrganization(
        null,
        passportId,
        orgRole,
        orgID,
        orgName,
        orgOGRN,
        orgINN,
        licenseNum,
        orgDogovor,
        orgPredstID,
        orgPredst,
        orgPrikaz,
        orgPredstKontrID,
        orgPredstKontr,
        orgPrikazKontr
)

fun PassportObject.OrganizationAuthor.toDomainOrganization(passportId: UUID) = ObjOrganization(
        null,
        passportId,
        orgRole,
        orgID,
        orgName,
        null,
        null,
        licenseNum,
        orgDogovor,
        orgPredstID,
        orgPredst,
        orgPrikaz,
        orgPredstKontrID,
        orgPredstKontr,
        orgPrikazKontr
)

fun PassportObject.OrganizationBuilder.toDomainOrganization(passportId: UUID) = ObjOrganization(
        null,
        passportId,
        orgRole,
        orgID,
        orgName
)

fun PassportObject.OrganizationGeneral.toDomainOrganization(passportId: UUID) = ObjOrganization(
        null,
        passportId,
        orgRole,
        orgID,
        orgName,
        null,
        null,
        licenseNum,
        orgDogovor,
        orgPredstID,
        orgPredst,
        orgPrikaz,
        orgPredstKontrID,
        orgPredstKontr,
        orgPrikazKontr
)

fun PassportObject.OrganizationCustomer.toDomainOrganization(passportId: UUID) = ObjOrganization(
        null,
        passportId,
        orgRole,
        orgID,
        orgName,
        null,
        null,
        licenseNum,
        orgDogovor,
        orgPredstID,
        orgPredst,
        orgPrikaz,
        orgPredstKontrID,
        orgPredstKontr,
        orgPrikazKontr
)

fun PassportObject.OrganizationOperating.toDomainOrganization(passportId: UUID) = ObjOrganization(
        null,
        passportId,
        orgRole,
        orgID,
        orgName
)