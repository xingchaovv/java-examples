package java_base_lang.genericprogram.genericclass.wildcard;

import java.lang.reflect.InvocationTargetException;

public class Main2 {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Pair<Employee> employeePair = makePair(Employee.class);
        System.out.printf("%s and %s.\n", employeePair.getFirst(), employeePair.getSecond());
    }

    public static <T> Pair<T> makePair(Class<T> c) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return new Pair<>(
                c.getDeclaredConstructor().newInstance(),
                c.getDeclaredConstructor().newInstance()
        );
    }
}
