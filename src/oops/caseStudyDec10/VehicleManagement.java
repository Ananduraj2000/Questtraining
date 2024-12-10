package oops.caseStudyDec10;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class VehicleManagement {
    private static final double ORIGINAL_PRICE = 50000.0;
    private static final double DEPRECIATION_RATE = 1000.0;

    public static void manageVehicles(){
//        ElectricVehicle ev1=new ElectricVehicle("EV001", "BMW", "i3", 2020, 45000, "Anandu", 40.0, 200.0);
//        ElectricVehicle ev2=new ElectricVehicle("EV002", "BMW", "i4", 2014, 55000, "Mary", 50.0, 200.0);
//        CombustionEngineVehicle c1=new CombustionEngineVehicle("CE001", "BMW", "3 Series", 2010, 80000, "John", "Petrol", 2.0);
//        CombustionEngineVehicle c2=new CombustionEngineVehicle("CE002", "Audi", "q Series", 2018, 60000, "Samuel", "diesel", 3.0);
//
//        ServiceCenter<ElectricVehicle> evServiceCenter=new ServiceCenter<>();
//        ServiceCenter<CombustionEngineVehicle> ceVehicleServiceCenter=new ServiceCenter<>();
//
//        evServiceCenter.addServicedVehicle(ev1);
//        evServiceCenter.addServicedVehicle(ev2);
//        ceVehicleServiceCenter.addServicedVehicle(c1);
//        ceVehicleServiceCenter.addServicedVehicle(c2);
//
//        /*Mileage greater than 50,000 km.
//        Vehicles manufactured before 2015*/
//
//        Predicate<Vehicle> highMileage = v -> v.getMileage() > 50000;
//        Predicate<Vehicle> oldVehicle = v -> v.getYear() < 2015;
//
//        Consumer<Vehicle> details= v->
//                System.out.println("VIN: " + v.getVin() + ", Mileage: " + v.getMileage() + " km");
//
//        System.out.println("\nFor Electric vehicle:");
//        evServiceCenter.getServicedVehicles().forEach(details);
//
//        System.out.println("\nFor Combustion engine Vehicle:");
//        ceVehicleServiceCenter.getServicedVehicles().forEach(details);
//
//        Supplier<Vehicle> randomVehicle =()->{
//
//            Random random=new Random();
//            if(random.nextBoolean()){
//                return new ElectricVehicle(
//                        "Ev"+random.nextInt(1000),
//                        "BMW",
//                        "i" + random.nextInt(10),
//                        2015 + random.nextInt(10),
//                        random.nextInt(100000),
//                        "RandomOwner",
//                        random.nextDouble() * 100,
//                        random.nextDouble() * 300
//                );
//            }
//        //};
//
  }
//
}
