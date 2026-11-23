public class Truck extends Vehicle {
private int numberofWheels;

   public Truck(String brand, String model, int year, int numbofWheels){
       super(brand, model, year);
       this.numberofWheels = numbofWheels;
   }
      @Override
      public void displayInfo(){
         super.displayInfo();
         System.out.println("Number of wheels: " + numberofWheels);
      }

      @Override
    public void moveForward() {
        System.out.println("Truck moves forward.");
    }

      @Override
    public void moveBackward() {
        System.out.println("Truck moves backward.");
    }

      @Override
    public void moveLeft() {
        System.out.println("Truck moves left.");
    }

      @Override
    public void moveRight() {
        System.out.println("Truck moves right.");
    }
       
   }