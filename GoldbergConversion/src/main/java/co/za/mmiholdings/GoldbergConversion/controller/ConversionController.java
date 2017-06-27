package co.za.mmiholdings.GoldbergConversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.za.mmiholdings.GoldbergConversion.converter.Converter;
import co.za.mmiholdings.GoldbergConversion.model.ConversionData;

@RestController
public class ConversionController {

	@Autowired
	Converter converter;	

	/**
	 * Simple method to convert units based on the the type being passed.
	 * This method should ideally take an source and target value for the conversion.
	 * Given the time line and my lack of AngularJS knowledge I implemented a simpler solution.
	 * I will set data as if a source and target where values where supplied.
	 * 
	 * @param conversionType
	 * 		the type of conversion
	 * @param input
	 * 		the input value to be converted
	 * @return
	 * 	the converted value
	 */
	@RequestMapping(value="/convert", method = RequestMethod.GET)
	public ResponseEntity<BigDecimal> convert(@RequestParam(value = "conversionType") String conversionType,
			@RequestParam(value = "input") BigDecimal input) {
		
		HttpStatus httpStatus = HttpStatus.OK;
		
		ConversionData conversionData = new ConversionData(conversionType);
		
		BigDecimal convertedValue = converter.setConversionType(conversionData).convert(input);
		
		if (convertedValue == null) {
			httpStatus = HttpStatus.BAD_REQUEST;			
			
		}
		
		return new ResponseEntity<BigDecimal>(convertedValue, createStandardHeaders(), httpStatus);
		

	}
	
	public static HttpHeaders createStandardHeaders() {

        HttpHeaders headers = new HttpHeaders();

        headers.add("Access-Control-Allow-Origin", "*");

        headers.add("Access-Control-Allow-Headers", "Content-Type");

        headers.add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");

        return headers;

  }

}
