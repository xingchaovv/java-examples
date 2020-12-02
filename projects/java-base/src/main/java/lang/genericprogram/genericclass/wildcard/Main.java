package lang.genericprogram.genericclass.wildcard;

public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager(200);
        m1.setName("m1");
        Manager m2 = new Manager(300);
        m2.setName("m2");
        Manager m3 = new Manager(150);
        m3.setName("m3");

        Pair<Manager> buddies = new Pair<>(m1, m2);
        printBuddies(buddies);

        Manager[] managers = {m1, m2, m3};
        Pair<Employee> result = new Pair<>();
        minMaxBonus(managers, result);
        System.out.printf("First: %s, Second: %s.\n", result.getFirst(), result.getSecond());
        maxMinBonus(managers, result);
        System.out.printf("First: %s, Second: %s.\n", result.getFirst(), result.getSecond());
    }

    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.printf("%s and %s are buddies.\n", first.getName(), second.getName());
    }

    public static void minMaxBonus(Manager[] managers, Pair<? super Manager> result) {
        if (managers == null || managers.length == 0) {
            return;
        }
        Manager min = managers[0];
        Manager max = managers[0];
        for (int i = 1; ++i < managers.length; ) {
            if (managers[i].getBonus() < min.getBonus()) {
                min = managers[i];
            }
            if (managers[i].getBonus() > max.getBonus()) {
                max = managers[i];
            }
        }
        result.setFirst(min);
        result.setFirst(max);
    }

    public static void maxMinBonus(Manager[] managers, Pair<? super Manager> result) {
        minMaxBonus(managers, result);
        PairAlg.swapHelper(result);
    }
}
