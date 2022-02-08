package threads;

public class TestPC2 {
    public static void main(String[] args) {
        ProducerConsumer2 pc2 = new ProducerConsumer2();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                pc2.produce();
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                pc2.consume();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
