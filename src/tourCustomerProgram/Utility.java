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
    // Extra Instance Variable
    public static StringBuilder sb = new StringBuilder(); //Needed to convert char[] into a proper String

    public static ArrayList<String> stringConvert (Scanner userInput) {
        // Converts user input into a list of string tokens
        String str = userInput.nextLine();
        return new ArrayList<>(Arrays.asList(str.split(" ")));
    }
}
