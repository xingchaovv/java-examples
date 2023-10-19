package example;

public class ConsumerMain {

    public static void main(String[] args) {
        Thread consumerThread1 = new Thread(new HelloWorldConsumer());
        consumerThread1.start();
    }
}
