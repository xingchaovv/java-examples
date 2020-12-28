package java_base_lang.abstractclass;

public class Main {

    public static void main(String[] args) {
        Car myCar = new SportCar();
        myCar.run();

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
    }
}
