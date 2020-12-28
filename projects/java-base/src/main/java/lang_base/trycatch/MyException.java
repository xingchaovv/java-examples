package lang_base.trycatch;

class BadFoodException extends Exception {
}

public class MyException {

    public static void main(String[] args) {
        MyException myException = new MyException();
        try {
            for (String arg : args) {
                myException.checkFood(arg);
            }
        } catch (BadFoodException e) {
            e.printStackTrace();
        }
    }

    private void checkFood(String str) throws BadFoodException {
        if (str.equals("carrot")) {
            throw new BadFoodException();
        }
        System.out.println("I like it.");
    }
}
