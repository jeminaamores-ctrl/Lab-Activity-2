public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }
    public static void performService(Serviceable item){
        item.service();
    }

    public static void main(String[] args) {
        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");
        Vehicle vehicle = new Car("Tesla", "Model 3", 2022, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        // The Same Variable now Refer to a Motorcycle Object.
        vehicle = new Motorcycle("Honda", "Click 125i", 2024, "4-stroke, SOHC, single-cylinder");
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        vehicle.displayInfo();

        // DEMO 2: One Method accepts different Vehicle subclasses
        System.out.println("\n === 2. Method Parameter ===");
        Car car1 = new Car("Tesla", "Model 3", 2022, 4);
        Motorcycle motorcycle1 = new Motorcycle("Honda", "Beat", 2023, "4-stroke, SOHC, single-cylinder");
        Truck truck1 = new Truck("Mercedes-Benz", "Actros", 2024, 10);
        printDetails(car1);
        car1.moveForward();
        car1.moveBackward();
        car1.moveLeft();
        car1.moveRight();
        printDetails(motorcycle1);
        motorcycle1.moveForward();
        motorcycle1.moveBackward();
        motorcycle1.moveLeft();
        motorcycle1.moveRight();
        printDetails(truck1);
        truck1.moveForward();
        truck1.moveBackward();
        truck1.moveLeft();
        truck1.moveRight();

        // DEMO 3: One array holds different Vehicle subclasses
        System.out.println("\n === 3. Polymorphic Array ===");
        Vehicle[] vehicles = {
                new Car("Toyota", "Vios", 2024, 4),
                new Motorcycle("Yamaha", "NMAX 155", 2024, "4-stroke, SOHC, liquid-cooled, single-cylinder"),
                new Truck("Hyundai", "Mighty", 2024, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
   
    
        Serviceable car = new Car("Tesla", "Model 3", 2022, 4);
        Serviceable motorcycle = new Motorcycle("Honda", "Beat", 2023, "4-stroke, SOHC, single-cylinder");
        Serviceable truck = new Truck("Mercedes-Benz", "Actros", 2024, 10);
        Serviceable printer = new Printer();

        Serviceable[] item = {
            car,
            motorcycle,
            truck,
            printer
        };
        for(Serviceable currentItem: item){
            performService(currentItem);
        }
    }
}
