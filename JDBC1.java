import java.sql.*;
import java.util.Scanner;

public class JDBC1{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "insert into student values(?, ?)"
            );

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Record inserted successfully");

            con.close();
            sc.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}