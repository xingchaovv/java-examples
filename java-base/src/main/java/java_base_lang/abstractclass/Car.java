package java_base_lang.abstractclass;

public abstract class Car {
    private String name;

    public String getName() {
        return name;
    }

    public Car() {
        System.out.println("Car Construct.");
    }

    abstract void run();
}
