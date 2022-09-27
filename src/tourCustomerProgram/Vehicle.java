package tourCustomerProgram;

// Sources:
// 1) https://www.javatpoint.com/java-string-max-size

import java.util.Arrays;

class Vehicle {

    // Instance variables
    private char[] regoNumber;
    private float mileage; // Distance in KM

    private VehicleType type; // Declaring an enum to generate pointer

    // Default Constructor
    protected Vehicle(char[] regoNumber, float mileage, VehicleType type) {
        // TODO: Find what to do with the boolean return values later
        setRegoNumber(regoNumber);
        setMileage(mileage);
        setType(type);
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
    protected boolean setRegoNumber(char[] regoNumber) {
        try {
            this.regoNumber = regoNumber;
            return true;
        } catch (Exception e) {
            return false; //Return false if ANY error occurs
        }
    }

    protected boolean setMileage(float mileage) {
        try {
            this.mileage = mileage;
            return true;
        } catch (Exception e) {
            return false; //Return false if ANY error occurs
        }
    }

    protected boolean setType(VehicleType type) {
        try {
            this.type = type;
            return true;
        } catch (Exception e) {
            return false; //Return false if ANY error occurs
        }
    }

    public String toString() {
        return String.format("Vehicle: %s \n Rego Number: %s \n Mileage: %s"
                ,this.type, Arrays.toString(this.regoNumber), this.mileage);
    }
}