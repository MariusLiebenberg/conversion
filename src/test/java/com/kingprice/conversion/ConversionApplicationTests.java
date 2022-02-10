package com.kingprice.conversion;

import com.kingprice.conversion.models.Conversion;
import com.kingprice.conversion.rest.ConversionController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConversionApplicationTests {
	@Autowired
	ConversionController cc;
	@Test
	void contextLoads() {
	}

	@Test
	public void testTemperatureBaselines() throws Exception{
		//Unit testing to test if the formula is still working as it should

		//Baseline testing for fahrenheit to celsius
		//Fahrenheit input of -40 should be equal to -40 ℃
		Conversion t2 = cc.convertToCelcius(new Conversion("F",-40,0));
		Assertions.assertEquals(t2.getConvertedValue(),-40);
		//Fahrenheit input of 32 should be equal to 0 ℃
		t2 = cc.convertToCelcius(new Conversion("F",32,0));
		Assertions.assertEquals(t2.getConvertedValue(),0);
		//Fahrenheit input of 212 should be equal to 100 ℃
		t2 = cc.convertToCelcius(new Conversion("F",212,0));
		Assertions.assertEquals(t2.getConvertedValue(),100);

		//Celsius input of -40 should be equal to -40℉
		 t2 = cc.convertToCelcius(new Conversion("C",-40,0));
		Assertions.assertEquals(t2.getConvertedValue(),-40);
		//Celsius input of 0 should be equal to 32℉
		t2 = cc.convertToCelcius(new Conversion("C",0,0));
		Assertions.assertEquals(t2.getConvertedValue(),32);
		//Celsius input of 100 should be equal to 212℉
		t2 = cc.convertToCelcius(new Conversion("C",100,0));
		Assertions.assertEquals(t2.getConvertedValue(),212);

	}

}
