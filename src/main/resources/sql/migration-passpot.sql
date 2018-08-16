-- from oracle
select t2.OBJID id, t1.xml
from STORAGE_DATA.xml_docs t1
  join v_xd_passportobject t2 on t1.id = t2.xml_doc_id

-- Далее парсим xml и складываем их в бд (пример в тестах service/passport)