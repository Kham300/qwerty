
package ru.ursip.webservice.mgsn.workplace.model.passport.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * �������� ��� ��������� ������� �������
 * 
 * <p>Java class for PassportObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassportObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ObjID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeloNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InArchiveReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InArchiveReasonAdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InArchiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SpecMark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConstrState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapHTMLLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapObjID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapRegParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjAddress" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ObjAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_Street_Law" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_RegionMassBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_MicroDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_Blok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_House" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_House_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_Flat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_Flat_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_AddrLandmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_AddressComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="All_Dist_Prefect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DC_Dist_Prefect" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DC_Prefect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DC_Dist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DCSelectViewAdr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BuildStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BuildEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConstractPOSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjTotalArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjFloor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsibilityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Objkod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjCategoriesBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StageBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NFOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FNO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FNOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FNOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FNOSubgroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FNOGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjProjektSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PowerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PowerValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetricUnitsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjFinSourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Front_System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjInspector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjInspectorDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjInspectorPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjInspectorOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjInspectorHistory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObjComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgOGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrganizationBuilder" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrganizationGeneral" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrganizationCustomer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrganizationAuthor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrganizationOperating" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ObjCat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ObjSMR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ObjOPO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ObjEO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ObjGPR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OpoReg" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OpoRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OpoRegDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsNoReestr" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GovernmentExp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ExpInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NonGovernmentExp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ExpOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpAccredNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EcologicalExp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ExpInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProjectPresentRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectPresentFl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="APO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OGPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AxAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AxActRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjHandOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjHandOverDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ObjPostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjAdrStrGK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjAdrStrGKYur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjAdrHouseGK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjAdrKorpGK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FactPowerValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjCritRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjCritRemove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjCritRemoveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ObjCritRemoveRem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commission" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DateRealizationCommission" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="KomNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Letterhead_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OutDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="Date_Registration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="ResNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ResDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RCNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RCActNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCActDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProjCharact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassportObject", namespace = "http://xmlns.oracle.com/MSG_PassportObject", propOrder = {
    "isArchive",
    "objID",
    "deloNum",
    "dbType",
    "inArchiveReason",
    "inArchiveReasonAdd",
    "inArchiveDate",
    "specMark",
    "constrState",
    "mapHTMLLong",
    "mapObjID",
    "mapRegParams",
    "objAddress",
    "buildStartDate",
    "buildEndDate",
    "constractPOSDate",
    "numberOrder",
    "objName",
    "objTotalArea",
    "objLength",
    "objFloor",
    "responsibilityLevel",
    "objkod",
    "objCategoriesBuild",
    "stageBuilding",
    "nfoCode",
    "fno",
    "parentName",
    "typeBuild",
    "objProjektSeries",
    "powerName",
    "powerValue",
    "metricUnitsName",
    "objFinSourse",
    "frontSystem",
    "objInspector",
    "objInspectorDep",
    "objInspectorPosition",
    "objInspectorOrder",
    "objInspectorHistory",
    "objComment",
    "organization",
    "organizationBuilder",
    "organizationGeneral",
    "organizationCustomer",
    "organizationAuthor",
    "organizationOperating",
    "objCat",
    "opoReg",
    "isNoReestr",
    "governmentExp",
    "nonGovernmentExp",
    "ecologicalExp",
    "projectPresentRem",
    "projectPresentFl",
    "apo",
    "ops",
    "sen",
    "ogpn",
    "axAct",
    "axActRem",
    "objHandOver",
    "objHandOverDate",
    "objPostAddress",
    "objAdrStrGK",
    "objAdrStrGKYur",
    "objAdrHouseGK",
    "objAdrKorpGK",
    "factPowerValue",
    "objCritRem",
    "fio",
    "department",
    "objCritRemove",
    "objCritRemoveDate",
    "objCritRemoveRem",
    "commission",
    "rcNum",
    "rcDate",
    "rcActNum",
    "rcActDate",
    "projCharact"
})
public class PassportObject {

