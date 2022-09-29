/*
Sources:
1) https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
2) https://www.javatpoint.com/java-get-current-date
 */

package tourCustomerProgram;

import java.util.ArrayList;
import java.util.Date;

class Trip {
    // Instance Variable
    private char[] tripName;
    private Vehicle aVehicle;
    private final Date currentDate; // Apparently making it a constant without assigning a value still allows to assign a value
    private final ArrayList<String> destinationList;

    // Constructor
    protected Trip(char[] tripName, Vehicle aVehicle) {
        setTripName(tripName); // Passed to a setter method to check against guardian code
        this.aVehicle = aVehicle;
        this.currentDate = new Date(System.currentTimeMillis()); // Sets the current system date and time
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
        // Initialize trip if it's between 1 and 20 in length (guardian code)
        if (tripName.length >= 1 && tripName.length <= 20) {
            this.tripName = tripName;
        }
    }

    // Other Methods
    protected void addVehicle(Vehicle instance) {
        // Check if the instance exists
        if (instance.getRegoNumber() != null) { // W
            // Add to aVehicle
            aVehicle = instance; //Complete guess
        }
    }

    // Appends a new destination to list from user input
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

    // Remove a destination given an index only
    protected void removeDestinationByIndex(int destinationLocationIndex) {
        // Checks if the index exists (guardian code)
        if (destinationLocationIndex != -1) {
            // If yes remove!
            destinationList.remove(destinationLocationIndex);
        }
    }

    @Override
    public String toString() {
        return String.format("""
                        Trip Name: %s
                        Start Date: %s
                        Destinations: %s
                        %s
                        """, new String(this.tripName), // Invokes the String() constructor without assigning it to any variable
                currentDate,
                destinationList,
                aVehicle // Invokes the toString() method in Vehicle class
        );
    }
}
