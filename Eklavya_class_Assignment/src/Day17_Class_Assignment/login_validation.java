package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class login_validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");
            String query ="SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                System.out.println("Login Successful");

            } else {

                System.out.println("Invalid Username or Password");
            }
            con.close();
            sc.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}