package java_base_util;

import java.util.Scanner;

public class ScannerUsage1 {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        System.out.println("请输入一行：");
        System.out.printf("收到：%s\n", scannerIn.nextLine());
        System.out.println("请输入一个数字：");
        System.out.printf("收到：%d\n", scannerIn.nextInt());

        System.out.println("请输入一些空格分隔的词语：（Ctrl + D 结束）");
        while (scannerIn.hasNext()) {
            System.out.printf("收到：%s\n", scannerIn.next());
        }
        System.out.println("程序结束。");
    }
}
