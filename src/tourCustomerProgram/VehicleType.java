package tourCustomerProgram;

public enum VehicleType {
    Sedan("Sedan"),
    SUV("SUV"),
    Van("Van"),
    Minibus("Minibus");

    private String stringInput;

    // Constructor
    VehicleType(String stringInput) {
        this.stringInput = stringInput;
    }
}
