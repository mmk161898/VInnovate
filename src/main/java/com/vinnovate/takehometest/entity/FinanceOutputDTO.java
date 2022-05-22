package com.vinnovate.takehometest.entity;

public class FinanceOutputDTO {

	private int noOfTransactions;
	private double avgTransactionValue;
	public int getNoOfTransactions() {
		return noOfTransactions;
	}
	public void setNoOfTransactions(int noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}
	public double getAvgTransactionValue() {
		return avgTransactionValue;
	}
	public void setAvgTransactionValue(double avgTransactionValue) {
		this.avgTransactionValue = avgTransactionValue;
	}
	
	
}
