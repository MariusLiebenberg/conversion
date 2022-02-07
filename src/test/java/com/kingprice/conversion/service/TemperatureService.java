package com.kingprice.conversion.service;


import com.kingprice.conversion.models.Temperature;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {


    public Temperature convertTemperature(Temperature t){
        try {
            if(t.getInputTempInd().equals("F")){
                t.setConvertedValue((t.getConvertedValue()-32)*5/9);
            }
            else if (t.getInputTempInd().equals("C")){
                t.setConvertedValue((t.getConvertedValue()*(9/5))+32);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return t;
        }

    }
}
