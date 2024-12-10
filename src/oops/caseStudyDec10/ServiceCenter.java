package oops.caseStudyDec10;

import java.util.HashSet;
import java.util.Set;

public class ServiceCenter <T extends Vehicle>{
    private Set<T> servicedVehicles=new HashSet<>();

    public void addServicedVehicle(T vehicle){
        servicedVehicles.add(vehicle);
    }

    public Set<T> getServicedVehicles() {
            return servicedVehicles;
    }
}
