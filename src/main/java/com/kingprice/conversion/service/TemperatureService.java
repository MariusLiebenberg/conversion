package com.kingprice.conversion.service;


import com.kingprice.conversion.models.Temperature;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {


    public Temperature convertTemperature(Temperature t){
        try {
            if(t.getInputTempInd().equals("F")){
                t.setConvertedValue((t.getInputValue()-32)*(5.0/9.0));
            }
            else if (t.getInputTempInd().equals("C")){
                t.setConvertedValue(9.0/5.0*t.getInputValue()+32);
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
