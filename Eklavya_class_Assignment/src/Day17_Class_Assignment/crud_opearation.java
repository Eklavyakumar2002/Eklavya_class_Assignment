package Day17_Class_Assignment;

import java.sql.*;
import java.util.Scanner;

public class crud_opearation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db", "root",
					"Eklavya2002@");

			System.out.println("1. Insert Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Update Salary");
			System.out.println("4. Delete Employee");

			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {

				String query = "INSERT INTO emp3 VALUES (?, ?, ?, ?)";

				PreparedStatement ps = con.prepareStatement(query);

				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Department: ");
				String dept = sc.nextLine();

				System.out.print("Enter Salary: ");
				int salary = sc.nextInt();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, dept);
				ps.setInt(4, salary);

				ps.executeUpdate();

				System.out.println("Employee Inserted");
			}

			else if (choice == 2) {

				String query = "SELECT * FROM emp3";

				Statement st = con.createStatement();

				ResultSet rs = st.executeQuery(query);

				while (rs.next()) {

					System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("department")
							+ " " + rs.getInt("salary"));
				}
			}

			else if (choice == 3) {

				String query = "UPDATE emp3 SET salary=? WHERE id=?";

				PreparedStatement ps = con.prepareStatement(query);

				System.out.print("Enter New Salary: ");
				int salary = sc.nextInt();

				System.out.print("Enter Employee ID: ");
				int id = sc.nextInt();

				ps.setInt(1, salary);
				ps.setInt(2, id);

				ps.executeUpdate();

				System.out.println("Salary Updated");
			}

			else if (choice == 4) {

				String query = "DELETE FROM emp3 WHERE id=?";

				PreparedStatement ps = con.prepareStatement(query);

				System.out.print("Enter Employee ID: ");
				int id = sc.nextInt();

				ps.setInt(1, id);

				ps.executeUpdate();

				System.out.println("Employee Deleted");
			}

			con.close();
			sc.close();

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}