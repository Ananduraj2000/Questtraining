package oops.telecomManagement;

import java.io.Serializable;

public class Subscriber implements Serializable {
    private int id;
    private String name;
    private int phoneNo;
    private String planType;
    private double balance;


    public Subscriber(int id, String name, int phoneNo, String planType, double balance) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.planType = planType;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public String toString(){
        return "Subscriber[id= "+id+",name=" + name +",phoneNo= " +phoneNo+",planType= " +planType+",balance= "+
                balance+"]";
   }




}
