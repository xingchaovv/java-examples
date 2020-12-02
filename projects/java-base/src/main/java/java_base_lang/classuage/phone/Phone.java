package java_base_lang.classuage.phone;

import java_base_lang.classuage.phone.feature.Chargeable;

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
