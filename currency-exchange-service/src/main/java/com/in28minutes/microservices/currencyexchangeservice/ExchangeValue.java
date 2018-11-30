package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ExchangeValue {

	@Id
	
	private long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal currencyExchange;
	
	private int port;
	public ExchangeValue(long id, String from, String to, BigDecimal currencyExchange) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.currencyExchange = currencyExchange;
	}
	public ExchangeValue() {
		super();
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
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
