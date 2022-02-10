package com.kingprice.conversion;

import com.kingprice.conversion.models.Temperature;
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
	public void t() throws Exception{
		Temperature t = new Temperature("F",-40,0);
		Temperature t2 = cc.convertToCelcius(new Temperature("F",-40,0));
		Assertions.assertEquals(t2.getConvertedValue(),-40);

		t2 = cc.convertToCelcius(new Temperature("F",32,0));
		Assertions.assertEquals(t2.getConvertedValue(),0);

		t2 = cc.convertToCelcius(new Temperature("F",212,0));
		Assertions.assertEquals(t2.getConvertedValue(),100);

	}

}
