package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class updateemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");
            String query = "UPDATE emp3 SET salary = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            System.out.print("Enter New Salary: ");
            int salary = sc.nextInt();
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            ps.setInt(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Salary Updated Successfully");

            } else {

                System.out.println("Employee ID Not Found");
            }
            con.close();
            sc.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}