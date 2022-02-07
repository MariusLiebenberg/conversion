package com.kingprice.conversion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Temperature implements Serializable {
    //a string indicator that indicates if the incoming temp is celcius or farhenheit.
    private String inputTempInd;
    //incoming temperature
    private double inputValue;
    //calculated value
    private double convertedValue;

}
