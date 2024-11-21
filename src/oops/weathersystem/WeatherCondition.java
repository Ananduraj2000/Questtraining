package oops.weathersystem;

public abstract class WeatherCondition {
    protected City[] city;

    public WeatherCondition(City[] city) {
        this.city = city;
    }

    public abstract void displayCondition();
}
