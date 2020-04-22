package com.xingchaovv.java.example;

import java.util.ArrayList;
import java.util.List;

public class lambda {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            list.add("info" + i);
        }
        list.forEach(System.out::println);
    }
}
