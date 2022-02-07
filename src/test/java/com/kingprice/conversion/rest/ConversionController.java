package com.kingprice.conversion.rest;

import com.kingprice.conversion.models.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kingprice.conversion.service.TemperatureService;

@RestController
@RequestMapping(path = "/conversionApp")

public class ConversionController {
    @Autowired
    private TemperatureService temperatureService;

    @GetMapping(path="/convertToCelcius/{t}")
    public Temperature convertToCelcius(@PathVariable(name = "t") Temperature t){
        return temperatureService.convertTemperature(t);
    }



}
