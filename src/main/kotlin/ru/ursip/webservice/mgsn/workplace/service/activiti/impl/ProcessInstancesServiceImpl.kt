package ru.ursip.webservice.mgsn.workplace.service.activiti.impl

import org.activiti.engine.RuntimeService
import org.activiti.engine.runtime.ProcessInstance
import org.springframework.stereotype.Service
import ru.ursip.webservice.mgsn.workplace.model.activiti.ProcessInstanceRepresantation
import ru.ursip.webservice.mgsn.workplace.model.activiti.toRepresentation
import ru.ursip.webservice.mgsn.workplace.service.activiti.ProcessInstancesService

@Service
class ProcessInstancesServiceImpl(val runtimeService: RuntimeService) : ProcessInstancesService {
    override fun getAll(processDefinitionKey: String?, processDefinitionId: String?): List<ProcessInstanceRepresantation> {
        var piq = runtimeService.createProcessInstanceQuery()!!
        processDefinitionKey?.let { piq = piq.processDefinitionKey(it) }
        processDefinitionId?.let { piq = piq.processDefinitionId(it) }
        return piq.list().map { it.toRepresentation() }
    }

    override fun startProcessInstanceByKey(processDefinitionKey: String, businessKey: String?, variables: Map<String, Any>?): ProcessInstance? =
            runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, variables)

}