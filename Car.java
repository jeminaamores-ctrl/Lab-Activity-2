public class Car extends Vehicle implements Serviceable{
private int numberofDoors;

   public Car (String brand, String model, int year, int numbofDoors){
       super(brand, model, year);
       this.numberofDoors = numbofDoors;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Number of Doors: " + numberofDoors);
      }
 
      @Override
      public void moveForward() {
         System.out.println("Car moves forward.");
      }

      @Override
      public void moveBackward() {
         System.out.println("Car moves backward.");
      }

      @Override
      public void moveLeft() {
         System.out.println("Car moves left.");
      }

      @Override
      public void moveRight() {
         System.out.println("Car moves right.");
      }
      @Override
      public void service(){
         System.out.println("Check oil and brakes.");
      }
   }