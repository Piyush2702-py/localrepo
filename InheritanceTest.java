class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }
}

public class InheritanceTest{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}