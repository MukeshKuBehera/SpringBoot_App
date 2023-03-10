package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	private String id;
	private Integer prodId;
	private String prodName;
	private Double prodCost;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String id, Integer prodId, String prodName, Double prodCost) {
		super();
		this.id = id;
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	
	
}
