import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

class Time {
    int hours, minutes, seconds;

    void readTime() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter hours: ");
            hours = sc.nextInt();
            if (hours > 24 || hours < 0)
                throw new HrsException("InvalidHourException:hour is not greater than 24");

            System.out.print("Enter minutes: ");
            minutes = sc.nextInt();
            if (minutes > 60 || minutes < 0)
                throw new MinException("InvalidMinuteException:hour is not greater than 60");

            System.out.print("Enter seconds: ");
            seconds = sc.nextInt();
            if (seconds > 60 || seconds < 0)
                throw new SecException("InvalidSecondException:hour is not greater than 60");

            System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);

        } catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.readTime();
    }
}
