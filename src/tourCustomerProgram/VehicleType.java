package tourCustomerProgram;

public enum VehicleType {
    SEDAN("Sedan"),
    SUV("SUV"),
    VAN("Van"),
    MINIBUS("Minibus");

    private final String vehicleType;

    // Constructor
    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
