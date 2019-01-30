package com.cignex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cignex.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
