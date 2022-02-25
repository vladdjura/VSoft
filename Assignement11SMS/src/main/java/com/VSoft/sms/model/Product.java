package com.VSoft.sms.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String productName;
	private double price;
	@Column(nullable = false)
	private String brand;
	private int quantity;
	@CreatedDate
	private Timestamp productCreated;
	
	@UpdateTimestamp
	private Timestamp productUpdated;
	
	@Transient
	private long catId;
	
	@OneToOne
	@JoinColumn(name="category_id",referencedColumnName = "id")
	private Category category;

	public Product(String productName, double price, String brand, int quantity, Timestamp productCreated,
			Timestamp productUpdated, Category category) {
		super();
		this.productName = productName;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
		this.productCreated = productCreated;
		this.productUpdated = productUpdated;
		this.category = category;
	}
public Product() {
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Timestamp getProductCreated() {
	return productCreated;
}
public void setProductCreated(Timestamp productCreated) {
	this.productCreated = productCreated;
}
public Timestamp getProductUpdated() {
	return productUpdated;
}
public void setProductUpdated(Timestamp productUpdated) {
	this.productUpdated = productUpdated;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

public long getCatId() {
	return catId;
}
public void setCatId(long catId) {
	this.catId = catId;
}
@Override
public String toString() {
	return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", brand=" + brand
			+ ", quantity=" + quantity + ", productCreated=" + productCreated + ", productUpdated=" + productUpdated
			+ ", catId=" + catId + ", category=" + category + "]";
}


}
