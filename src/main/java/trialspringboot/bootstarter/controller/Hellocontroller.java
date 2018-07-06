package trialspringboot.bootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	@RequestMapping("/hello")
	public String sayhi() {
		return "hi";
	}
	
	@RequestMapping("/dist")
	public int calculatorDist(@RequestParam int num1,
			                  @RequestParam int num2) {
		//int abc= (num * num); 
		int  output= (num1 + num2);
		return output;
		
	}
	
	@RequestMapping("/distance")
	public double CalDist(@RequestParam("x1") int num1,
	                      @RequestParam("x2") int num2,
	                      @RequestParam("y1") int num3,
		                  @RequestParam("y2") int num4) {
    	double distance=Math.sqrt(Math.pow(num2 - num1, 2)+ Math.pow(num4 - num3, 2));
    	double output1=  (distance);
    	return output1;
		
	}
}
