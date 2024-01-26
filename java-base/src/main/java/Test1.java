import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        String names = "zhang";
        System.out.println(Arrays.toString(names.split(",")));

        String names2 = "zhang,wang, ";
        System.out.println(Arrays.toString(names2.split(",")));
    }
}
