package com.kingprice.conversion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Distance implements Serializable {
    private String incomingDistanceInd;

}
