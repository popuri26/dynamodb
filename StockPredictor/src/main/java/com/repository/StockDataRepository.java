package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.StockData;

@Repository
public interface StockDataRepository extends CrudRepository<StockData, String> {

}