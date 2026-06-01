package Day17_Class_Assignment;

import java.sql.*;

public class display_highsalary{

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees_db",
                    "root",
                    "Eklavya2002@");
            String query = "SELECT * FROM emp3 WHERE salary = (SELECT MAX(salary) FROM emp3)";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("department") + " " +
                        rs.getInt("salary"));
            }
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
