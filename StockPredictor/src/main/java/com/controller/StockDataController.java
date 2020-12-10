package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.entity.StockData;
import com.service.StockDataService;

@RestController
public class StockDataController {

	@Autowired
	private StockDataService stockDataService;

	@RequestMapping(value = "/data", produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<StockData> create(@RequestBody StockData data) {
		try {
			StockData response = stockDataService.create(data);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (AmazonServiceException e) {
			throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getMessage(), e);
		} catch (AmazonClientException e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
		}
	}

	@RequestMapping(value = "/data/{symbol}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<StockData> readUser(@PathVariable String symbol) {
		try {
			StockData response = stockDataService.read(symbol);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (AmazonServiceException e) {
			throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getMessage(), e);
		} catch (AmazonClientException e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
		}
	}

	@RequestMapping(value = "/data", produces = { "application/json" }, method = RequestMethod.PUT)
	public ResponseEntity<StockData> update(@RequestBody StockData data) {
		try {
			StockData response = stockDataService.update(data);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (AmazonServiceException e) {
			throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getMessage(), e);
		} catch (AmazonClientException e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
		}
	}

	@RequestMapping(value = "/data/{symbol}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<StockData> delete(@PathVariable String symbol) {
		try {
			stockDataService.delete(symbol);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} catch (AmazonServiceException e) {
			throw new ResponseStatusException(HttpStatus.valueOf(e.getStatusCode()), e.getMessage(), e);
		} catch (AmazonClientException e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);
		}
	}
}
