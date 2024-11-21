package oops.weathersystem;

public class City {

    private String name;
    private double currentTemperature;
    private int humidity;
    private String weatherCondition;

    public City(String name, double temperature, int humidity, String weatherCondition) {
        this.name = name;
        this.currentTemperature = temperature;
        this.humidity = humidity;
        this.weatherCondition = weatherCondition;
    }

    public String getName() {
        return name;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }


    @Override
    public String toString() {
        return "City [name=" + name + ", currentTemperature=" + currentTemperature + "" +
                ", humidity="+humidity+", weatherCondition="+weatherCondition+"]";

    }


}

