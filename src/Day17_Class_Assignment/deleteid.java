package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class deleteid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");

            String query = "DELETE FROM emp3 WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Employee ID to Delete: ");
            int id = sc.nextInt();

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if(rows > 0) {
                System.out.println("Record Deleted Successfully");

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
