import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private int id;
    private Semaphore leftFork;
    private Semaphore rightFork;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            while (true) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");
        Thread.sleep((int)(Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        if (id % 2 == 0) {
            leftFork.acquire();
            rightFork.acquire();
        } else {
            rightFork.acquire();
            leftFork.acquire();
        }

        System.out.println("Philosopher " + id + " is eating.");
        Thread.sleep((int)(Math.random() * 1000));

        leftFork.release();
        rightFork.release();
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        int n = 5;
        Semaphore[] forks = new Semaphore[n];
        Philosopher[] philosophers = new Philosopher[n];

        for (int i = 0; i < n; i++) {
            forks[i] = new Semaphore(1);
        }

        for (int i = 0; i < n; i++) {
            Semaphore left = forks[i];
            Semaphore right = forks[(i + 1) % n];

            philosophers[i] = new Philosopher(i, left, right);
            philosophers[i].start();
        }
    }
}