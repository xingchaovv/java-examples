package lang.genericprogram.genericclass.pair;

public class Main {

    public static void main(String[] args) {
        Pair<Integer> pairNums = new Pair<>();
        System.out.println(pairNums.getFirst());
        Pair<String> pairNums2 = new Pair<>("chao", "cai");
        System.out.println(pairNums2.getFirst());

        Pair<? extends CharSequence> pairNums3 = new Pair<>("chao", "cai");
        System.out.println(pairNums2.getFirst());
    }
}
