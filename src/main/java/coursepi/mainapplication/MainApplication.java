package coursepi.mainapplication;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.ConnectionFactory;

@SpringBootApplication
@EnableJpaRepositories
public class MainApplication {


    @Value("${spring.activemq.broker-url}")
    String JMS_BROKER_URL;

	@Bean
	public ConnectionFactory connectionFactory() {
		return new ActiveMQConnectionFactory( JMS_BROKER_URL);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainApplication.class, args);
		
		
	}

}
