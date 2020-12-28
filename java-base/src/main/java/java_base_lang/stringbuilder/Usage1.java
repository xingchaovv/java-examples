package java_base_lang.stringbuilder;

public class Usage1 {

    public static void main(String[] args) {
        StringBuilder name1 = new StringBuilder("Zhang chao");
        System.out.println(name1.toString());
        name1.reverse();
        System.out.println(name1.toString());
        name1.reverse();

        name1.insert(6, "Xing");
        System.out.println(name1.toString());

        name1.delete(0, 6);
        System.out.println(name1.toString());

//        Zhang chao
//        oahc gnahZ
//        Zhang Xingchao
//        Xingchao
    }
}
