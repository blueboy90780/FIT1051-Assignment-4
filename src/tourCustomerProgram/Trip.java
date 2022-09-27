/*
Sources:
1) https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
 */

package tourCustomerProgram;

// TODO: Mess with code cleanup and code analyzer, holy shit try and get as much of your work done via the IDE

import java.util.ArrayList;
import java.util.Date;

class Trip {
    // Instance Variable
    private char[] tripName;
    private Vehicle aVehicle;
    private Date currentDate; //TODO: Check if it's the correct type
    private ArrayList<String> destinationList;

    // constructor
    /*
    Code a non default two-parameter constructor with parameters for tripName  and aVehicle.
    Instance variables that are not taking parameters must be auto-initialised with sensible default value or object.
    The constructor must utilise appropriate naming conventions and they protect the integrity of the class's instance variables.
    "Integrity" probably is referring to some guardian code that checks for valid arguments
     */

    protected Trip(char[] tripName, Vehicle aVehicle) {
        this.tripName = tripName;
        this.aVehicle = aVehicle;
        this.currentDate = new Date();
        this.destinationList = new ArrayList<>();
    }

    // Getter
    protected char[] getTripName() {
        return tripName;
    }
    protected Vehicle getaVehicle() {
        return aVehicle;
    }
    protected Date getCurrentDate() {
        return currentDate;
    }
    protected ArrayList<String> getDestinationList() {
        return destinationList;
    }

    // Setters
    protected void setTripName(char[] tripName) {
        // length of 1 to 20 characters
        if (tripName.length >= 1 && tripName.length <= 20) {
            this.tripName = tripName;
        }
    }

    // other methods
}
