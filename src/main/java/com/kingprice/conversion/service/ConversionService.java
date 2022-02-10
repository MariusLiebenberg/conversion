package com.kingprice.conversion.service;


import com.kingprice.conversion.models.Temperature;
import org.springframework.stereotype.Service;



@Service
public class ConversionService {


    public Temperature convertUnit(Temperature t){
        try {
            double i = 0;
            switch(t.getInputTempInd()){
                case "F":
                    i =(t.getInputValue()-32)*(5.0/9.0);
                        break;
                case "C":
                    i = 9.0/5.0*t.getInputValue()+32;
                        break;

            }
            t.setConvertedValue(i);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return t;
        }

    }
}
