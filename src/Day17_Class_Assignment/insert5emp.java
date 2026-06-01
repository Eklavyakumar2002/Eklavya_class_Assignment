package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class insert5emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");

            String query = "INSERT INTO emp3 VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Eklavya");
            ps.setString(3, "Testing");
            ps.setInt(4, 50000);
            ps.executeUpdate();

            ps.setInt(1, 102);
            ps.setString(2, "Rahul");
            ps.setString(3, "Developer");
            ps.setInt(4, 60000);
            ps.executeUpdate();


            ps.setInt(1, 103);
            ps.setString(2, "Aman");
            ps.setString(3, "HR");
            ps.setInt(4, 45000);
            ps.executeUpdate();

            ps.setInt(1, 104);
            ps.setString(2, "Neha");
            ps.setString(3, "Manager");
            ps.setInt(4, 70000);
            ps.executeUpdate();

            ps.setInt(1, 105);
            ps.setString(2, "Priya");
            ps.setString(3, "Support");
            ps.setInt(4, 40000);
            ps.executeUpdate();

                System.out.println("Record Inserted");
       }
        catch(Exception e) {

            System.out.println(e);
        }
    }
}