    @XmlElement(namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected Boolean isArchive;
    @XmlElement(name = "ObjID", namespace = "http://xmlns.oracle.com/MSG_PassportObject", required = true)
    protected String objID;
    @XmlElement(name = "DeloNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String deloNum;
    @XmlElement(name = "DBType", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String dbType;
    @XmlElement(name = "InArchiveReason", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String inArchiveReason;
    @XmlElement(name = "InArchiveReasonAdd", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String inArchiveReasonAdd;
    @XmlElement(name = "InArchiveDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inArchiveDate;
    @XmlElement(name = "SpecMark", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<String> specMark;
    @XmlElement(name = "ConstrState", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String constrState;
    @XmlElement(name = "MapHTMLLong", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String mapHTMLLong;
    @XmlElement(name = "MapObjID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String mapObjID;
    @XmlElement(name = "MapRegParams", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String mapRegParams;
    @XmlElement(name = "ObjAddress", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.ObjAddress objAddress;
    @XmlElement(name = "BuildStartDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buildStartDate;
    @XmlElement(name = "BuildEndDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buildEndDate;
    @XmlElement(name = "ConstractPOSDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String constractPOSDate;
    @XmlElement(name = "NumberOrder", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String numberOrder;
    @XmlElement(name = "ObjName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objName;
    @XmlElement(name = "ObjTotalArea", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objTotalArea;
    @XmlElement(name = "ObjLength", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objLength;
    @XmlElement(name = "ObjFloor", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objFloor;
    @XmlElement(name = "ResponsibilityLevel", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String responsibilityLevel;
    @XmlElement(name = "Objkod", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objkod;
    @XmlElement(name = "ObjCategoriesBuild", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objCategoriesBuild;
    @XmlElement(name = "StageBuilding", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String stageBuilding;
    @XmlElement(name = "NFOCode", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String nfoCode;
    @XmlElement(name = "FNO", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.FNO fno;
    @XmlElement(name = "ParentName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String parentName;
    @XmlElement(name = "TypeBuild", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String typeBuild;
    @XmlElement(name = "ObjProjektSeries", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objProjektSeries;
    @XmlElement(name = "PowerName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String powerName;
    @XmlElement(name = "PowerValue", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String powerValue;
    @XmlElement(name = "MetricUnitsName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String metricUnitsName;
    @XmlElement(name = "ObjFinSourse", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objFinSourse;
    @XmlElement(name = "Front_System", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String frontSystem;
    @XmlElement(name = "ObjInspector", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objInspector;
    @XmlElement(name = "ObjInspectorDep", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objInspectorDep;
    @XmlElement(name = "ObjInspectorPosition", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objInspectorPosition;
    @XmlElement(name = "ObjInspectorOrder", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objInspectorOrder;
    @XmlElement(name = "ObjInspectorHistory", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<String> objInspectorHistory;
    @XmlElement(name = "ObjComment", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objComment;
    @XmlElement(name = "Organization", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<PassportObject.Organization> organization;
    @XmlElement(name = "OrganizationBuilder", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.OrganizationBuilder organizationBuilder;
    @XmlElement(name = "OrganizationGeneral", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.OrganizationGeneral organizationGeneral;
    @XmlElement(name = "OrganizationCustomer", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.OrganizationCustomer organizationCustomer;
    @XmlElement(name = "OrganizationAuthor", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.OrganizationAuthor organizationAuthor;
    @XmlElement(name = "OrganizationOperating", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.OrganizationOperating organizationOperating;
    @XmlElement(name = "ObjCat", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected PassportObject.ObjCat objCat;
    @XmlElement(name = "OpoReg", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<PassportObject.OpoReg> opoReg;
    @XmlElement(name = "IsNoReestr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected BigInteger isNoReestr;
    @XmlElement(name = "GovernmentExp", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<PassportObject.GovernmentExp> governmentExp;
    @XmlElement(name = "NonGovernmentExp", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<PassportObject.NonGovernmentExp> nonGovernmentExp;
    @XmlElement(name = "EcologicalExp", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<PassportObject.EcologicalExp> ecologicalExp;
    @XmlElement(name = "ProjectPresentRem", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String projectPresentRem;
    @XmlElement(name = "ProjectPresentFl", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected Boolean projectPresentFl;
    @XmlElement(name = "APO", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String apo;
    @XmlElement(name = "OPS", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String ops;
    @XmlElement(name = "SEN", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String sen;
    @XmlElement(name = "OGPN", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String ogpn;
    @XmlElement(name = "AxAct", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String axAct;
    @XmlElement(name = "AxActRem", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String axActRem;
    @XmlElement(name = "ObjHandOver", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objHandOver;
    @XmlElement(name = "ObjHandOverDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objHandOverDate;
    @XmlElement(name = "ObjPostAddress", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objPostAddress;
    @XmlElement(name = "ObjAdrStrGK", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objAdrStrGK;
    @XmlElement(name = "ObjAdrStrGKYur", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objAdrStrGKYur;
    @XmlElement(name = "ObjAdrHouseGK", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objAdrHouseGK;
    @XmlElement(name = "ObjAdrKorpGK", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objAdrKorpGK;
    @XmlElement(name = "FactPowerValue", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String factPowerValue;
    @XmlElement(name = "ObjCritRem", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objCritRem;
    @XmlElement(name = "FIO", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String fio;
    @XmlElement(name = "Department", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String department;
    @XmlElement(name = "ObjCritRemove", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objCritRemove;
    @XmlElement(name = "ObjCritRemoveDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objCritRemoveDate;
    @XmlElement(name = "ObjCritRemoveRem", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String objCritRemoveRem;
    @XmlElement(name = "Commission", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected List<PassportObject.Commission> commission;
    @XmlElement(name = "RCNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String rcNum;
    @XmlElement(name = "RCDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rcDate;
    @XmlElement(name = "RCActNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String rcActNum;
    @XmlElement(name = "RCActDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rcActDate;
    @XmlElement(name = "ProjCharact", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
    protected String projCharact;

    /**
     * Gets the value of the isArchive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchive() {
        return isArchive;
    }

    /**
     * Sets the value of the isArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchive(Boolean value) {
        this.isArchive = value;
    }

    /**
     * Gets the value of the objID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjID() {
        return objID;
    }

    /**
     * Sets the value of the objID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjID(String value) {
        this.objID = value;
    }

    /**
     * Gets the value of the deloNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeloNum() {
        return deloNum;
    }

    /**
     * Sets the value of the deloNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeloNum(String value) {
        this.deloNum = value;
    }

    /**
     * Gets the value of the dbType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBType() {
        return dbType;
    }

    /**
     * Sets the value of the dbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBType(String value) {
        this.dbType = value;
    }

    /**
     * Gets the value of the inArchiveReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInArchiveReason() {
        return inArchiveReason;
    }

    /**
     * Sets the value of the inArchiveReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInArchiveReason(String value) {
        this.inArchiveReason = value;
    }

    /**
     * Gets the value of the inArchiveReasonAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInArchiveReasonAdd() {
        return inArchiveReasonAdd;
    }

    /**
     * Sets the value of the inArchiveReasonAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInArchiveReasonAdd(String value) {
        this.inArchiveReasonAdd = value;
    }

    /**
     * Gets the value of the inArchiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInArchiveDate() {
        return inArchiveDate;
    }

    /**
     * Sets the value of the inArchiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInArchiveDate(XMLGregorianCalendar value) {
        this.inArchiveDate = value;
    }

    /**
     * Gets the value of the specMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecMark() {
        if (specMark == null) {
            specMark = new ArrayList<String>();
        }
        return this.specMark;
    }

    /**
     * Gets the value of the constrState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrState() {
        return constrState;
    }

    /**
     * Sets the value of the constrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrState(String value) {
        this.constrState = value;
    }

    /**
     * Gets the value of the mapHTMLLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapHTMLLong() {
        return mapHTMLLong;
    }

    /**
     * Sets the value of the mapHTMLLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapHTMLLong(String value) {
        this.mapHTMLLong = value;
    }

    /**
     * Gets the value of the mapObjID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapObjID() {
        return mapObjID;
    }

    /**
     * Sets the value of the mapObjID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapObjID(String value) {
        this.mapObjID = value;
    }

    /**
     * Gets the value of the mapRegParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapRegParams() {
        return mapRegParams;
    }

    /**
     * Sets the value of the mapRegParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapRegParams(String value) {
        this.mapRegParams = value;
    }

    /**
     * Gets the value of the objAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.ObjAddress }
     *     
     */
    public PassportObject.ObjAddress getObjAddress() {
        return objAddress;
    }

    /**
     * Sets the value of the objAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.ObjAddress }
     *     
     */
    public void setObjAddress(PassportObject.ObjAddress value) {
        this.objAddress = value;
    }

    /**
     * Gets the value of the buildStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildStartDate() {
        return buildStartDate;
    }

    /**
     * Sets the value of the buildStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildStartDate(XMLGregorianCalendar value) {
        this.buildStartDate = value;
    }

    /**
     * Gets the value of the buildEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildEndDate() {
        return buildEndDate;
    }

    /**
     * Sets the value of the buildEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildEndDate(XMLGregorianCalendar value) {
        this.buildEndDate = value;
    }

    /**
     * Gets the value of the constractPOSDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstractPOSDate() {
        return constractPOSDate;
    }

    /**
     * Sets the value of the constractPOSDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstractPOSDate(String value) {
        this.constractPOSDate = value;
    }

    /**
     * Gets the value of the numberOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOrder() {
        return numberOrder;
    }

    /**
     * Sets the value of the numberOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOrder(String value) {
        this.numberOrder = value;
    }

    /**
     * Gets the value of the objName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * Sets the value of the objName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * Gets the value of the objTotalArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjTotalArea() {
        return objTotalArea;
    }

    /**
     * Sets the value of the objTotalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjTotalArea(String value) {
        this.objTotalArea = value;
    }

    /**
     * Gets the value of the objLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjLength() {
        return objLength;
    }

    /**
     * Sets the value of the objLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjLength(String value) {
        this.objLength = value;
    }

    /**
     * Gets the value of the objFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjFloor() {
        return objFloor;
    }

    /**
     * Sets the value of the objFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjFloor(String value) {
        this.objFloor = value;
    }

    /**
     * Gets the value of the responsibilityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityLevel() {
        return responsibilityLevel;
    }

    /**
     * Sets the value of the responsibilityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityLevel(String value) {
        this.responsibilityLevel = value;
    }

    /**
     * Gets the value of the objkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjkod() {
        return objkod;
    }

    /**
     * Sets the value of the objkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjkod(String value) {
        this.objkod = value;
    }

    /**
     * Gets the value of the objCategoriesBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjCategoriesBuild() {
        return objCategoriesBuild;
    }

    /**
     * Sets the value of the objCategoriesBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjCategoriesBuild(String value) {
        this.objCategoriesBuild = value;
    }

    /**
     * Gets the value of the stageBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageBuilding() {
        return stageBuilding;
    }

    /**
     * Sets the value of the stageBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageBuilding(String value) {
        this.stageBuilding = value;
    }

    /**
     * Gets the value of the nfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFOCode() {
        return nfoCode;
    }

    /**
     * Sets the value of the nfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFOCode(String value) {
        this.nfoCode = value;
    }

    /**
     * Gets the value of the fno property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.FNO }
     *     
     */
    public PassportObject.FNO getFNO() {
        return fno;
    }

    /**
     * Sets the value of the fno property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.FNO }
     *     
     */
    public void setFNO(PassportObject.FNO value) {
        this.fno = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the typeBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeBuild() {
        return typeBuild;
    }

    /**
     * Sets the value of the typeBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeBuild(String value) {
        this.typeBuild = value;
    }

    /**
     * Gets the value of the objProjektSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjProjektSeries() {
        return objProjektSeries;
    }

    /**
     * Sets the value of the objProjektSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjProjektSeries(String value) {
        this.objProjektSeries = value;
    }

    /**
     * Gets the value of the powerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerName() {
        return powerName;
    }

    /**
     * Sets the value of the powerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerName(String value) {
        this.powerName = value;
    }

    /**
     * Gets the value of the powerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerValue() {
        return powerValue;
    }

    /**
     * Sets the value of the powerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerValue(String value) {
        this.powerValue = value;
    }

    /**
     * Gets the value of the metricUnitsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetricUnitsName() {
        return metricUnitsName;
    }

    /**
     * Sets the value of the metricUnitsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetricUnitsName(String value) {
        this.metricUnitsName = value;
    }

    /**
     * Gets the value of the objFinSourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjFinSourse() {
        return objFinSourse;
    }

    /**
     * Sets the value of the objFinSourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjFinSourse(String value) {
        this.objFinSourse = value;
    }

    /**
     * Gets the value of the frontSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontSystem() {
        return frontSystem;
    }

    /**
     * Sets the value of the frontSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontSystem(String value) {
        this.frontSystem = value;
    }

    /**
     * Gets the value of the objInspector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjInspector() {
        return objInspector;
    }

    /**
     * Sets the value of the objInspector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjInspector(String value) {
        this.objInspector = value;
    }

    /**
     * Gets the value of the objInspectorDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjInspectorDep() {
        return objInspectorDep;
    }

    /**
     * Sets the value of the objInspectorDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjInspectorDep(String value) {
        this.objInspectorDep = value;
    }

    /**
     * Gets the value of the objInspectorPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjInspectorPosition() {
        return objInspectorPosition;
    }

    /**
     * Sets the value of the objInspectorPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjInspectorPosition(String value) {
        this.objInspectorPosition = value;
    }

    /**
     * Gets the value of the objInspectorOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjInspectorOrder() {
        return objInspectorOrder;
    }

    /**
     * Sets the value of the objInspectorOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjInspectorOrder(String value) {
        this.objInspectorOrder = value;
    }

    /**
     * Gets the value of the objInspectorHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objInspectorHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjInspectorHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjInspectorHistory() {
        if (objInspectorHistory == null) {
            objInspectorHistory = new ArrayList<String>();
        }
        return this.objInspectorHistory;
    }

    /**
     * Gets the value of the objComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjComment() {
        return objComment;
    }

    /**
     * Sets the value of the objComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjComment(String value) {
        this.objComment = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportObject.Organization }
     * 
     * 
     */
    public List<PassportObject.Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<PassportObject.Organization>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the organizationBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.OrganizationBuilder }
     *     
     */
    public PassportObject.OrganizationBuilder getOrganizationBuilder() {
        return organizationBuilder;
    }

    /**
     * Sets the value of the organizationBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.OrganizationBuilder }
     *     
     */
    public void setOrganizationBuilder(PassportObject.OrganizationBuilder value) {
        this.organizationBuilder = value;
    }

    /**
     * Gets the value of the organizationGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.OrganizationGeneral }
     *     
     */
    public PassportObject.OrganizationGeneral getOrganizationGeneral() {
        return organizationGeneral;
    }

    /**
     * Sets the value of the organizationGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.OrganizationGeneral }
     *     
     */
    public void setOrganizationGeneral(PassportObject.OrganizationGeneral value) {
        this.organizationGeneral = value;
    }

    /**
     * Gets the value of the organizationCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.OrganizationCustomer }
     *     
     */
    public PassportObject.OrganizationCustomer getOrganizationCustomer() {
        return organizationCustomer;
    }

    /**
     * Sets the value of the organizationCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.OrganizationCustomer }
     *     
     */
    public void setOrganizationCustomer(PassportObject.OrganizationCustomer value) {
        this.organizationCustomer = value;
    }

    /**
     * Gets the value of the organizationAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.OrganizationAuthor }
     *     
     */
    public PassportObject.OrganizationAuthor getOrganizationAuthor() {
        return organizationAuthor;
    }

    /**
     * Sets the value of the organizationAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.OrganizationAuthor }
     *     
     */
    public void setOrganizationAuthor(PassportObject.OrganizationAuthor value) {
        this.organizationAuthor = value;
    }

    /**
     * Gets the value of the organizationOperating property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.OrganizationOperating }
     *     
     */
    public PassportObject.OrganizationOperating getOrganizationOperating() {
        return organizationOperating;
    }

    /**
     * Sets the value of the organizationOperating property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.OrganizationOperating }
     *     
     */
    public void setOrganizationOperating(PassportObject.OrganizationOperating value) {
        this.organizationOperating = value;
    }

    /**
     * Gets the value of the objCat property.
     * 
     * @return
     *     possible object is
     *     {@link PassportObject.ObjCat }
     *     
     */
    public PassportObject.ObjCat getObjCat() {
        return objCat;
    }

    /**
     * Sets the value of the objCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportObject.ObjCat }
     *     
     */
    public void setObjCat(PassportObject.ObjCat value) {
        this.objCat = value;
    }

    /**
     * Gets the value of the opoReg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opoReg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpoReg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportObject.OpoReg }
     * 
     * 
     */
    public List<PassportObject.OpoReg> getOpoReg() {
        if (opoReg == null) {
            opoReg = new ArrayList<PassportObject.OpoReg>();
        }
        return this.opoReg;
    }

    /**
     * Gets the value of the isNoReestr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsNoReestr() {
        return isNoReestr;
    }

    /**
     * Sets the value of the isNoReestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsNoReestr(BigInteger value) {
        this.isNoReestr = value;
    }

    /**
     * Gets the value of the governmentExp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the governmentExp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentExp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportObject.GovernmentExp }
     * 
     * 
     */
    public List<PassportObject.GovernmentExp> getGovernmentExp() {
        if (governmentExp == null) {
            governmentExp = new ArrayList<PassportObject.GovernmentExp>();
        }
        return this.governmentExp;
    }

    /**
     * Gets the value of the nonGovernmentExp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonGovernmentExp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGovernmentExp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportObject.NonGovernmentExp }
     * 
     * 
     */
    public List<PassportObject.NonGovernmentExp> getNonGovernmentExp() {
        if (nonGovernmentExp == null) {
            nonGovernmentExp = new ArrayList<PassportObject.NonGovernmentExp>();
        }
        return this.nonGovernmentExp;
    }

    /**
     * Gets the value of the ecologicalExp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecologicalExp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEcologicalExp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportObject.EcologicalExp }
     * 
     * 
     */
    public List<PassportObject.EcologicalExp> getEcologicalExp() {
        if (ecologicalExp == null) {
            ecologicalExp = new ArrayList<PassportObject.EcologicalExp>();
        }
        return this.ecologicalExp;
    }

    /**
     * Gets the value of the projectPresentRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPresentRem() {
        return projectPresentRem;
    }

    /**
     * Sets the value of the projectPresentRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPresentRem(String value) {
        this.projectPresentRem = value;
    }

    /**
     * Gets the value of the projectPresentFl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectPresentFl() {
        return projectPresentFl;
    }

    /**
     * Sets the value of the projectPresentFl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectPresentFl(Boolean value) {
        this.projectPresentFl = value;
    }

    /**
     * Gets the value of the apo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPO() {
        return apo;
    }

    /**
     * Sets the value of the apo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPO(String value) {
        this.apo = value;
    }

    /**
     * Gets the value of the ops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPS() {
        return ops;
    }

    /**
     * Sets the value of the ops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPS(String value) {
        this.ops = value;
    }

    /**
     * Gets the value of the sen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEN() {
        return sen;
    }

    /**
     * Sets the value of the sen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEN(String value) {
        this.sen = value;
    }

    /**
     * Gets the value of the ogpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGPN() {
        return ogpn;
    }

    /**
     * Sets the value of the ogpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGPN(String value) {
        this.ogpn = value;
    }

    /**
     * Gets the value of the axAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxAct() {
        return axAct;
    }

    /**
     * Sets the value of the axAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxAct(String value) {
        this.axAct = value;
    }

    /**
     * Gets the value of the axActRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxActRem() {
        return axActRem;
    }

    /**
     * Sets the value of the axActRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxActRem(String value) {
        this.axActRem = value;
    }

    /**
     * Gets the value of the objHandOver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjHandOver() {
        return objHandOver;
    }

    /**
     * Sets the value of the objHandOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjHandOver(String value) {
        this.objHandOver = value;
    }

    /**
     * Gets the value of the objHandOverDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjHandOverDate() {
        return objHandOverDate;
    }

    /**
     * Sets the value of the objHandOverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjHandOverDate(XMLGregorianCalendar value) {
        this.objHandOverDate = value;
    }

    /**
     * Gets the value of the objPostAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjPostAddress() {
        return objPostAddress;
    }

    /**
     * Sets the value of the objPostAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjPostAddress(String value) {
        this.objPostAddress = value;
    }

    /**
     * Gets the value of the objAdrStrGK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjAdrStrGK() {
        return objAdrStrGK;
    }

    /**
     * Sets the value of the objAdrStrGK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjAdrStrGK(String value) {
        this.objAdrStrGK = value;
    }

    /**
     * Gets the value of the objAdrStrGKYur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjAdrStrGKYur() {
        return objAdrStrGKYur;
    }

    /**
     * Sets the value of the objAdrStrGKYur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjAdrStrGKYur(String value) {
        this.objAdrStrGKYur = value;
    }

    /**
     * Gets the value of the objAdrHouseGK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjAdrHouseGK() {
        return objAdrHouseGK;
    }

    /**
     * Sets the value of the objAdrHouseGK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjAdrHouseGK(String value) {
        this.objAdrHouseGK = value;
    }

    /**
     * Gets the value of the objAdrKorpGK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjAdrKorpGK() {
        return objAdrKorpGK;
    }

    /**
     * Sets the value of the objAdrKorpGK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjAdrKorpGK(String value) {
        this.objAdrKorpGK = value;
    }

    /**
     * Gets the value of the factPowerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactPowerValue() {
        return factPowerValue;
    }

    /**
     * Sets the value of the factPowerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactPowerValue(String value) {
        this.factPowerValue = value;
    }

    /**
     * Gets the value of the objCritRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjCritRem() {
        return objCritRem;
    }

    /**
     * Sets the value of the objCritRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjCritRem(String value) {
        this.objCritRem = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the objCritRemove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjCritRemove() {
        return objCritRemove;
    }

    /**
     * Sets the value of the objCritRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjCritRemove(String value) {
        this.objCritRemove = value;
    }

    /**
     * Gets the value of the objCritRemoveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjCritRemoveDate() {
        return objCritRemoveDate;
    }

    /**
     * Sets the value of the objCritRemoveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjCritRemoveDate(XMLGregorianCalendar value) {
        this.objCritRemoveDate = value;
    }

    /**
     * Gets the value of the objCritRemoveRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjCritRemoveRem() {
        return objCritRemoveRem;
    }

    /**
     * Sets the value of the objCritRemoveRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjCritRemoveRem(String value) {
        this.objCritRemoveRem = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportObject.Commission }
     * 
     * 
     */
    public List<PassportObject.Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<PassportObject.Commission>();
        }
        return this.commission;
    }

    /**
     * Gets the value of the rcNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCNum() {
        return rcNum;
    }

    /**
     * Sets the value of the rcNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCNum(String value) {
        this.rcNum = value;
    }

    /**
     * Gets the value of the rcDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRCDate() {
        return rcDate;
    }

    /**
     * Sets the value of the rcDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRCDate(XMLGregorianCalendar value) {
        this.rcDate = value;
    }

    /**
     * Gets the value of the rcActNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCActNum() {
        return rcActNum;
    }

    /**
     * Sets the value of the rcActNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCActNum(String value) {
        this.rcActNum = value;
    }

    /**
     * Gets the value of the rcActDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRCActDate() {
        return rcActDate;
    }

    /**
     * Sets the value of the rcActDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRCActDate(XMLGregorianCalendar value) {
        this.rcActDate = value;
    }

    /**
     * Gets the value of the projCharact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjCharact() {
        return projCharact;
    }

    /**
     * Sets the value of the projCharact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjCharact(String value) {
        this.projCharact = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="KomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DateRealizationCommission" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="KomNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Letterhead_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OutDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="Date_Registration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ResNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ResDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "komType",
        "dateRealizationCommission",
        "komNum",
        "letterheadNum",
        "outDate",
        "dateRegistration",
        "docNum",
        "docDate",
        "resNum",
        "resDate"
    })
    public static class Commission {

        @XmlElement(name = "KomType", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String komType;
        @XmlElement(name = "DateRealizationCommission", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateRealizationCommission;
        @XmlElement(name = "KomNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String komNum;
        @XmlElement(name = "Letterhead_Num", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String letterheadNum;
        @XmlElement(name = "OutDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar outDate;
        @XmlElement(name = "Date_Registration", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateRegistration;
        @XmlElement(name = "DocNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String docNum;
        @XmlElement(name = "DocDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar docDate;
        @XmlElement(name = "ResNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String resNum;
        @XmlElement(name = "ResDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar resDate;

        /**
         * Gets the value of the komType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKomType() {
            return komType;
        }

        /**
         * Sets the value of the komType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKomType(String value) {
            this.komType = value;
        }

        /**
         * Gets the value of the dateRealizationCommission property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateRealizationCommission() {
            return dateRealizationCommission;
        }

        /**
         * Sets the value of the dateRealizationCommission property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateRealizationCommission(XMLGregorianCalendar value) {
            this.dateRealizationCommission = value;
        }

        /**
         * Gets the value of the komNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKomNum() {
            return komNum;
        }

        /**
         * Sets the value of the komNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKomNum(String value) {
            this.komNum = value;
        }

        /**
         * Gets the value of the letterheadNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLetterheadNum() {
            return letterheadNum;
        }

        /**
         * Sets the value of the letterheadNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLetterheadNum(String value) {
            this.letterheadNum = value;
        }

        /**
         * Gets the value of the outDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOutDate() {
            return outDate;
        }

        /**
         * Sets the value of the outDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOutDate(XMLGregorianCalendar value) {
            this.outDate = value;
        }

        /**
         * Gets the value of the dateRegistration property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateRegistration() {
            return dateRegistration;
        }

        /**
         * Sets the value of the dateRegistration property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateRegistration(XMLGregorianCalendar value) {
            this.dateRegistration = value;
        }

        /**
         * Gets the value of the docNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNum() {
            return docNum;
        }

        /**
         * Sets the value of the docNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocNum(String value) {
            this.docNum = value;
        }

        /**
         * Gets the value of the docDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDocDate() {
            return docDate;
        }

        /**
         * Sets the value of the docDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDocDate(XMLGregorianCalendar value) {
            this.docDate = value;
        }

        /**
         * Gets the value of the resNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResNum() {
            return resNum;
        }

        /**
         * Sets the value of the resNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResNum(String value) {
            this.resNum = value;
        }

        /**
         * Gets the value of the resDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getResDate() {
            return resDate;
        }

        /**
         * Sets the value of the resDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setResDate(XMLGregorianCalendar value) {
            this.resDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ExpInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expNum",
        "expDate",
        "expInfo"
    })
    public static class EcologicalExp {

        @XmlElement(name = "ExpNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expNum;
        @XmlElement(name = "ExpDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expDate;
        @XmlElement(name = "ExpInfo", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expInfo;

        /**
         * Gets the value of the expNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpNum() {
            return expNum;
        }

        /**
         * Sets the value of the expNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpNum(String value) {
            this.expNum = value;
        }

        /**
         * Gets the value of the expDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpDate() {
            return expDate;
        }

        /**
         * Sets the value of the expDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpDate(XMLGregorianCalendar value) {
            this.expDate = value;
        }

        /**
         * Gets the value of the expInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpInfo() {
            return expInfo;
        }

        /**
         * Sets the value of the expInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpInfo(String value) {
            this.expInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FNOCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FNOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FNOSubgroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FNOGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fnoCode",
        "fnoName",
        "fnoSubgroupCode",
        "fnoGroupCode"
    })
    public static class FNO {

        @XmlElement(name = "FNOCode", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String fnoCode;
        @XmlElement(name = "FNOName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String fnoName;
        @XmlElement(name = "FNOSubgroupCode", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String fnoSubgroupCode;
        @XmlElement(name = "FNOGroupCode", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String fnoGroupCode;

        /**
         * Gets the value of the fnoCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFNOCode() {
            return fnoCode;
        }

        /**
         * Sets the value of the fnoCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFNOCode(String value) {
            this.fnoCode = value;
        }

        /**
         * Gets the value of the fnoName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFNOName() {
            return fnoName;
        }

        /**
         * Sets the value of the fnoName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFNOName(String value) {
            this.fnoName = value;
        }

        /**
         * Gets the value of the fnoSubgroupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFNOSubgroupCode() {
            return fnoSubgroupCode;
        }

        /**
         * Sets the value of the fnoSubgroupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFNOSubgroupCode(String value) {
            this.fnoSubgroupCode = value;
        }

        /**
         * Gets the value of the fnoGroupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFNOGroupCode() {
            return fnoGroupCode;
        }

        /**
         * Sets the value of the fnoGroupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFNOGroupCode(String value) {
            this.fnoGroupCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ExpInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expNum",
        "expDate",
        "expInfo"
    })
    public static class GovernmentExp {

        @XmlElement(name = "ExpNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expNum;
        @XmlElement(name = "ExpDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expDate;
        @XmlElement(name = "ExpInfo", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expInfo;

        /**
         * Gets the value of the expNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpNum() {
            return expNum;
        }

        /**
         * Sets the value of the expNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpNum(String value) {
            this.expNum = value;
        }

        /**
         * Gets the value of the expDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpDate() {
            return expDate;
        }

        /**
         * Sets the value of the expDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpDate(XMLGregorianCalendar value) {
            this.expDate = value;
        }

        /**
         * Gets the value of the expInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpInfo() {
            return expInfo;
        }

        /**
         * Sets the value of the expInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpInfo(String value) {
            this.expInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="ExpOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpAccredNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "expNum",
        "expDate",
        "expOrg",
        "expAccredNum"
    })
    public static class NonGovernmentExp {

        @XmlElement(name = "ExpNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expNum;
        @XmlElement(name = "ExpDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expDate;
        @XmlElement(name = "ExpOrg", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expOrg;
        @XmlElement(name = "ExpAccredNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String expAccredNum;

        /**
         * Gets the value of the expNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpNum() {
            return expNum;
        }

        /**
         * Sets the value of the expNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpNum(String value) {
            this.expNum = value;
        }

        /**
         * Gets the value of the expDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpDate() {
            return expDate;
        }

        /**
         * Sets the value of the expDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpDate(XMLGregorianCalendar value) {
            this.expDate = value;
        }

        /**
         * Gets the value of the expOrg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpOrg() {
            return expOrg;
        }

        /**
         * Sets the value of the expOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpOrg(String value) {
            this.expOrg = value;
        }

        /**
         * Gets the value of the expAccredNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpAccredNum() {
            return expAccredNum;
        }

        /**
         * Sets the value of the expAccredNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpAccredNum(String value) {
            this.expAccredNum = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ObjAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_Street_Law" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_RegionMassBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_MicroDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_Blok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_House" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_House_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_Flat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_Flat_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_AddrLandmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_AddressComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="All_Dist_Prefect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DC_Dist_Prefect" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DC_Prefect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DC_Dist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DCSelectViewAdr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objAddress",
        "dcStreet",
        "dcStreetLaw",
        "dcRegionMassBuild",
        "dcMicroDistrict",
        "dcBlok",
        "dcHouse",
        "dcHouseNum",
        "dcFlat",
        "dcFlatNum",
        "dcAddrLandmark",
        "dcAddressComment",
        "allDistPrefect",
        "dcDistPrefect",
        "dcSelectViewAdr"
    })
    public static class ObjAddress {

        @XmlElement(name = "ObjAddress", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String objAddress;
        @XmlElement(name = "DC_Street", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcStreet;
        @XmlElement(name = "DC_Street_Law", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcStreetLaw;
        @XmlElement(name = "DC_RegionMassBuild", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcRegionMassBuild;
        @XmlElement(name = "DC_MicroDistrict", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcMicroDistrict;
        @XmlElement(name = "DC_Blok", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcBlok;
        @XmlElement(name = "DC_House", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcHouse;
        @XmlElement(name = "DC_House_Num", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcHouseNum;
        @XmlElement(name = "DC_Flat", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcFlat;
        @XmlElement(name = "DC_Flat_Num", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcFlatNum;
        @XmlElement(name = "DC_AddrLandmark", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcAddrLandmark;
        @XmlElement(name = "DC_AddressComment", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcAddressComment;
        @XmlElement(name = "All_Dist_Prefect", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String allDistPrefect;
        @XmlElement(name = "DC_Dist_Prefect", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected List<PassportObject.ObjAddress.DCDistPrefect> dcDistPrefect;
        @XmlElement(name = "DCSelectViewAdr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String dcSelectViewAdr;

        /**
         * Gets the value of the objAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjAddress() {
            return objAddress;
        }

        /**
         * Sets the value of the objAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjAddress(String value) {
            this.objAddress = value;
        }

        /**
         * Gets the value of the dcStreet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCStreet() {
            return dcStreet;
        }

        /**
         * Sets the value of the dcStreet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCStreet(String value) {
            this.dcStreet = value;
        }

        /**
         * Gets the value of the dcStreetLaw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCStreetLaw() {
            return dcStreetLaw;
        }

        /**
         * Sets the value of the dcStreetLaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCStreetLaw(String value) {
            this.dcStreetLaw = value;
        }

        /**
         * Gets the value of the dcRegionMassBuild property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCRegionMassBuild() {
            return dcRegionMassBuild;
        }

        /**
         * Sets the value of the dcRegionMassBuild property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCRegionMassBuild(String value) {
            this.dcRegionMassBuild = value;
        }

        /**
         * Gets the value of the dcMicroDistrict property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCMicroDistrict() {
            return dcMicroDistrict;
        }

        /**
         * Sets the value of the dcMicroDistrict property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCMicroDistrict(String value) {
            this.dcMicroDistrict = value;
        }

        /**
         * Gets the value of the dcBlok property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCBlok() {
            return dcBlok;
        }

        /**
         * Sets the value of the dcBlok property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCBlok(String value) {
            this.dcBlok = value;
        }

        /**
         * Gets the value of the dcHouse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCHouse() {
            return dcHouse;
        }

        /**
         * Sets the value of the dcHouse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCHouse(String value) {
            this.dcHouse = value;
        }

        /**
         * Gets the value of the dcHouseNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCHouseNum() {
            return dcHouseNum;
        }

        /**
         * Sets the value of the dcHouseNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCHouseNum(String value) {
            this.dcHouseNum = value;
        }

        /**
         * Gets the value of the dcFlat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCFlat() {
            return dcFlat;
        }

        /**
         * Sets the value of the dcFlat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCFlat(String value) {
            this.dcFlat = value;
        }

        /**
         * Gets the value of the dcFlatNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCFlatNum() {
            return dcFlatNum;
        }

        /**
         * Sets the value of the dcFlatNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCFlatNum(String value) {
            this.dcFlatNum = value;
        }

        /**
         * Gets the value of the dcAddrLandmark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCAddrLandmark() {
            return dcAddrLandmark;
        }

        /**
         * Sets the value of the dcAddrLandmark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCAddrLandmark(String value) {
            this.dcAddrLandmark = value;
        }

        /**
         * Gets the value of the dcAddressComment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCAddressComment() {
            return dcAddressComment;
        }

        /**
         * Sets the value of the dcAddressComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCAddressComment(String value) {
            this.dcAddressComment = value;
        }

        /**
         * Gets the value of the allDistPrefect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllDistPrefect() {
            return allDistPrefect;
        }

        /**
         * Sets the value of the allDistPrefect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllDistPrefect(String value) {
            this.allDistPrefect = value;
        }

        /**
         * Gets the value of the dcDistPrefect property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dcDistPrefect property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDCDistPrefect().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassportObject.ObjAddress.DCDistPrefect }
         * 
         * 
         */
        public List<PassportObject.ObjAddress.DCDistPrefect> getDCDistPrefect() {
            if (dcDistPrefect == null) {
                dcDistPrefect = new ArrayList<PassportObject.ObjAddress.DCDistPrefect>();
            }
            return this.dcDistPrefect;
        }

        /**
         * Gets the value of the dcSelectViewAdr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDCSelectViewAdr() {
            return dcSelectViewAdr;
        }

        /**
         * Sets the value of the dcSelectViewAdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDCSelectViewAdr(String value) {
            this.dcSelectViewAdr = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DC_Prefect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DC_Dist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dcPrefect",
            "dcDist"
        })
        public static class DCDistPrefect {

            @XmlElement(name = "DC_Prefect", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
            protected String dcPrefect;
            @XmlElement(name = "DC_Dist", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
            protected String dcDist;

            /**
             * Gets the value of the dcPrefect property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDCPrefect() {
                return dcPrefect;
            }

            /**
             * Sets the value of the dcPrefect property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDCPrefect(String value) {
                this.dcPrefect = value;
            }

            /**
             * Gets the value of the dcDist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDCDist() {
                return dcDist;
            }

            /**
             * Sets the value of the dcDist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDCDist(String value) {
                this.dcDist = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ObjSMR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ObjOPO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ObjEO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ObjGPR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objSMR",
        "objOPO",
        "objEO",
        "objGPR"
    })
    public static class ObjCat {

        @XmlElement(name = "ObjSMR", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected BigInteger objSMR;
        @XmlElement(name = "ObjOPO", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected BigInteger objOPO;
        @XmlElement(name = "ObjEO", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected BigInteger objEO;
        @XmlElement(name = "ObjGPR", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected BigInteger objGPR;

        /**
         * Gets the value of the objSMR property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getObjSMR() {
            return objSMR;
        }

        /**
         * Sets the value of the objSMR property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setObjSMR(BigInteger value) {
            this.objSMR = value;
        }

        /**
         * Gets the value of the objOPO property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getObjOPO() {
            return objOPO;
        }

        /**
         * Sets the value of the objOPO property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setObjOPO(BigInteger value) {
            this.objOPO = value;
        }

        /**
         * Gets the value of the objEO property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getObjEO() {
            return objEO;
        }

        /**
         * Sets the value of the objEO property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setObjEO(BigInteger value) {
            this.objEO = value;
        }

        /**
         * Gets the value of the objGPR property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getObjGPR() {
            return objGPR;
        }

        /**
         * Sets the value of the objGPR property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setObjGPR(BigInteger value) {
            this.objGPR = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OpoRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OpoRegDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "opoRegNum",
        "opoRegDate"
    })
    public static class OpoReg {

        @XmlElement(name = "OpoRegNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String opoRegNum;
        @XmlElement(name = "OpoRegDate", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar opoRegDate;

        /**
         * Gets the value of the opoRegNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpoRegNum() {
            return opoRegNum;
        }

        /**
         * Sets the value of the opoRegNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpoRegNum(String value) {
            this.opoRegNum = value;
        }

        /**
         * Gets the value of the opoRegDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOpoRegDate() {
            return opoRegDate;
        }

        /**
         * Sets the value of the opoRegDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOpoRegDate(XMLGregorianCalendar value) {
            this.opoRegDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgOGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRole",
        "orgID",
        "orgName",
        "orgOGRN",
        "orgINN",
        "licenseNum",
        "orgDogovor",
        "orgPredstID",
        "orgPredst",
        "orgPrikaz",
        "orgPredstKontrID",
        "orgPredstKontr",
        "orgPrikazKontr"
    })
    public static class Organization {

        @XmlElement(name = "OrgRole", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgRole;
        @XmlElement(name = "OrgID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgID;
        @XmlElement(name = "OrgName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgName;
        @XmlElement(name = "OrgOGRN", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgOGRN;
        @XmlElement(name = "OrgINN", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgINN;
        @XmlElement(name = "LicenseNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String licenseNum;
        @XmlElement(name = "OrgDogovor", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgDogovor;
        @XmlElement(name = "OrgPredstID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstID;
        @XmlElement(name = "OrgPredst", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredst;
        @XmlElement(name = "OrgPrikaz", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikaz;
        @XmlElement(name = "OrgPredstKontrID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontrID;
        @XmlElement(name = "OrgPredstKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontr;
        @XmlElement(name = "OrgPrikazKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikazKontr;

        /**
         * Gets the value of the orgRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRole() {
            return orgRole;
        }

        /**
         * Sets the value of the orgRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRole(String value) {
            this.orgRole = value;
        }

        /**
         * Gets the value of the orgID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgID() {
            return orgID;
        }

        /**
         * Sets the value of the orgID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgID(String value) {
            this.orgID = value;
        }

        /**
         * Gets the value of the orgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgName() {
            return orgName;
        }

        /**
         * Sets the value of the orgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgName(String value) {
            this.orgName = value;
        }

        /**
         * Gets the value of the orgOGRN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgOGRN() {
            return orgOGRN;
        }

        /**
         * Sets the value of the orgOGRN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgOGRN(String value) {
            this.orgOGRN = value;
        }

        /**
         * Gets the value of the orgINN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgINN() {
            return orgINN;
        }

        /**
         * Sets the value of the orgINN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgINN(String value) {
            this.orgINN = value;
        }

        /**
         * Gets the value of the licenseNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNum() {
            return licenseNum;
        }

        /**
         * Sets the value of the licenseNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseNum(String value) {
            this.licenseNum = value;
        }

        /**
         * Gets the value of the orgDogovor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgDogovor() {
            return orgDogovor;
        }

        /**
         * Sets the value of the orgDogovor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgDogovor(String value) {
            this.orgDogovor = value;
        }

        /**
         * Gets the value of the orgPredstID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstID() {
            return orgPredstID;
        }

        /**
         * Sets the value of the orgPredstID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstID(String value) {
            this.orgPredstID = value;
        }

        /**
         * Gets the value of the orgPredst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredst() {
            return orgPredst;
        }

        /**
         * Sets the value of the orgPredst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredst(String value) {
            this.orgPredst = value;
        }

        /**
         * Gets the value of the orgPrikaz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikaz() {
            return orgPrikaz;
        }

        /**
         * Sets the value of the orgPrikaz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikaz(String value) {
            this.orgPrikaz = value;
        }

        /**
         * Gets the value of the orgPredstKontrID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontrID() {
            return orgPredstKontrID;
        }

        /**
         * Sets the value of the orgPredstKontrID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontrID(String value) {
            this.orgPredstKontrID = value;
        }

        /**
         * Gets the value of the orgPredstKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontr() {
            return orgPredstKontr;
        }

        /**
         * Sets the value of the orgPredstKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontr(String value) {
            this.orgPredstKontr = value;
        }

        /**
         * Gets the value of the orgPrikazKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikazKontr() {
            return orgPrikazKontr;
        }

        /**
         * Sets the value of the orgPrikazKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikazKontr(String value) {
            this.orgPrikazKontr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRole",
        "orgID",
        "orgName",
        "licenseNum",
        "orgDogovor",
        "orgPredstID",
        "orgPredst",
        "orgPrikaz",
        "orgPredstKontrID",
        "orgPredstKontr",
        "orgPrikazKontr"
    })
    public static class OrganizationAuthor {

        @XmlElement(name = "OrgRole", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgRole;
        @XmlElement(name = "OrgID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgID;
        @XmlElement(name = "OrgName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgName;
        @XmlElement(name = "LicenseNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String licenseNum;
        @XmlElement(name = "OrgDogovor", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgDogovor;
        @XmlElement(name = "OrgPredstID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstID;
        @XmlElement(name = "OrgPredst", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredst;
        @XmlElement(name = "OrgPrikaz", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikaz;
        @XmlElement(name = "OrgPredstKontrID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontrID;
        @XmlElement(name = "OrgPredstKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontr;
        @XmlElement(name = "OrgPrikazKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikazKontr;

        /**
         * Gets the value of the orgRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRole() {
            return orgRole;
        }

        /**
         * Sets the value of the orgRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRole(String value) {
            this.orgRole = value;
        }

        /**
         * Gets the value of the orgID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgID() {
            return orgID;
        }

        /**
         * Sets the value of the orgID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgID(String value) {
            this.orgID = value;
        }

        /**
         * Gets the value of the orgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgName() {
            return orgName;
        }

        /**
         * Sets the value of the orgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgName(String value) {
            this.orgName = value;
        }

        /**
         * Gets the value of the licenseNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNum() {
            return licenseNum;
        }

        /**
         * Sets the value of the licenseNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseNum(String value) {
            this.licenseNum = value;
        }

        /**
         * Gets the value of the orgDogovor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgDogovor() {
            return orgDogovor;
        }

        /**
         * Sets the value of the orgDogovor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgDogovor(String value) {
            this.orgDogovor = value;
        }

        /**
         * Gets the value of the orgPredstID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstID() {
            return orgPredstID;
        }

        /**
         * Sets the value of the orgPredstID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstID(String value) {
            this.orgPredstID = value;
        }

        /**
         * Gets the value of the orgPredst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredst() {
            return orgPredst;
        }

        /**
         * Sets the value of the orgPredst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredst(String value) {
            this.orgPredst = value;
        }

        /**
         * Gets the value of the orgPrikaz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikaz() {
            return orgPrikaz;
        }

        /**
         * Sets the value of the orgPrikaz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikaz(String value) {
            this.orgPrikaz = value;
        }

        /**
         * Gets the value of the orgPredstKontrID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontrID() {
            return orgPredstKontrID;
        }

        /**
         * Sets the value of the orgPredstKontrID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontrID(String value) {
            this.orgPredstKontrID = value;
        }

        /**
         * Gets the value of the orgPredstKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontr() {
            return orgPredstKontr;
        }

        /**
         * Sets the value of the orgPredstKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontr(String value) {
            this.orgPredstKontr = value;
        }

        /**
         * Gets the value of the orgPrikazKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikazKontr() {
            return orgPrikazKontr;
        }

        /**
         * Sets the value of the orgPrikazKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikazKontr(String value) {
            this.orgPrikazKontr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRole",
        "orgID",
        "orgName"
    })
    public static class OrganizationBuilder {

        @XmlElement(name = "OrgRole", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgRole;
        @XmlElement(name = "OrgID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgID;
        @XmlElement(name = "OrgName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgName;

        /**
         * Gets the value of the orgRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRole() {
            return orgRole;
        }

        /**
         * Sets the value of the orgRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRole(String value) {
            this.orgRole = value;
        }

        /**
         * Gets the value of the orgID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgID() {
            return orgID;
        }

        /**
         * Sets the value of the orgID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgID(String value) {
            this.orgID = value;
        }

        /**
         * Gets the value of the orgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgName() {
            return orgName;
        }

        /**
         * Sets the value of the orgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgName(String value) {
            this.orgName = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRole",
        "orgID",
        "orgName",
        "licenseNum",
        "orgDogovor",
        "orgPredstID",
        "orgPredst",
        "orgPrikaz",
        "orgPredstKontrID",
        "orgPredstKontr",
        "orgPrikazKontr"
    })
    public static class OrganizationCustomer {

        @XmlElement(name = "OrgRole", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgRole;
        @XmlElement(name = "OrgID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgID;
        @XmlElement(name = "OrgName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgName;
        @XmlElement(name = "LicenseNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String licenseNum;
        @XmlElement(name = "OrgDogovor", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgDogovor;
        @XmlElement(name = "OrgPredstID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstID;
        @XmlElement(name = "OrgPredst", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredst;
        @XmlElement(name = "OrgPrikaz", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikaz;
        @XmlElement(name = "OrgPredstKontrID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontrID;
        @XmlElement(name = "OrgPredstKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontr;
        @XmlElement(name = "OrgPrikazKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikazKontr;

        /**
         * Gets the value of the orgRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRole() {
            return orgRole;
        }

        /**
         * Sets the value of the orgRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRole(String value) {
            this.orgRole = value;
        }

        /**
         * Gets the value of the orgID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgID() {
            return orgID;
        }

        /**
         * Sets the value of the orgID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgID(String value) {
            this.orgID = value;
        }

        /**
         * Gets the value of the orgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgName() {
            return orgName;
        }

        /**
         * Sets the value of the orgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgName(String value) {
            this.orgName = value;
        }

        /**
         * Gets the value of the licenseNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNum() {
            return licenseNum;
        }

        /**
         * Sets the value of the licenseNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseNum(String value) {
            this.licenseNum = value;
        }

        /**
         * Gets the value of the orgDogovor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgDogovor() {
            return orgDogovor;
        }

        /**
         * Sets the value of the orgDogovor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgDogovor(String value) {
            this.orgDogovor = value;
        }

        /**
         * Gets the value of the orgPredstID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstID() {
            return orgPredstID;
        }

        /**
         * Sets the value of the orgPredstID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstID(String value) {
            this.orgPredstID = value;
        }

        /**
         * Gets the value of the orgPredst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredst() {
            return orgPredst;
        }

        /**
         * Sets the value of the orgPredst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredst(String value) {
            this.orgPredst = value;
        }

        /**
         * Gets the value of the orgPrikaz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikaz() {
            return orgPrikaz;
        }

        /**
         * Sets the value of the orgPrikaz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikaz(String value) {
            this.orgPrikaz = value;
        }

        /**
         * Gets the value of the orgPredstKontrID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontrID() {
            return orgPredstKontrID;
        }

        /**
         * Sets the value of the orgPredstKontrID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontrID(String value) {
            this.orgPredstKontrID = value;
        }

        /**
         * Gets the value of the orgPredstKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontr() {
            return orgPredstKontr;
        }

        /**
         * Sets the value of the orgPredstKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontr(String value) {
            this.orgPredstKontr = value;
        }

        /**
         * Gets the value of the orgPrikazKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikazKontr() {
            return orgPrikazKontr;
        }

        /**
         * Sets the value of the orgPrikazKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikazKontr(String value) {
            this.orgPrikazKontr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgDogovor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikaz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontrID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPredstKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgPrikazKontr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRole",
        "orgID",
        "orgName",
        "licenseNum",
        "orgDogovor",
        "orgPredstID",
        "orgPredst",
        "orgPrikaz",
        "orgPredstKontrID",
        "orgPredstKontr",
        "orgPrikazKontr"
    })
    public static class OrganizationGeneral {

        @XmlElement(name = "OrgRole", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgRole;
        @XmlElement(name = "OrgID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgID;
        @XmlElement(name = "OrgName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgName;
        @XmlElement(name = "LicenseNum", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String licenseNum;
        @XmlElement(name = "OrgDogovor", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgDogovor;
        @XmlElement(name = "OrgPredstID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstID;
        @XmlElement(name = "OrgPredst", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredst;
        @XmlElement(name = "OrgPrikaz", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikaz;
        @XmlElement(name = "OrgPredstKontrID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontrID;
        @XmlElement(name = "OrgPredstKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPredstKontr;
        @XmlElement(name = "OrgPrikazKontr", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgPrikazKontr;

        /**
         * Gets the value of the orgRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRole() {
            return orgRole;
        }

        /**
         * Sets the value of the orgRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRole(String value) {
            this.orgRole = value;
        }

        /**
         * Gets the value of the orgID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgID() {
            return orgID;
        }

        /**
         * Sets the value of the orgID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgID(String value) {
            this.orgID = value;
        }

        /**
         * Gets the value of the orgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgName() {
            return orgName;
        }

        /**
         * Sets the value of the orgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgName(String value) {
            this.orgName = value;
        }

        /**
         * Gets the value of the licenseNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNum() {
            return licenseNum;
        }

        /**
         * Sets the value of the licenseNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseNum(String value) {
            this.licenseNum = value;
        }

        /**
         * Gets the value of the orgDogovor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgDogovor() {
            return orgDogovor;
        }

        /**
         * Sets the value of the orgDogovor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgDogovor(String value) {
            this.orgDogovor = value;
        }

        /**
         * Gets the value of the orgPredstID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstID() {
            return orgPredstID;
        }

        /**
         * Sets the value of the orgPredstID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstID(String value) {
            this.orgPredstID = value;
        }

        /**
         * Gets the value of the orgPredst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredst() {
            return orgPredst;
        }

        /**
         * Sets the value of the orgPredst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredst(String value) {
            this.orgPredst = value;
        }

        /**
         * Gets the value of the orgPrikaz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikaz() {
            return orgPrikaz;
        }

        /**
         * Sets the value of the orgPrikaz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikaz(String value) {
            this.orgPrikaz = value;
        }

        /**
         * Gets the value of the orgPredstKontrID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontrID() {
            return orgPredstKontrID;
        }

        /**
         * Sets the value of the orgPredstKontrID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontrID(String value) {
            this.orgPredstKontrID = value;
        }

        /**
         * Gets the value of the orgPredstKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPredstKontr() {
            return orgPredstKontr;
        }

        /**
         * Sets the value of the orgPredstKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPredstKontr(String value) {
            this.orgPredstKontr = value;
        }

        /**
         * Gets the value of the orgPrikazKontr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPrikazKontr() {
            return orgPrikazKontr;
        }

        /**
         * Sets the value of the orgPrikazKontr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgPrikazKontr(String value) {
            this.orgPrikazKontr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrgRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRole",
        "orgID",
        "orgName"
    })
    public static class OrganizationOperating {

        @XmlElement(name = "OrgRole", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgRole;
        @XmlElement(name = "OrgID", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgID;
        @XmlElement(name = "OrgName", namespace = "http://xmlns.oracle.com/MSG_PassportObject")
        protected String orgName;

        /**
         * Gets the value of the orgRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRole() {
            return orgRole;
        }

        /**
         * Sets the value of the orgRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgRole(String value) {
            this.orgRole = value;
        }

        /**
         * Gets the value of the orgID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgID() {
            return orgID;
        }

        /**
         * Sets the value of the orgID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgID(String value) {
            this.orgID = value;
        }

        /**
         * Gets the value of the orgName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgName() {
            return orgName;
        }

        /**
         * Sets the value of the orgName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgName(String value) {
            this.orgName = value;
        }

    }

}
