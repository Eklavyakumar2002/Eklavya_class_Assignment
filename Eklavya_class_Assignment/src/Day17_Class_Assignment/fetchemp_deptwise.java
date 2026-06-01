package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class fetchemp_deptwise{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");

            String query =
            "SELECT * FROM emp3 WHERE department = ?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Department Name: ");
            String dept = sc.nextLine();

            ps.setString(1, dept);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("department") + " " +
                        rs.getInt("salary"));
            }

            con.close();
            sc.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}