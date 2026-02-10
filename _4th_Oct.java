class Apple {
    void show() {
        System.out.println("This is Apple class show() method.");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method.");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method.");
    }
}

public class _4th_Oct{
    public static void main(String[] args) {

        Apple ref;  

        ref = new Apple();
        ref.show();      

        ref = new Banana();
        ref.show();      

        ref = new Cherry();
        ref.show();   
    }
}
