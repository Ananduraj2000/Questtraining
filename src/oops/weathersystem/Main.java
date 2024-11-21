package oops.weathersystem;

public class Main {
    public static void main(String[] args) {
        City c1=new City("Munnar",16.2,40,"Foggy");
        City c2=new City("Tvm",28.2,40,"Sunny");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println();

        WeatherCalculation wc=new WeatherCalculation();
        wc.addCity(new City("Kochi",30.2,25,"Sunny"));
        wc.addCity(new City("Kollam",22.3,50,"Rainy"));
        wc.addCity(new City("Kottayam",81,30,"Sunny"));
        wc.addCity(new City("Idukki",20,18,"Foggy"));

        wc.calculateExtremes();
        wc.displayAlert();
        wc.displayCities();
        wc.calculateHumidity();

    }
}
