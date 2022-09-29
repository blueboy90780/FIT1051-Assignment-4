/*
Source:
1) https://www.geeksforgeeks.org/how-to-convert-an-array-to-string-in-java/
 */

package tourCustomerProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Helpful utility objects used across different classes
public class Utility {

    // Converts a user input into a list of String tokens
    public static ArrayList<String> stringConvert(Scanner userInput) {
        // Converts user input into a list of string tokens
        String str = userInput.nextLine();
        // Delimited by spaces
        return new ArrayList<>(Arrays.asList(str.split(" ")));
    }
}
