package java_base_lang.abstractclass;

public class Main {

    public static void main(String[] args) {
        SportCar myCar = new SportCar();
        myCar.run();

        String name = myCar.getName();

        if (name instanceof String) {
            System.out.println("is String.");
        }

        SportCar myCar2 = new SportCar();
        myCar2.fast();

        Car myCar3 = new RedSportCar();
        myCar3.run();

        SportCar myCar5 = new RedSportCar();
        myCar5.run();
        SportCar.staticRun();

        RedSportCar myCar4 = new RedSportCar();
        myCar4.showRed();
        RedSportCar.staticRun();
        myCar4.fast();
        myCar4.fast(10);

        System.out.println(myCar instanceof Car);
        System.out.println(myCar instanceof SportCar);
    }
}
