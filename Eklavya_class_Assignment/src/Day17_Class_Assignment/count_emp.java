package Day17_Class_Assignment;

import java.sql.*;

public class count_emp{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");
            String query = "SELECT COUNT(*) FROM emp3";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            rs.next();

            System.out.println(
                    "Total Employees: " + rs.getInt(1));

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}