package Runners;

import by.gsu.epamlab.BusinessTrip;

public class Runner1 {
    public static void main(String[] args) {
        final int NUMBER_OF_TRIPS = 5;
        //1
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Alex",5,100),
                new BusinessTrip("Jax",3,150),
                new BusinessTrip(),
                new BusinessTrip("Dex",2,170),
                new BusinessTrip("Pix",6,125)
        };
        //2
        printWithShow(businessTrips);
        //3
        businessTrips[NUMBER_OF_TRIPS - 1].setTransportationExpenses(140);
        //4
        ahowTotalDurOfTwoTrips(businessTrips);
        //5
        printWithToString(businessTrips);


    }
    public static void printWithShow(BusinessTrip[] businessTrips){
        for (BusinessTrip businessTrip : businessTrips) {
            businessTrip.show();
        }
    }
    public static void printWithToString(BusinessTrip[] businessTrips){
        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }
    }

    public static void ahowTotalDurOfTwoTrips(BusinessTrip[] businessTrips){
        System.out.println("Duration = " + (businessTrips[0].getNumberOfDays() + businessTrips[1].getNumberOfDays()));
    }

}
