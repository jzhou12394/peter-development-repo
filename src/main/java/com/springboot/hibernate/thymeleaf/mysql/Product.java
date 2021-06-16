//copyright www.codejava.net
package com.springboot.hibernate.thymeleaf.mysql;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Product {

	private Long id;
	@Size(min=1, max=30, message= "Name must be between 1 to 30 characters" )
	private String name;
	@Size(min=2, max=30, message= "Brand must be between 2 to 30 characters")
    private String brand;
	@Size(min=2, max=30, message = "Madein field should not be less than 2 characters or greater than 30 characters")
    private String madein;
	@NotNull(message="'Price' field can not be empty")
	@DecimalMin(value = "0.1", inclusive = true)
	@DecimalMax(value = "999999.9", inclusive = true)
    private BigDecimal price;
	
    public Product() {
		super();
	}
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}
