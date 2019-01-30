package com.cignex.proxyservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cignex.model.CurrencyConversionbean;

//@FeignClient(name = "currency-exchange-service-prac")
@FeignClient(name="zuul-api-gateway-server-prac")
@RibbonClient(name="currency-exchange-service-prac")
public interface CurrencyExchangeServiceProxy {
	@GetMapping("/currency-exchange-service-prac/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionbean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to);
}