package ru.ursip.webservice.mgsn.workplace.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import javax.xml.bind.Marshaller


@Configuration
class JaxbConfiguraion {

    @Bean
    fun jaxb2Marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.setContextPaths("ru.ursip.webservice.mgsn.workplace.model.passport.generated")
        marshaller.setMarshallerProperties(mapOf(Marshaller.JAXB_FORMATTED_OUTPUT to true))
        return marshaller
    }
}