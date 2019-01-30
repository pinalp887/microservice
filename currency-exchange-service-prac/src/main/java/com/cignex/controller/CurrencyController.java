package com.cignex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cignex.model.ExchangeValue;
import com.cignex.repository.ExchangeValueRepository;

@RestController
public class CurrencyController {
	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository repository;
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	private ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue=repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		System.out.println(exchangeValue.getPort());
		logger.info("response {"+exchangeValue+"}");
		return exchangeValue; 
	}
}
