package airport;

public class Application {
    public static void main(String[] args){
        //System.out.println("Test");
        Airplane AP = new Airplane("KFC123",100,150,false,1000.50);
        AP.loadPassengers();
        AP.takeOff();
        AP.land();
        AP.unloadPassengers();

    }
}
