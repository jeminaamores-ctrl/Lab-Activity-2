public class Main{
    public static void main(String[] args){

        Vehicle v1 = new Vehicle("Tesla", "Model 3", 2022);
        v1.displayInfo();

        Vehicle v2 = new Vehicle("Toyota", "Camry", 2008);
        v2.displayInfo();

        Vehicle v3 = new Vehicle("Ford", "Mustang", 1967);
        v3.displayInfo();

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vinatage: " + v1.isVintage());
        System.out.println();

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vinatage: " + v2.isVintage());
        System.out.println();

        
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vinatage: " + v3.isVintage());
        System.out.println();




    }
}