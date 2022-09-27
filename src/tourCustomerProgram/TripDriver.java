/*
Source
1) https://www.javatpoint.com/java-list
 */

package tourCustomerProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TripDriver {
    // code here
    public static void main(String[] args) {
        // Instantiate a Vehicle Class
        Vehicle vehicleOne = new Vehicle(); // TODO: FIX THIS
        // Ask user to specify vehicle
        Scanner userInput = new Scanner(System.in);
        System.out.print("Type your desired vehicle, registration number and mileage in order: ");

        // Sets the vehicle's state
        vehicleOne.setType(userInput.next()); // Vehicle Type
        vehicleOne.setRegoNumber(userInput.next()); // Registration Number
        vehicleOne.setMileage(userInput.nextFloat()); // Mileage

        // Extra:  Ask user to name the trip
        userInput = new Scanner(System.in); // Reset userInput
        System.out.print("What would you like to name your trip? ");
        //Instantiate a Trip Class
        Trip soloTravel = new Trip(userInput.next().toCharArray(), vehicleOne);

        // Ask user for destination
        userInput = new Scanner(System.in); // Reset userInput
        System.out.print("Type out 3 destinations you would like to go to: ");

        // Converts user input into a list of string tokens
        List<String> destinationInputList = userInput.tokens().toList();
        for (int i = 0; i < destinationInputList.size(); i ++) {
            soloTravel.addDestinationByIndex(destinationInputList.get(i),i);
        }

        // Print the Trip class information to the screen
        System.out.println(soloTravel.toString());

        // Extra: Ask user which destination they want to remove
        userInput = new Scanner(System.in);
        System.out.println("Which destination would you like to remove? ");

        // Remove one destination from the destination list
        // This code is calling indexOf() method from java.util.list.
        // This makes the guardian code in removeDestinationByIndex absolutely redundant/useless
        // Because this line would throw an error regardless if the destination does not exist in the list
        // Method would be better if it asks to remove destination by string rather than index
        soloTravel.removeDestinationByIndex(destinationInputList.indexOf(userInput.next()));

        // Print the revised Trip class information to the screen
        System.out.println(soloTravel.toString());
    }
}
