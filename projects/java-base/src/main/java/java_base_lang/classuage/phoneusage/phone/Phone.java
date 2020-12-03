package java_base_lang.classuage.phoneusage.phone;

import java_base_lang.classuage.phoneusage.phone.feature.Chargeable;

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
