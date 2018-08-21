package ru.ursip.webservice.mgsn.workplace.config

import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = ["ru.ursip.webservice.mgsn.workplace.organisation.repository",
    "ru.ursip.webservice.mgsn.workplace.passport.repository"])
class JpaConfig {
    @Bean
    protected fun module(): Module {
        return Hibernate5Module()
    }
}