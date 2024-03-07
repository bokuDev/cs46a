// Problem 7
/**
 * Represents a Vehicle
 * @author Canhui Huang
 */
class Vehicle {
    private int registrationNumber;
    private String ownerName;
    private String vehicleType;

    /**
     * Constructs a new Vehicle
     * @param registrationNumber the registration number
     * @param ownerName the owner's name
     * @param vehicleType the vehicle type. It can be "car", "Bike", or "Truck"
     */
    public Vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public int getRegistrationNumber() { return this.registrationNumber; }
    public void setRegistrationNumber(int registrationNumber) { this.registrationNumber = registrationNumber; }

    public String getOwnerName() { return this.ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getVehicleType() { return this.vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    /**
     * Displays information of the vehicle
     */
    public void displayInfo() {
        System.out.println("Vehicle registration number: " + this.registrationNumber +
        "\n Owner: " + this.ownerName +
        "\n Vehicle type: " + this.vehicleType
        );
    }

    /**
     * Main method that demonstrates the functionality by registering a 
     * few vehicles and displaying their information
     */
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(908231, "Robert", "Car");
        Vehicle vehicle2 = new Vehicle(102384, "Maria", "Bike");
        Vehicle vehicle3 = new Vehicle(239842, "Ana", "Truck");

        vehicle1.displayInfo();
        vehicle2.displayInfo();
        vehicle3.displayInfo();
    }
}