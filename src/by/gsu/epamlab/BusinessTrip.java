package by.gsu.epamlab;

public class BusinessTrip {
    private String accountName;
    private int numberOfDays;
    private static final int DAYLY_ALLOWANCE_RATE = 200;
    private int transportationExpenses;

    public BusinessTrip(String accountName, int numberOfDays, int transportationExpenses) {
        this.accountName = accountName;
        this.numberOfDays = numberOfDays;
        this.transportationExpenses = transportationExpenses;
    }

    public BusinessTrip() {
    }

    public String getAccountName() {
        return accountName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }


    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    @Override
    public String toString() {
        return accountName + ";" + numberOfDays + ";" + transportationExpenses + ";" + convertToByn(getTotal());
    }

    public void show(){
        System.out.println("account" + accountName);
        System.out.println("rate" + DAYLY_ALLOWANCE_RATE);
        System.out.println("transport" + transportationExpenses);
        System.out.println("days" + numberOfDays);
        System.out.println("total" + convertToByn(getTotal()));

    }

    public int getTotal() {
        return DAYLY_ALLOWANCE_RATE * numberOfDays + transportationExpenses;
    }

    private static String convertToByn(int value){
        return value / 100 + "." + value % 100 / 10 + value % 100 % 10;
    }
}
