package ru.ursip.webservice.mgsn.workplace.config

import com.fasterxml.classmate.TypeResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.data.domain.Pageable
import springfox.documentation.builders.AlternateTypeBuilder
import springfox.documentation.builders.AlternateTypePropertyBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.schema.AlternateTypeRule
import springfox.documentation.schema.AlternateTypeRuleConvention
import springfox.documentation.schema.AlternateTypeRules.newRule
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.lang.reflect.Type


/**
 * Конфигурация сваггера
 *
 * @author Anton Kuznetsov
 * @since  21.06.2018
 */
@Configuration
@EnableSwagger2
class SwaggerConfig {

    /**
     * Настройка сваггера
     */
    @Bean
    fun api(): Docket =
            Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("ru.ursip.webservice.mgsn.workplace.controller"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(getApiInfo())
                    .useDefaultResponseMessages(false)

    /**
     * Описание сервиса
     */
    private fun getApiInfo(): ApiInfo =
            ApiInfo(
                    "WORKPLACE API",
                    "Рабочий кабинет для проекта МГСН",
                    "1.0.0",
                    "http://www.ursip.ru/",
                    Contact("URSIP", "http://www.ursip.ru/", "support@ursip.ru"),
                    "URSIP",
                    "http://www.ursip.ru/", ArrayList())
}
