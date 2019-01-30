package com.cignex.model;

import java.math.BigDecimal;

public class CurrencyConversionbean {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal claculatedAmount;
	private int port;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getClaculatedAmount() {
		return claculatedAmount;
	}

	public void setClaculatedAmount(BigDecimal claculatedAmount) {
		this.claculatedAmount = claculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CurrencyConversionbean(long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal claculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.claculatedAmount = claculatedAmount;
		this.port = port;
	}

	public CurrencyConversionbean() {
	}

}
