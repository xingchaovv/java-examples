package java_base_lang.classuage.phoneusage.phone;

public class Iphone extends Phone {

    static int iphoneCount;

    private static int firstYear;
    private String iosVersion;

    static {
        System.out.println("In Iphone's static initial block.");
        firstYear = 2010;
    }

    {
        iphoneCount++;
        System.out.printf("Iphone's instance count: %d\n", iphoneCount);
        System.out.println("In Iphone's instance initial block.");
    }

    Iphone(String iosVersion) {
        System.out.println("In Iphone's construct with param.");
        this.iosVersion = iosVersion;
        System.out.printf("The firstYear is: %s\n", firstYear);
    }

    Iphone() {
        this("0.0");
        System.out.println("In Iphone's construct without param.");
    }

    public String getIosVersion() {
        return iosVersion;
    }
}
