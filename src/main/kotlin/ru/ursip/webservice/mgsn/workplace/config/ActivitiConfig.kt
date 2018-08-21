package ru.ursip.webservice.mgsn.workplace.config

import org.activiti.engine.ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE
import org.activiti.spring.ProcessEngineFactoryBean
import org.activiti.spring.SpringProcessEngineConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.PlatformTransactionManager
import javax.sql.DataSource

@Configuration
class ActivitiConfig {

    @Bean
    fun getEngineConfiguration(dataSource: DataSource, transactionManager: PlatformTransactionManager): SpringProcessEngineConfiguration {
        val configuraion = SpringProcessEngineConfiguration()
        configuraion.dataSource = dataSource
        configuraion.transactionManager = transactionManager
        configuraion.databaseSchemaUpdate = DB_SCHEMA_UPDATE_TRUE
        configuraion.isAsyncExecutorActivate = false
//        configuraion.init()     Если nullpointer при использовании сервисов раскомментить
        configuraion.initDatabaseEventLogging()
        return configuraion
    }

    @Bean
    fun getFactoryBean(configuration: SpringProcessEngineConfiguration): ProcessEngineFactoryBean {
        val engineFactoryBean = ProcessEngineFactoryBean()
        engineFactoryBean.processEngineConfiguration = configuration
        return engineFactoryBean
    }

    @Bean
    fun getRepositoryService(factoryBean: ProcessEngineFactoryBean) =
            factoryBean.processEngineConfiguration.repositoryService!!

    @Bean
    fun getRuntimeService(factoryBean: ProcessEngineFactoryBean) =
            factoryBean.processEngineConfiguration.runtimeService!!

    @Bean
    fun getTaskService(factoryBean: ProcessEngineFactoryBean) =
            factoryBean.processEngineConfiguration.taskService!!

}