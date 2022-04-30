package nl.utwente.di.temperature;

public class Converter {

    public static double convertCelsius(String degree){
        return (Double.parseDouble(degree) * 9/5) + 32;
    }
}
