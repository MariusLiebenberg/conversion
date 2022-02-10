package com.kingprice.conversion.rest;

import com.kingprice.conversion.models.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kingprice.conversion.service.ConversionService;

@RestController
@RequestMapping(path = "/conversionApp")

public class ConversionController {
    @Autowired
    private ConversionService temperatureService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path="/convertUnit",consumes = "application/json",produces = "application/json")
    public Temperature convertToCelcius(@RequestBody  Temperature t){
        return temperatureService.convertUnit(t);
    }



}
