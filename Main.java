public class Main {

public static void main(String[] args) {

Vehicle v1 = new Vehicle("Tesla","Model 3", 2022);
Vehicle v2 = new Vehicle("Toyota","Camry", 2008);
Vehicle v3 = new Vehicle("Ford","Mustang", 1967);

//object1 
v1.displayInfo();
System.out.println("Brand: " + v1.getBrand());
System.out.println("Model: " + v1.getModel());
System.out.println("Year: " + v1.getYear());
System.out.println("Age: " + v1.calculateAge());
System.out.println("Is vintage? " + v1.isVintage());
System.out.println();

//object2
v2.displayInfo();
System.out.println("Brand: " + v2.getBrand());
System.out.println("Model: " + v2.getModel());
System.out.println("Year: " + v2.getYear());
System.out.println("Age: " + v2.calculateAge());
System.out.println("Is vintage? " + v2.isVintage());
System.out.println();

//object3
v3.displayInfo();
System.out.println("Brand: " + v3.getBrand());
System.out.println("Model: " + v3.getModel());
System.out.println("Year: " + v3.getYear());
System.out.println("Age: " + v3.calculateAge());
System.out.println("Is vintage? " + v3.isVintage());
System.out.println();

//set (test)
System.out.println("setYear(2000): " + v1.setYear(2000));
System.out.println("Year: " + v1.getYear());
System.out.println("Age: " + v1.calculateAge());
System.out.println("Is vintage? " + v1.isVintage());
System.out.println();

System.out.println("setYear(1885): " + v1.setYear(1885));
System.out.println("Year: " + v1.getYear());
System.out.println();

System.out.println("setYear(2027): " + v1.setYear(2027));
System.out.println("Year: " + v1.getYear());
System.out.println();

//test
Vehicle v4 = new Vehicle("Land Rover", "Defender", 1885); 
System.out.println("New vehicle with year 1885"); 
System.out.println("Initial year is " + v4.getYear()); 
System.out.println(); 

Vehicle v5 = new Vehicle("Land Rover", "Defender", 2027);
System.out.println("New vehicle with year 2027");
System.out.println("Initial year is " + v5.getYear());



} 
  }