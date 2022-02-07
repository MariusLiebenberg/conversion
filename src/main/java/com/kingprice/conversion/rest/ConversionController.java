package com.kingprice.conversion.rest;

import com.kingprice.conversion.models.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kingprice.conversion.service.TemperatureService;

@RestController
@RequestMapping(path = "/conversionApp")

public class ConversionController {
    @Autowired
    private TemperatureService temperatureService;

    @PostMapping(path="/convertToCelcius",consumes = "application/json",produces = "application/json")
    public Temperature convertToCelcius(@RequestBody  Temperature t){
        return temperatureService.convertTemperature(t);
    }



}
