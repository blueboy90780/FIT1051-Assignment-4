// Sources:
// 1) https://www.javatpoint.com/java-string-max-size
// 2) https://www.geeksforgeeks.org/convert-character-array-to-string-in-java/

package tourCustomerProgram;

class Vehicle {

    // Instance variables
    private char[] regoNumber; // char[] rather than String for memory efficiency
    private float mileage;

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
    protected void setRegoNumber(String regoNumber) { // Taking a String input because that's how we'll parse user_input
        // Ensure it's exactly 6 characters long. Should be a string
        char[] charInput = regoNumber.toCharArray(); // Convert to character array

        // Checks that user input is exactly 6 in length
        if (charInput.length == 6) {
            this.regoNumber = charInput;
        }
    }

    protected void setMileage(float mileage) {
        // Initialize mileage if it's between 9 and 900 (guardian code)
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

    // Invoked through System.out.println()
    @Override
    public String toString() {
        String stringRego = new String(this.regoNumber); // Converts char[] into a proper string by invoking the String() constructor
        return String.format("Vehicle: %s\nRego Number: %s\nMileage: %s"
                , this.type, stringRego, this.mileage);
    }
}