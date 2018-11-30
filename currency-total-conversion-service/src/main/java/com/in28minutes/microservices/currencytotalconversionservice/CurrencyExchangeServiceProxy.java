package com.in28minutes.microservices.currencytotalconversionservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(name="Currency-Exchange-Service",url="localhost:8000")
@FeignClient(name="Currency-Exchange-Service")
@RibbonClient(name="Currency-Exchange-Service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyTotalCalculator retrieveExchangeValue
	( @PathVariable ("from")String from,@PathVariable("to") String to);

	
}


