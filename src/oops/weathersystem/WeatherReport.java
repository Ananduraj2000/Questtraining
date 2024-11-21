package oops.weathersystem;

public class WeatherReport extends WeatherCondition{

    public WeatherReport(City[] city) {
        super(city);
    }

    @Override
    public void displayCondition() {
        System.out.println("Cities having specific weather conditions ");
        for(String condition :new String[]{"Sunny","Rainy","Foggy"}){
            boolean found = false;
            for(City city : city){
                if(city!=null && city.equals(city.getName())){
                    System.out.println(city.getName());
                    found = true;
                }
            }
            System.out.print( condition);
        }

    }
}
