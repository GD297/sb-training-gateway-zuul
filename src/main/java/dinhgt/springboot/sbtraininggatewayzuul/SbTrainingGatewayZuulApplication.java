package dinhgt.springboot.sbtraininggatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SbTrainingGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbTrainingGatewayZuulApplication.class, args);
	}

}
