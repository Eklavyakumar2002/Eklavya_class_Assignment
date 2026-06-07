package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class searchemp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");

            CallableStatement cs =
            con.prepareCall("{call SearchEmployee(?)}");

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            cs.setInt(1, id);

            ResultSet rs = cs.executeQuery();

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