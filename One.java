import java.util.Scanner;

 class One {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter your name:");
        String name_e=sc.nextLine();

        System.out.println("Enter your roll no:");
        int roll=sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your section:");
        String section=sc.nextLine();

        System.out.println("Enter your branch:");
        String branch=sc.nextLine();

        System.out.println("Student information:");
        System.out.println("Name:"+name_e);
        System.out.println("Roll no:"+roll);
        System.out.println("Section:"+section);
        System.out.println("Branch:"+branch);
    }
}
