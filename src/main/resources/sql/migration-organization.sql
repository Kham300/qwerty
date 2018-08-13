--from oracle
SELECT
  --jur
  UNID,
  ORGFORM,
  EGRUL_ORGFORMCODE,
  ORGSTATUS,
  EGRUL_ORGFORM,
  ORGFORMSHORT,
  EGRUL_ORGNAMEFULL,
  ORGNAMEFULL,
  EGRUL_ORGNAMESHORT,
  orgNameShort,
  EGRUL_OrgNameBrand,
  orgNameFullOld,
  PASPORT_BIRTHDATE,
  PASPORT_BIRTHPLACE,
  orgAddressLegal,
  orgAddressPost,
  KLADRAddressPost,
  KLADRCode,
  orgAddressFact,
  orgINN,
  orgOGRN,
  orgKPP,
  orgOKPO,
  gosRegNum,
  gosRegDate,
  isSmallBusiness,
  SMiSPDate,
  headOrgID,
  NameSROID,
  NAMESRO,
  SROAttitude,
  SRORegNum,
  SRORegDate,
  SROExpiryDate,
  COMMENTS,
  orgPhone,
  orgEmail,
  theNameOfBank,
  bankBIK,
  bankCorAc,
  bankSetAc,
  theAddressOfBank,
  ORGRECBANK,
  headFIO,
  headPost,
  OrgPguID,
  ISTRASH,
  isCanceled,
  RequestID,
  RequestDate,
  REQUESTSPECIALIST_FIO,
  REQUESTSPECIALIST_NORM,
  REQUESTSPECIALIST_POSITION,
  REQUESTSPECIALIST_DEPARTMENT,
  RequestStatusDate,
  RequestStatus,
  RequestStatusComment,
  HEADORGNAME,
  ORGHIGHER,
  ORGSTARTDATE,
  ORGENDDATE,
  ORG_NAME_NORM,
  ORGHEAD,
  --fiz
  PASPORT_LASTNAME,
  PASPORT_FIRSTNAME,
  PASPORT_MIDDLENAME,
  PASPORT_SNILS,
  WorkToleranceNum,
  WorkToleranceDate,
  PASPORT_SEX,
  PASPORT_SER,
  PASPORT_NUM,
  PASPORT_DATE,
  PASPORT_ISSUE
from STORAGE_VIT.XD_ORGANISATIONFROMLN;

select distinct
  t0.UNID,
  t1.VALUE_DATA SROID,
  t2.VALUE_DATA SROName,
  t3.VALUE_DATA SROMemberNum,
  t4.VALUE_DATA SROMemberDate,
  t5.VALUE_DATA SROMemberExitDate
from STORAGE_VIT.XD_ORGANISATIONFROMLN t0
  left join STORAGE_VIT.XD_ORGANISATIONFROMLN_LIST t1
    on t1.ID_HD = t0.ID and t1.ID_DOC_FIELDS = '1A3E630D8351413283635D4C018D9FEE'
  left join STORAGE_VIT.XD_ORGANISATIONFROMLN_LIST t2
    on t2.ID_HD = t0.ID and t2.ID_DOC_FIELDS = 'BD8C079864364F5AB705EFFFAC5F68B3'
  left join STORAGE_VIT.XD_ORGANISATIONFROMLN_LIST t3
    on t3.ID_HD = t0.ID and t3.ID_DOC_FIELDS = 'F3E118E3E2364A3FB87181BB18F7A1FF'
  left join STORAGE_VIT.XD_ORGANISATIONFROMLN_LIST t4
    on t4.ID_HD = t0.ID and t4.ID_DOC_FIELDS = 'D5D5C5FDA9E646D18E83F96804470275'
  left join STORAGE_VIT.XD_ORGANISATIONFROMLN_LIST t5
    on t5.ID_HD = t0.ID and t5.ID_DOC_FIELDS = '019DF649C0B941C0A775AD0617D6328C'
where
  (t1.VALUE_DATA is not null or t2.VALUE_DATA is not null or t3.VALUE_DATA is not null or t4.VALUE_DATA is not null
   or t5.VALUE_DATA is not null) and t0.SROATTITUDE = 'член СРО';

--update in postgre
delete from documents.organization_members_sro;
delete from documents.organization_jur;
delete from documents.organization_fiz;

