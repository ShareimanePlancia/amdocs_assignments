package assignment.student.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentMain {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			String url ="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String userName = "system";
			String password = "system";
			
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is successful");
			
			String query = "{?= call ADD_STUDENT(?)}";
			CallableStatement cs = con.prepareCall(query);
			
		//	cs.registerOutParameter(1, Types.VARCHAR);
			//cs.setString(1, "001");
			//cs.execute();
			/*cs.setString(1, "001");
			cs.setString(2, "Taylor Swift");
			cs.setString(3, "Makati");
			cs.setString(4, "CET");*/
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM STUDENT");
			
			ArrayList<Student> students = new ArrayList<Student>();
			
			while(results.next()) {
				students.add(new Student(results.getString(1),results.getString(2), results.getString(3),results.getString(4)));
			}
			students.stream()
			.sorted(Comparator.comparing(Student:: getStudID))
			.forEach(s->System.out.println(s.getStudID() + " "+ s.getStudName()+" " + " "+ s.getStudAddress()+ " "+ s.getDepartments()));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}


