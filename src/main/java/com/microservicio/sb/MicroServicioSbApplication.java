package com.microservicio.sb;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
public class MicroServicioSbApplication {

	/**
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroServicioSbApplication.class, args);
	}

	/**
	 * configuration data source
	 * @param dataSourceProperties
	 * @return
	 * @author Nicolas.Morales
	 */
	@Bean
	public DataSource dataSource(DataSourceProperties dataSourceProperties) {
		return dataSourceProperties.initializeDataSourceBuilder().build();
	}

}
