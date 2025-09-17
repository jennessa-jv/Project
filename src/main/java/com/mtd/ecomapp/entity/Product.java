package com.mtd.ecomapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private String category;
	private float price;
	private String tags;
	private int stock;
	
	
	public Product() {}
	public Product(String name, String description, String category, float price, String tags, int stock) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.tags = tags;
		this.stock = stock;
	}
		
		
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
