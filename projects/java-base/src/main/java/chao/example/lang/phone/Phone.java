package chao.example.lang.phone;

import chao.example.lang.phone.feature.Chargeable;

public class Phone implements Chargeable {

    Phone() {
        System.out.println("In Phone's construct.");
    }

    static int checkVersion() {
        return 101;
    }

    static boolean checkVersion(int target) {
        return target > 100;
    }
}
