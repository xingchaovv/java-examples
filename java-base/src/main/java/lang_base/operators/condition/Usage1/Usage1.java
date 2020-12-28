package lang_base.operators.condition.Usage1;

public class Usage1 {

    public static void main(String[] args) {
        System.out.println(true ? 101 : true ? 103 : 104);
        System.out.println(true ? 101 : false ? 103 : 104);
        System.out.println(false ? 101 : true ? 103 : 104);
        System.out.println(false ? 101 : false ? 103 : 104);
    }
}
