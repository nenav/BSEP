package xml.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import xml.soap.AccomodationCategoryClient;
import xml.soap.AccomodationClient;
import xml.soap.AccomodationTypeClient;
import xml.soap.MessageClient;
import xml.soap.ReplyClient;
import xml.soap.ReservationClient;
import xml.soap.ReviewClient;

@EnableWs
@Configuration
public class SoapConfiguration extends WsConfigurerAdapter{
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("xml.web_services");
		return marshaller;
	}

	@Bean
	public AccomodationTypeClient accomodationTypeClient(Jaxb2Marshaller marshaller) {
		AccomodationTypeClient client = new AccomodationTypeClient();
		client.setDefaultUri("https://localhost:8443/ws/accomodation-type.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public AccomodationCategoryClient accomodationCategoryClient(Jaxb2Marshaller marshaller) {
		AccomodationCategoryClient client = new AccomodationCategoryClient();
		client.setDefaultUri("https://localhost:8443/ws/accomodation-category.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public AccomodationClient accomodationClient(Jaxb2Marshaller marshaller) {
		AccomodationClient client = new AccomodationClient();
		client.setDefaultUri("https://localhost:8443/ws/accomodation.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public MessageClient messageClient(Jaxb2Marshaller marshaller) {
		MessageClient client = new MessageClient();
		client.setDefaultUri("https://localhost:8443/ws/message.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public ReplyClient replyClient(Jaxb2Marshaller marshaller) {
		ReplyClient client = new ReplyClient();
		client.setDefaultUri("https://localhost:8443/ws/reply.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public ReservationClient reservationClient(Jaxb2Marshaller marshaller) {
		ReservationClient client = new ReservationClient();
		client.setDefaultUri("https://localhost:8443/ws/reservation.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
	public ReviewClient reviewClient(Jaxb2Marshaller marshaller) {
		ReviewClient client = new ReviewClient();
		client.setDefaultUri("https://localhost:8443/ws/review.wsdl");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
	@Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection);
                context.addConstraint(securityConstraint);
            }
        };
        tomcat.addAdditionalTomcatConnectors(redirectConnector());
        return tomcat;
    }

    private Connector redirectConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(8091);
        connector.setSecure(false);
        connector.setRedirectPort(8444);
        return connector;
    }

}
