public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }
    public static void main(String[] args) {
        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car ("Tesla", "Model 3", 2022, 4);
        vehicle.displayInfo();
        System.out.println();

        // The Same Variable now Refer to a Motorcycle Object.
        vehicle = new Motorcycle("Honda", "Click 125i", 2024, "4-stroke, SOHC, single-cylinder");
        vehicle.displayInfo();

        // DEMO 2: One Method accepts different Vehicle subclasses
        System.out.println("\n === 2. Method Parameter ===");
        Car car = new Car ("Tesla", "Model 3", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Beat", 2023, "4-stroke, SOHC, single-cylinder");
        Truck truck = new Truck("Mercedes-Benz", "Actros", 2024, 10);
        printDetails(car);
        printDetails(motorcycle);
        printDetails(truck);

    // DEMO 3: One array holds different Vehicle subclasses
    System.out.println("\n === 3. Polymorphic Array ===");
    Vehicle[] vehicles = {
        new Car("Toyota", "Vios", 2024, 4),
        new Motorcycle("Yamaha", "NMAX 155", 2024, "4-stroke, SOHC, liquid-cooled, single-cylinder"),
        new Truck("Hyundai", "Mighty", 2024, 6)
    };

    for(Vehicle currentVehicle: vehicles){
        printDetails(currentVehicle);
        System.out.println();
    }
}
}
