/*
Sources:
1) https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
2) https://www.javatpoint.com/java-get-current-date
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
    private final Date currentDate; // Apparently making it a constant without assigning a value still allows to assign a value
    private ArrayList<String> destinationList;

    // constructor

    protected Trip(char[] tripName, Vehicle aVehicle) {
        this.tripName = tripName;
        this.aVehicle = aVehicle;
        this.currentDate = new Date(System.currentTimeMillis());
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
        if (destinationLocationIndex != -1) {
            // If yes remove!
            destinationList.remove(destinationLocationIndex);
        }
    }

    public String toString() {
        return String.format("""
                Trip Name: %s
                Start Date: %s
                Destinations: %s
                """, Utility.sb.append(tripName),
                currentDate,
                destinationList
        ) + aVehicle.toString();
    }
}
