package com.kingprice.conversion.rest;

import com.kingprice.conversion.models.Conversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kingprice.conversion.service.ConversionService;

@RestController
@RequestMapping(path = "/conversionApp")

public class ConversionController {
    @Autowired
    private ConversionService temperatureService;
//    set the cross origin to the frontend url otherwise you are going to have a bad time
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path="/convertUnit",consumes = "application/json",produces = "application/json")
    public Conversion convertToCelcius(@RequestBody Conversion t){
        return temperatureService.convertUnit(t);
    }



}
