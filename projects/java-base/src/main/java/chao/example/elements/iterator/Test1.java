package chao.example.elements.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Xingchao");
        names.add("Qing");
        names.add("Zheng");

        for (Iterator<String> its = names.iterator(); its.hasNext(); ) {
            String name = its.next();
            System.out.println(name);
        }
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        names.forEach(System.out::println);
    }
}
