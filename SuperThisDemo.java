class Parent {
    int num = 10;

    Parent() {
        System.out.println("Parent class constructor");
    }

    void display() {
        System.out.println("Value in Parent class: " + num);
    }
}

class Child extends Parent {
    int num = 20;

    Child() {
        super(); 
        System.out.println("Child class constructor");
    }

    void show() {
        System.out.println("Child class value using this: " + this.num);
        System.out.println("Parent class value using super: " + super.num);

        super.display();
    }
}

public class SuperThisDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}