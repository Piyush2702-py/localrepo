class Buffer {
    private int data;
    private boolean hasValue = false;

    public synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait(); // wait if buffer is full
            } catch (InterruptedException e) {}
        }

        data = value;
        System.out.println("Produced: " + data);
        hasValue = true;

        notify(); // notify consumer
    }

    public synchronized int consume() {
        while (!hasValue) {
            try {
                wait(); // wait if buffer is empty
            } catch (InterruptedException e) {}
        }

        System.out.println("Consumed: " + data);
        hasValue = false;

        notify(); // notify producer
        return data;
    }
}

class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

public class ProducerConsumerProblem{
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}