package chao.example.lang.interfacecase;

public class Main {

    public static void main(String[] args) {
        SportCar myCar = new SportCar();
        myCar.run();
        myCar.charge();

        SuperSportCar myCar2 = new SuperSportCar();
        myCar2.run();
        myCar2.charge();
    }
}
