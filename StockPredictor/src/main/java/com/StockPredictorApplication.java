package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.repository.StockDataRepository;

@SpringBootApplication
//@EnableJpaRepositories(excludeFilters = {
//		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { StockDataRepository.class }) })
public class StockPredictorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPredictorApplication.class, args);
	}

}
