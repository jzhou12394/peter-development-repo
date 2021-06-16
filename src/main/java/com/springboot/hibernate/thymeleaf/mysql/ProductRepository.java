package com.springboot.hibernate.thymeleaf.mysql;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	 
}
