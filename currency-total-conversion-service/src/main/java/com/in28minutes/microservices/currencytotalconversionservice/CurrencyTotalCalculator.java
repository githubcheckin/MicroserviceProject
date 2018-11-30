package com.in28minutes.microservices.currencytotalconversionservice;

import java.math.BigDecimal;

public class CurrencyTotalCalculator {
	
	private long id;
	private String from;
	private String to;
	private  BigDecimal currencyExchange;
	private BigDecimal quantity;
	private BigDecimal calculatedAmount;
	private int port;
	
	public CurrencyTotalCalculator() {
		
	}
	public long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getCurrencyExchange() {
		return currencyExchange;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}
	public CurrencyTotalCalculator(long id, String from, String to, BigDecimal currencyexchange, BigDecimal quantity,
			BigDecimal calculatedAmount,int Port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyExchange = currencyexchange;
		this.quantity = quantity;
		this.calculatedAmount = calculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
