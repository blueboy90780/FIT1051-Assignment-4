package tourCustomerProgram;

// Sources:
// 1) https://www.javatpoint.com/java-string-max-size

import javax.lang.model.type.NullType;
import java.util.Arrays;

class Vehicle {

    // Instance variables
    private char[] regoNumber;
    private float mileage; // Distance in KM

    private VehicleType type; // Declaring an enum to generate pointer

    // Default Constructor
    protected Vehicle() {
        // Sensible default values, not defined by the user
        this.regoNumber = new char[6];
        this.mileage = 0.0f;
    }

    // Getters/Accessors
    protected char[] getRegoNumber() {
        return regoNumber;
    }

    protected float getMileage() {
        return mileage;
    }

    protected VehicleType getType() {
        return type;
    }

    // Setters/Mutators
    // These are user-defined values
    protected void setRegoNumber(String regoNumber) { // Taking a String input because that's how we'll parse user_input
        // Ensure it's exactly 6 characters long. Should be a string
        char[] charInput = regoNumber.toCharArray(); // Convert to character array
        if (charInput.length == 6) {
            this.regoNumber = charInput;
        }
    }

    protected void setMileage(float mileage) {
        // Maximum will be 900.00 km
        if (mileage >= 0f && mileage <= 900f) {
            this.mileage = mileage;
        }
    }

    protected boolean setType(String userInput) {
        // Can be only of 4 types
        switch (userInput.toLowerCase()) {
            case "sedan":
                this.type = VehicleType.SEDAN;
                break;
            case "suv":
                this.type = VehicleType.SUV;
                break;
            case "van":
                this.type = VehicleType.VAN;
                break;
            case "minibus":
                this.type = VehicleType.MINIBUS;
                break;
            default:
                return false;
        }
        return true;
    }

    // TODO: Clean up this formatting
    public String toString() {
        return String.format("Vehicle: %s\nRego Number: %s\nMileage: %s"
                ,this.type, Utility.sb.append(this.regoNumber), this.mileage);
    }
}