package com.souvik.hibernatemappings;

import com.souvik.hibernatemappings.model.Employee;
import com.souvik.hibernatemappings.model.Laptop;
import com.souvik.hibernatemappings.repository.EmployeeRepository;
import com.souvik.hibernatemappings.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingsApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private LaptopRepository laptopRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setId(7311L);
		employee.setName("Tony Stark");
		employee.setEmail("tonystark@xyz.com");

		Laptop laptop = new Laptop();
		laptop.setId(11007025L);
		laptop.setBrand("Apple");
		laptop.setModel("Macbook M2 Pro");

		employee.setLaptop(laptop);
		laptop.setEmployee(employee);

		employeeRepository.save(employee);
	}

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingsApplication.class, args);
	}
}
