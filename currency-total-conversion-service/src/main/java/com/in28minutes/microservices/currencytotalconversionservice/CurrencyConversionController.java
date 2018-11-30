package com.in28minutes.microservices.currencytotalconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	//for learning 
	@Autowired
	
private CurrencyExchangeServiceProxy proxy;
//Using RestTemplate


	@GetMapping("/currency-total-conversion-service/id/from/{from}/to/{to}/quantity/{quantity}/port")
	CurrencyTotalCalculator CurrencyConvertor(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
		
		Map <String,String>uriVariables = new HashMap<>();
		
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyTotalCalculator> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyTotalCalculator.class,uriVariables);
		
		CurrencyTotalCalculator calculator = responseEntity.getBody();
		return  new CurrencyTotalCalculator(calculator.getId(),from,to,calculator.getCurrencyExchange(),quantity,quantity.multiply(calculator.getCurrencyExchange()),calculator.getPort());	
	
	}
	//Using Feign
	@GetMapping("/currency-total-conversion-service-feign/id/from/{from}/to/{to}/quantity/{quantity}/port")
	CurrencyTotalCalculator CurrencyConvertorFeign(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
	
		
		
		
		CurrencyTotalCalculator response = proxy.retrieveExchangeValue(from, to);
		
		return  new CurrencyTotalCalculator(response.getId(),from,to,response.getCurrencyExchange(),quantity,quantity.multiply(response.getCurrencyExchange()),response.getPort());	
		
		
		

		
	}
}
