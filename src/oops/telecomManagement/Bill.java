package oops.telecomManagement;


import java.io.*;
import java.util.ArrayList;



public class Bill {
    ArrayList<Subscriber> subscribers=new ArrayList<>();
    ArrayList<CallHistory> callHistories=new ArrayList<>();

    private final String SUBSCRIBERS_FILE = "subscribers.dat";
    private final String CALL_HISTORY_FILE = "call_Histories.dat";

    public Bill() {
        loadSubscribers();
        loadCallHistory();

    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added successfully.");
    }

    public void updateBalance(int id, double newBalance) {
        for (Subscriber s : subscribers) {
            if (s.getId() == id) {
                s.setBalance(newBalance);
                System.out.println("Balance updated successfully.");
                return;
            }
        }
        System.out.println("Subscriber not found.");
    }

    public void listSubscribers() {
        for (Subscriber s : subscribers) {
            System.out.println(s.toString());
        }
    }

    public void callRecord(CallHistory callHistory) {
        callHistories.add(callHistory);
        System.out.println("Call Record added successfully.");
    }

    public void displayCallHistory(int id) {
        for (CallHistory callHistory : callHistories) {
            if(callHistory.toString().contains("Subscriber Id"+id)){
                System.out.println(callHistory.toString());
            }
        }

    }

    public void generateBill(int id) {
        double total = 0;
        for (CallHistory c : callHistories) {
            if (c.getS_id() == id) {
                switch (c.getCallType()) {
                    case "Local":
                        total += c.getDuration() * 1;
                        break;
                    case "STD":
                        total += c.getDuration() * 2;
                        break;
                    case "ISD":
                        total += c.getDuration() * 5;
                        break;
                }
            }
        }
        System.out.println("Total bill: ₹" + total);
    }

    private void saveToFile(String fileName,Object object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(object);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }

    }
    public void saveData() {

        saveToFile(SUBSCRIBERS_FILE, subscribers);
        saveToFile(CALL_HISTORY_FILE, callHistories);
        System.out.println("Data saved successfully.");
    }


    private Object loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return null;
        }
    }

    private void loadSubscribers() {
        subscribers = (ArrayList<Subscriber>) loadFromFile(SUBSCRIBERS_FILE);
        if (subscribers == null) subscribers = new ArrayList<>();
    }

    private void loadCallHistory() {
        callHistories = (ArrayList<CallHistory>) loadFromFile(CALL_HISTORY_FILE);
        if (callHistories == null) callHistories = new ArrayList<>();
    }



}
