package com.synectiks.cms;

import com.synectiks.cms.model.Company;
import com.synectiks.cms.model.Product;
import com.synectiks.cms.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaAuditing
public class CollegeManagementSystemApplication implements CommandLineRunner {
	@Autowired
	CompanyRepository companyRepository;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplicationBuilder(CollegeManagementSystemApplication.class).build();
		app.run(args);
		//SpringApplication.run(CollegeManagementSystemApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Apple company & products
		 */
		// initial company and products
		Product iphone7 = new Product("Iphone 7");
		Product iPadPro = new Product("IPadPro");

		Set<Product> appleProducts = Stream.of(iphone7, iPadPro).collect(Collectors.toSet());

		Company apple = new Company("Apple", appleProducts);

		iphone7.setCompany(apple);
		iPadPro.setCompany(apple);

		// send message to ActiveMQ
		companyRepository.save(apple);

		/*
		 * Samsung company and products
		 */
		Product galaxyS8 = new Product("Galaxy S8");
		Product gearS3 = new Product("Gear S3");

		Set<Product> samsungProducts = Stream.of(galaxyS8, gearS3).collect(Collectors.toSet());

		Company samsung = new Company("Samsung", samsungProducts);

		galaxyS8.setCompany(samsung);
		gearS3.setCompany(samsung);

		/*
		 * send message to ActiveMQ
		 */
		companyRepository.save(samsung);
	}
}
