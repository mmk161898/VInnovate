package com.vinnovate.takehometest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Finance {
	@Id
	private String id;
	private String date;
	private double amount;
	private String merchant;
	private String type;
	private String relatedTransaction;
	
	public Finance() {
		
	}
	
	public Finance(String id, String date, double amount, String merchant, String type, String relatedTransaction) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.merchant = merchant;
		this.type = type;
		this.relatedTransaction = relatedTransaction;
	}
	public String getRelatedTransaction() {
		return relatedTransaction;
	}
	public void setRelatedTransaction(String relatedTransaction) {
		this.relatedTransaction = relatedTransaction;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMerchant() {
		return merchant;
	}
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
