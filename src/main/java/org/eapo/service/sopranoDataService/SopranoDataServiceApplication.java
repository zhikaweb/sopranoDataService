package org.eapo.service.sopranoDataService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {
		"org.eapo.service.sopranoDataService.ws",
		"org.eapo.service.sopranoDataService.service",
		"org.eapo.service.sopranoDataService.model",
		"org.eapo.service.sopranoDataService.dto",
		"org.eapo.service.sopranoDataService.repository",
		"org.eapo.service.sopranoDataService.rest",
		"org.eapo.service.sopranoDataService.utils",
})
public class SopranoDataServiceApplication extends WsConfigurerAdapter {

	private static Logger logger = LoggerFactory.getLogger(SopranoDataServiceApplication.class.getName());

	public static void main(String[] args) {
		logger.info("Starting SopranoDataService...");
		SpringApplication.run(SopranoDataServiceApplication.class, args);
		logger.info("SopranoDataService is ready!");
	}

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}

	@Bean(name = "soprano-data-upload")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema sopranoDataUploadSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SopranoUploadPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://service.data.soprano.eapo.org");
		wsdl11Definition.setSchema(sopranoDataUploadSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema sopranoDataUploadSchema() {
		return new SimpleXsdSchema(new ClassPathResource("soprano-data-upload.xsd"));
	}
}
