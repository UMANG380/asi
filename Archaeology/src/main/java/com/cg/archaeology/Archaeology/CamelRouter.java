package com.cg.archaeology.Archaeology;

import com.cg.archaeology.Archaeology.model.Archaeology;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import static org.apache.camel.model.rest.RestParamType.body;
import static org.apache.camel.model.rest.RestParamType.path;
@Component
public class CamelRouter extends RouteBuilder {

    @Autowired
    private Environment env;

    @Value("${camel.component.servlet.mapping.context-path}")
    private String contextPath;

    @Override
    public void configure() throws Exception {


        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .enableCORS(true)
                .port(env.getProperty("server.port", "8080"))
                .contextPath(contextPath.substring(0, contextPath.length() - 2))
                // turn on swagger api-doc
                .apiContextPath("/api-doc")
                .apiProperty("api.title", "Archaeology API")
                .apiProperty("api.version", "1.0.0");

        rest("/sites").description("Archaeology REST service")
                .consumes("application/json")
                .produces("application/json")

                .get("/all").description("Find all sites").outType(Archaeology[].class)
                .responseMessage().code(200).message("All sites successfully returned").endResponseMessage()
                .to("bean:siteService?method=viewAllArchaeologies")

                .get("byId/{id}").description("Find site by ID")
                .outType(Archaeology.class)
                .param().name("id").type(path).description("The ID of the site").dataType("integer").endParam()
                .responseMessage().code(200).message("Site successfully returned").endResponseMessage()
                .to("bean:siteService?method=viewArchaeologyById(${header.id})")

                .delete("/{id}").description("delete site by ID")
                .outType(Archaeology.class)
                .param().name("id").type(path).description("The ID of the site").dataType("integer").endParam()
                .responseMessage().code(200).message("Site successfully deleted").endResponseMessage()
                .to("bean:siteService?method=deleteArchaeologyById(${header.id})")

                .put("/{id}").description("Update a site").type(Archaeology.class)
                .param().name("id").type(path).description("The ID of the site to update").dataType("integer").endParam()
                .param().name("body").type(body).description("The site to update").endParam()
                .responseMessage().code(204).message("Site successfully updated").endResponseMessage()
                .to("direct:update-site");

        from("direct:update-site")
                .to("bean:siteService?method=updateArchaeologyById")
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(204))
                .setBody(constant(""));


    }

}