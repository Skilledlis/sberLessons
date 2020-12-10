package org.sber.temperature;

public class Temperature {

    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public Temperature(){}

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void setTemperature(double temperature){
        celsius = temperature;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public double getKelvin() {
        kelvin = celsius + 273.15;
        return kelvin;
    }
}
