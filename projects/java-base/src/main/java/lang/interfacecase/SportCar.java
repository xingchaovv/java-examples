package lang.interfacecase;

public class SportCar extends Car implements Chargeable {
    public void run() {
        System.out.println("SportCar is Running.");
    }

    @Override
    public void charge() {
        System.out.println("SportCar is Charging.");
    }
}
