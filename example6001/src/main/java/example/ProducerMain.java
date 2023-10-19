package example;

public class ProducerMain {

    public static void main(String[] args) {
        Thread producerThread1 = new Thread(new HelloWorldProducer());
        producerThread1.start();
        Thread producerThread2 = new Thread(new HelloWorldProducer());
        producerThread2.start();
        new Thread(new HelloWorldProducer()).start();
        new Thread(new HelloWorldProducer()).start();
        new Thread(new HelloWorldProducer()).start();
    }
}
