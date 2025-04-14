package com.abhi.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message = "Name is mandatory")
	@Size(min = 3, max= 14, message = "name must be between 3 to 14")
	private String name;
	
	@NotNull(message = "Price is mandatory")
	private Integer price;
	
	@NotNull(message = "Quantity is mandatory")
	private Integer qty;
	
}
