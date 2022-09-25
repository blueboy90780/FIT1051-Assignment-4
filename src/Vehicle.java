// Sources:
// 1) https://www.javatpoint.com/java-string-max-size

public class Vehicle {

    // Instance variables, declared as private by default
    char[] regoNumber;
    float mileage; // Distance in KM

    // Default Constructor
    public Vehicle() {
        regoNumber = new char[6]; // For memory efficiency, a char array of exact size 6 is used instead of a String data type
        mileage = 0.0f;
    }

    public char[] getRegoNumber() {
        return regoNumber;
    }

    // Getters

    public void setRegoNumber(char[] regoNumber) {
        this.regoNumber = regoNumber;
    }

    public float getMileage() {
        return mileage;
    }

    // Setters
    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public enum VehicleType {
        Sedan,
        SUV,
        Van,
        Minibus
    }

    //toString method
//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "Rego Number: " + Arrays.toString(regoNumber) +
//                ", mileage=" + mileage +
//                '}';
//    }
}
