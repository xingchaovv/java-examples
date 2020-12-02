package lang.genericprogram.genericclass.arrayalg;

public class ArrayAlg {

    public static <T extends Comparable<? super T>> Pair<T> findMinAndMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        T min = arr[0];
        T max = arr[0];
        for (T one : arr) {
            if (one.compareTo(min) < 0) {
                min = one;
            }
            if (one.compareTo(max) > 0) {
                max = one;
            }
        }
        return new Pair<>(min, max);
    }
}
