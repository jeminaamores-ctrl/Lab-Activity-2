public class Motorcycle extends Vehicle implements Serviceable{
private String EngineType;

   public Motorcycle(String brand, String model, int year, String engineType){
       super(brand, model, year);
       this.EngineType = engineType;
   }
      @Override
   public void displayInfo(){
         super.displayInfo();
         System.out.println("Engine Type: " + EngineType);
    }

       @Override
    public void moveForward() {
        System.out.println("Motorcycle moves forward.");
    }

      @Override
    public void moveBackward() {
        System.out.println("Motorcycle moves backward.");
    }

      @Override
    public void moveLeft() {
        System.out.println("Motorcycle moves left.");
    }

      @Override
    public void moveRight() {
        System.out.println("Motorcycle moves right.");
    }
      @Override
    public void service(){
        System.out.println("Inspect tires and brakes");
    }
   }