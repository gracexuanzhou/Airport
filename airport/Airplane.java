package airport;

public class Airplane {

    String plane_id;
    int max_passengers,current_passengers;
    boolean fly;
    double speed;

    Airplane(String plane_id,int current_passengers,int max_passengers,boolean fly,double speed){
        this.plane_id = plane_id;
        this.current_passengers = current_passengers;
        this.max_passengers = max_passengers;
        this.fly = fly;
        this.speed = speed;
    }

    public void loadPassengers(){
        System.out.println("Airplane " + plane_id +" loads " + current_passengers + " passengers");
        this.current_passengers = current_passengers;
    }
    public void unloadPassengers(){
        System.out.println("Airplane " + plane_id +" unloads " + current_passengers + " passengers");
        this.current_passengers = 0;
    }
    public void takeOff(){
        System.out.println("Airplane " + plane_id +" takes off.");
        this.fly = true;
    }
    public void land(){
        System.out.println("Airplane " + plane_id +" lands.");
        this.fly = false;
    }


}
