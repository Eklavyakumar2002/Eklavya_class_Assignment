package Day17_Class_Assignment;

import java.sql.*;

public class salaryfilter{

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");
            String query = "SELECT * FROM emp3 WHERE salary > 50000";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3) + " " +
                        rs.getInt(4));
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}