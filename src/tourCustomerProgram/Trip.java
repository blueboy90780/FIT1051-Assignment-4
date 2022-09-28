/*
Sources:
1) https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
 */

package tourCustomerProgram;

// TODO: Mess with code cleanup and code analyzer, holy shit try and get as much of your work done via the IDE

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class Trip {
    // Instance Variable
    private char[] tripName;
    private Vehicle aVehicle;
    private Date currentDate;
    private ArrayList<String> destinationList;

    // constructor
    /*
    Code a non default two-parameter constructor with parameters for tripName  and aVehicle.
    Instance variables that are not taking parameters must be auto-initialised with sensible default value or object.
    The constructor must utilize appropriate naming conventions, they protect the integrity of the class's instance variables.
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
    protected void addVehicle(Vehicle instance) {
        // Check if the instance exists
        if (instance.getRegoNumber() != null) {
            // Add to aVehicle
            aVehicle = instance; //Complete guess
        }
    }

    protected void addDestinationByIndex(String destinationLocation, int indexPosition) {
        // Check if destinationLocation exists as an argument?????
        // indexPosition probably represents the order in which the user want to go on trips
        if (destinationLocation != null) { //the default value for an uninitialized string
            // Add destination by index
            if (destinationList.size() <= 20) {
                destinationList.add(indexPosition, destinationLocation); // First argument accepts an index, so probably acts like the insert() equivalent
            } else {
                System.out.println("No more trips can be added");
            }
        }
    }

    protected void removeDestinationByIndex (int destinationLocationIndex) {
        // Checks if the index exists
        if (destinationList.size() >= destinationLocationIndex) {
            // If yes remove!
            destinationList.remove(destinationLocationIndex);
        }
    }

    public String toString() {
        return "Trip{" +
                "Trip Name:" + Arrays.toString(tripName) +
                ", Start Date:" + currentDate +
                ", Destinations:" + destinationList +
                ", Vehicle" + aVehicle +
                ", Rego Number" + Arrays.toString(aVehicle.getRegoNumber()) +
                ", Mileage: " + aVehicle.getMileage() +
                '}';
    }
}
