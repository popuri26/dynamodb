package com.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "IntradayData")
public class StockData {

	@DynamoDBHashKey(attributeName = "key")
	private String key;
	
	@DynamoDBAttribute(attributeName = "timestamp")
	private String timestamp;
	
	@DynamoDBAttribute(attributeName = "symbol")
	private String symbol;

	@DynamoDBAttribute(attributeName = "low")
	private String low;

	@DynamoDBAttribute(attributeName = "high")
	private String high;

	@DynamoDBAttribute(attributeName = "open")
	private String open;
	
	@DynamoDBAttribute(attributeName = "close")
	private String close;
	
	@DynamoDBAttribute(attributeName = "volume")
	private String volume;

	public StockData(String symbol) {
		// TODO Auto-generated constructor stub
		this.symbol = symbol;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getKey() {
		return key;
	}

	private void setKey(String key) {
		this.key = String.join("-", this.symbol,this.timestamp);
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
}
