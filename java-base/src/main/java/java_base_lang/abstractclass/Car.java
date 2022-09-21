package java_base_lang.abstractclass;

public abstract class Car {
    private String name;

    public Object getName() {
        System.out.println("in Car.");
        return name;
    }

    public Car() {
        System.out.println("Car Construct.");
    }

    abstract void run();
}
