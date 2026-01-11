import java.util.Scanner;
class Animal
{
    String Breed;
    String Name;

    void Bark()
    {
        System.out.println(Name+"is barking!");
    }
    
    void Sleep()
    {
        System.out.println(Name+"is sleeping");
    }

}
public class Dog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Animal dog1=new Animal();
        dog1.Name=sc.next();
        dog1.Breed=sc.next();
        dog1.Bark();
        dog1.Sleep();
    }
    
}