insert into documents.organization_jur
(id, org_pgu_id, bank_bik, bank_cor_ac, bank_set_ac, birth_date, birth_place, comment, egrul_org_form,
 egrul_org_form_code, egrul_org_name_brand, egrul_org_name_full, egrul_org_name_short, gos_reg_date,
 gos_reg_num, head_fio, head_orgid, head_org_name, head_post, is_canceled, is_small_business, is_trash,
 kladr_address_post, kladr_code, name_sro_id, org_address_fact, org_address_legal, org_address_post, org_email,
 org_form, org_form_short, org_higher, org_inn, org_kpp, org_name_full, org_name_full_old, org_name_short,
 org_ogrn, org_okpo, org_phone, org_start_date, org_status, orgend_date, request_date, request_id,
 request_specialist_fio, request_specialist_norm, request_specialist_position, request_status, request_status_comment,
 request_status_date, requestspecialist_department, smisp_date, sro_attitude, sro_expiry_date,
 sro_reg_date, sro_reg_num, the_address_of_bank, the_name_of_bank,org_name_norm,org_head)
  select UNID :: UUID,orgpguid,bankbik,bankcorac,banksetac,pasport_birthdate,pasport_birthplace,comments,
    egrul_orgform,egrul_orgformcode,egrul_orgnamebrand,egrul_orgnamefull, egrul_orgnameshort,gosregdate,
    gosregnum,headfio,headorgid,HEADORGNAME,headpost,iscanceled::BOOLEAN,issmallbusiness::BOOLEAN,istrash::BOOLEAN,kladraddresspost,
    kladrcode,namesroid, orgaddressfact, orgaddresslegal, orgaddresspost, orgemail,
    orgform, orgformshort, orghigher, orginn, orgkpp, orgnamefull, orgnamefullold, orgnameshort,
    orgogrn, orgokpo, orgphone, orgstartdate, orgstatus, orgenddate, requestdate, requestid,
    requestspecialist_fio,requestspecialist_norm, requestspecialist_position, requeststatus, requeststatuscomment,
    requeststatusdate, requestspecialist_department, smispdate, sroattitude, sroexpirydate,
    sroregdate, sroregnum, theaddressofbank, thenameofbank,org_name_norm,orghead
  from documents.xd_organisationfromln where orgform!='Физическое лицо';

insert into documents.organization_fiz
(id, kladraddress_post, request_id, birth_date, birth_place, first_name, is_canceled,
 is_trash, kladr_code, last_name, middle_name, org_address_fact, org_address_post,
 org_email, org_form, org_higher, org_inn, org_name_full, org_name_short, org_pgu_id,
 org_phone, org_start_date, orgend_date, passport_date, passport_issue, passport_num,
 passport_ser, request_date, request_specialist_department, request_specialist_fio,
 request_specialist_norm, request_specialist_position, request_status, request_status_comment,
 request_status_date, sex, snils, work_tolerance_date, work_tolerance_num, org_name_norm)
  select UNID :: UUID,kladraddresspost, requestid, pasport_birthdate, pasport_birthplace, pasport_firstname, iscanceled::BOOLEAN,
    istrash::BOOLEAN, kladrcode, pasport_lastname, pasport_middlename, orgaddressfact, orgaddresspost,
    orgemail, orgform, orghigher, orginn, orgnamefull, orgnameshort, orgpguid,
    orgphone, orgstartdate, orgenddate, pasport_date, pasport_issue, pasport_num,
    pasport_ser, requestdate, requestspecialist_department, requestspecialist_fio,
    requestspecialist_norm, requestspecialist_position, requeststatus, requeststatuscomment,
    requeststatusdate, pasport_sex, pasport_snils, worktolerancedate, worktolerancenum,org_name_norm
  from documents.xd_organisationfromln where orgform='Физическое лицо';

insert into documents.organization_members_sro (member_date, member_exit_date, member_num, name, organization_id, sro_id)
  select sromemberdate::TIMESTAMP, sromemberexitdate::TIMESTAMP, sromembernum, sroname, sro_from_oracle.unid::UUID, sroid::UUID from documents.sro_from_oracle
    join documents.organization_jur on sro_from_oracle.unid::UUID=organization_jur.id;