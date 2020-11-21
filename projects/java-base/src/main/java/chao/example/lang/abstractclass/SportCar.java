package chao.example.lang.abstractclass;

public class SportCar extends Car {
    public SportCar() {
        System.out.println("SportCar Construct.");
    }

    public void run() {
        System.out.println("SportCar is Running.");
    }

    public static void staticRun() {
        System.out.println("SportCar staticRun.");
    }

    public void fast() {
        System.out.println("SportCar fast.");
    }
}
