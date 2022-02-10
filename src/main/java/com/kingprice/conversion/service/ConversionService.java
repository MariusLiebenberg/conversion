package com.kingprice.conversion.service;


import com.kingprice.conversion.models.Conversion;
import org.springframework.stereotype.Service;



@Service
public class ConversionService {


    public Conversion convertUnit(Conversion t){
        try {
            double i = 0;
            switch(t.getInputTempInd()){
                //When fahrenheit value comes in calculate metric value
                case "F":
                    i =(t.getInputValue()-32)*(5.0/9.0);
                        break;
                //When celsius value comes in calculate imperial value
                case "C":
                    i = 9.0/5.0*t.getInputValue()+32;
                        break;
                case "M":
                    i = t.getInputValue()*1.609347;
                        break;
                case "K":
                    i = t.getInputValue()/1.609347;
                        break;


            }
            //sets the conversion object
            t.setConvertedValue(i);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //return object
            return t;
        }

    }
}
