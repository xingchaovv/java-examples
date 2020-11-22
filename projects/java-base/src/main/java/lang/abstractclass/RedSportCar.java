package lang.abstractclass;

public class RedSportCar extends SportCar {
    public void run() {
        super.run();
        System.out.println("RedSportCar is Running.");
    }

    protected boolean fast(int count) {
        System.out.printf("RedSportCar fast: %d", count);
        return true;
    }

    public static void staticRun() {

        System.out.println("RedSportCar staticRun.");
    }

    public void showRed() {
        System.out.println("Show the red.");
    }
}
