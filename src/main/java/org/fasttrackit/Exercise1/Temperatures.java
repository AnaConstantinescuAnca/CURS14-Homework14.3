package org.fasttrackit.Exercise1;

public class Temperatures {
    private double temperature;

    public Temperatures(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public static double fahreinhetToCelsius(double temperature){
        double result = (temperature -32) * 5/9;
        return result;
    }

    public  static double celsiusToFahreinhert(double temperature){
        double result = temperature*9/5 + 32;
        return  result;
    }

    public static void main(String[] args) {
        double tCelsius = 0;
        Temperatures temperatures = new Temperatures(tCelsius);

        System.out.println(String.format(" %f grades Celsius = %f grades Fahreinhert ",
                tCelsius, celsiusToFahreinhert(tCelsius)));


        double tFahreinhert = 100;
        System.out.println(String.format(" %f grades Fahreinhert = %f grades  Celsius",
                tFahreinhert, fahreinhetToCelsius(tFahreinhert)));


        tFahreinhert = 0;
        System.out.println(String.format(" %f grades Fahreinhert = %f grades  Celsius",
                tFahreinhert, fahreinhetToCelsius(tFahreinhert)));


        tFahreinhert=50;
        System.out.println(String.format(" %f grades Fahreinhert = %f grades  Celsius",
                tFahreinhert, fahreinhetToCelsius(tFahreinhert)));



    }
}
