package ru.ursip.webservice.mgsn.workplace.repository.passport

import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import ru.ursip.webservice.mgsn.workplace.model.passport.PassportObject
import java.util.*

interface PassportObjectDao : CrudRepository<PassportObject, UUID> {

    @Query("""select cast(po.id as varchar),po.obj_fin_sourse,po.delo_num,po.obj_address,po.all_dist_prefect,po.obj_name,org.org_name,
        po.build_start_date,po.build_end_date, po.constr_state
          FROM documents.passport_object po
        left join documents.obj_organization org
        on po.id=org.passport_id and org.org_role='Застройщик'""",
            nativeQuery = true)
    fun getAllProjection(pageable: Pageable): List<Map<String, Any>>
}