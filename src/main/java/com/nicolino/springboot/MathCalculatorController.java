package com.nicolino.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathCalculatorController {
	@GetMapping("sum-two-values")
	public String sumTwoValues(@RequestParam String value1, @RequestParam String value2) {
		Double result =  Double.parseDouble(value1) +  Double.parseDouble(value2);
		return Double.toString(result);
	}
	@GetMapping("calculate-distance")
	public String calculateDistance(@RequestParam String x1, @RequestParam String x2, @RequestParam String y1, @RequestParam String y2) {
		Double result =  (Double.parseDouble(x2) -  Double.parseDouble(x1)) * (Double.parseDouble(x2) -  Double.parseDouble(x1)) + (Double.parseDouble(y2) - Double.parseDouble(y1)) * (Double.parseDouble(y2) - Double.parseDouble(y1));
		result = Math.sqrt(result);
		return Double.toString(result);
	}
}