package com.kingprice.conversion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conversion implements Serializable {
    //a string indicator that indicates if the incoming value is imperial or metric.
    private String inputTempInd;
    //incoming value
    private double inputValue;
    //calculated value
    private double convertedValue;

}
