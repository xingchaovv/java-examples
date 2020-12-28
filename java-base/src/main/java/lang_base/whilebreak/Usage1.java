package lang_base.whilebreak;

public class Usage1 {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j >= 7) {
                    System.out.printf("i:%d, j:%d, exceed\n", i, j);
                    continue outer;
                } else {
                    System.out.printf("i:%d, j:%d\n", i, j);
                }
            }
        }
    }
}
