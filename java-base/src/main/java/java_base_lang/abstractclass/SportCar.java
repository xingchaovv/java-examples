package java_base_lang.abstractclass;

public class SportCar extends Car {
    public SportCar() {
        System.out.println("SportCar Construct.");
    }

    public void run() {
        System.out.println("SportCar is Running.");
    }

    public String getName() {
        System.out.println("in SportCar.");
        return "";
    }

    public static void staticRun() {
        System.out.println("SportCar staticRun.");
    }

    public void fast() {
        System.out.println("SportCar fast.");
    }
}
