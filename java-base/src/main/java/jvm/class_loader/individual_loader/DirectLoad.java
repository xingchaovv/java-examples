package jvm.class_loader.individual_loader;

public class DirectLoad {

    private User user;

    public static void main(String[] args) {
        new DirectLoad().run();
    }

    private void run() {
        user = new User();
        System.out.println("user.name: " + user.name);
    }
}
