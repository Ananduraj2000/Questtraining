package oops.weathersystem;

public class WeatherCalculation {
    private City[] cities=new City[10];
    private int cCount=0;

    public void addCity(City city) {
        if(cCount>=cities.length){
            System.out.println("Cannot add more cities");
            return;
        }
        cities[cCount]=city;
        cCount++;
    }

    public void displayCities(){
        System.out.println("Details of added cities :");
        for(int i=0;i<cCount;i++){
            System.out.println(cities[i]);
        }

    }

    public void calculateExtremes() {
        if (cCount == 0) {
            System.out.println("No cities to analyze!");
            return;
        }
        City highestTemp = cities[0];
        City lowestTemp = cities[0];
        for (int i = 1; i < cCount; i++) {
            if (cities[i].getCurrentTemperature() > highestTemp.getCurrentTemperature()) {
                highestTemp = cities[i];
            }
            if (cities[i].getCurrentTemperature() < lowestTemp.getCurrentTemperature()) {
                lowestTemp = cities[i];
            }
        }
        System.out.println("City with the Highest Temperature: " +
                highestTemp.getName() +" "+ highestTemp.getCurrentTemperature() );

        System.out.println("City with the Lowest Temperature: " + lowestTemp.getName() +" "
                + lowestTemp.getCurrentTemperature() );
    }

    public void calculateHumidity() {
        System.out.println("\n Cities having humidity more than 80% :");
        for(int i=0;i<cCount;i++){
            if(cities[i].getHumidity()>80){
                System.out.println(cities[i].getName());
                return;
            }
        }
        System.out.println("No cities having humidity more than 80% :");
    }

    public void displayAlert(){
        System.out.println("\n Alert Alert Alert");
        System.out.println();
        for(int i=0;i<cCount;i++){
            if(cities[i].getCurrentTemperature()>40){
                System.out.println(cities[i].getName()+" has extreme heat!!! WARNING!!!"
                        +cities[i].getCurrentTemperature());
            }
            if(cities[i].getHumidity()<20){
                System.out.println(cities[i].getName()+" has humidity low!!! WARNING!!!"+cities[i].getHumidity());
            }
        }
        System.out.println();
    }

    public void reportConditions(){

    }


}
