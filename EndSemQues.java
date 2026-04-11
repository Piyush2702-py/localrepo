class Thread1 extends Thread {
    public synchronized void run() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("Divisible by 3: " + i);
            }
        }
    }
}

class Thread2 extends Thread {
    public synchronized void run() {
        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0) {
                System.out.println("Divisible by 5: " + i);
            }
        }
    }
}

public class EndSemQues{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}