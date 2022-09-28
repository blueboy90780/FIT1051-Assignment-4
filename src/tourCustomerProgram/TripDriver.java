/*
Source
1) https://stackoverflow.com/questions/26210697/possible-to-loop-through-scanner-input
 */

package tourCustomerProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class TripDriver {
    public static void main(String[] args) {
        // Instantiate a Vehicle Class
        Vehicle vehicleOne = new Vehicle();

        // Ask user to specify vehicle
        Scanner userInput = new Scanner(System.in);
        System.out.print("Type your desired vehicle, registration number (6 characters long) and mileage in order: ");

        // Converts user input into a list of string tokens
        ArrayList<String> vehicleInfo = Utility.stringConvert(userInput);

        // Sets the vehicle's state
        vehicleOne.setType(vehicleInfo.get(0)); // Vehicle Type
        vehicleOne.setRegoNumber(vehicleInfo.get(1)); // Registration Number
        vehicleOne.setMileage(Float.parseFloat(vehicleInfo.get(2))); // Mileage

        // Extra:  Ask user to name the trip
        userInput = new Scanner(System.in); // Reset userInput
        System.out.print("What would you like to name your trip? ");

        //Instantiate a Trip Class
        Trip soloTravel = new Trip(userInput.next().toCharArray(), vehicleOne);

        // Ask user for destination
        userInput = new Scanner(System.in); // Reset userInput
        System.out.print("Type out 3 destinations you would like to go to: ");

        // Converts user input into a list of string tokens
        ArrayList<String> destinationList = Utility.stringConvert(userInput);

        // Adds the list of destination to a list
        for (int i = 0; i < destinationList.size(); i++) {
            soloTravel.addDestinationByIndex(destinationList.get(i), i);
        }

        // Print the Trip class information to the screen
        System.out.println(soloTravel.toString());

        // Extra: Ask user which destination they want to remove
        userInput = new Scanner(System.in);
        System.out.println("Which destination would you like to remove? ");

        // Remove one destination from the destination list
        soloTravel.removeDestinationByIndex(destinationList.indexOf(userInput.next())); // indexOf() returns -1 if it does not exists

        // Print the revised Trip class information to the screen
        System.out.println(soloTravel.toString());
    }
}
