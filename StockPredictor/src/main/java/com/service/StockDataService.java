package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.StockData;
import com.repository.StockDataRepository;

@Service
public class StockDataService {

	@Autowired
	private StockDataRepository stockDataRepository;

	public StockData create(StockData data) {
		return stockDataRepository.save(data);
	}

	public StockData read(String symbol) {
		return stockDataRepository.findById(symbol).orElse(new StockData(symbol));
	}

	public StockData update(StockData data) {
		return stockDataRepository.save(data);
	}

	public void delete(String symbol) {
		stockDataRepository.delete(new StockData(symbol));
	}
}
