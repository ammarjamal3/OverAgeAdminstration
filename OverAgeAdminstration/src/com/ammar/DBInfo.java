package com.ammar;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ammar.Employee;
public class DBInfo {

	public static Connection getConnection(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ammar";
			con = DriverManager.getConnection(url, "ammar","jamal");
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return con;
	}

	public static int save(Employee emp) throws SQLException{

		int st = 0;
		
		try {
String sql = "INSERT INTO `employee`( `fname`, `name`, `salary`, `age`, `department`, `address`, `date_of_birth`, `gender`, `education`, `experience`, `contract_start`, `contract_end`, `nationality`, `mother_language`, `other_language`, `email`, `phone`,`admin`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            preparedStatement.setString(1, emp.getFname());
			preparedStatement.setString(2, emp.getLname());
			preparedStatement.setFloat(3, emp.getSalary());
			preparedStatement.setInt(4, emp.getAge());
			preparedStatement.setString(5, emp.getDepartment());
			preparedStatement.setString(6, emp.getAddress());
			preparedStatement.setString(7, emp.getDate_of_birth());
			preparedStatement.setString(8, emp.getGender());
			preparedStatement.setString(9, emp.getEducation());
			preparedStatement.setString(10, emp.getExperience());
			preparedStatement.setString(11, emp.getContract_start());
			preparedStatement.setString(12, emp.getContract_end());
			preparedStatement.setString(13, emp.getNationality());
 			preparedStatement.setString(14, emp.getMother_language());
			preparedStatement.setString(15, emp.getOther_language());
			preparedStatement.setString(16, emp.getemail());
			preparedStatement.setDouble(17, emp.getphone());
			preparedStatement.setString(18, emp.getAdmin());
			st = preparedStatement.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st;
}

	
public static int save_Mem(Member mem) throws SQLException{

int st = 0;
		
	try {
String sql = "INSERT INTO `member`( `fname`, `name`, `age`,`department`,`date_of_birth`,"
+ " `gender`, `education`, `experience`,`nationality`, `mother_language`, `other_language`,"
+ "`family_phone`, `family_E-mail`,"
+ "`date_of_join`,`special_needs`,`chronic_diseases`,`other_diseases`,`admin`)"
+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
preparedStatement.setString(1, mem.getFname());
preparedStatement.setString(2, mem.getLname());
preparedStatement.setInt(3, mem.getAge());
preparedStatement.setString(4, mem.getDepartment());
preparedStatement.setString(5, mem.getDate_of_birth());
preparedStatement.setString(6, mem.getGender());
preparedStatement.setString(7, mem.getEducation());
preparedStatement.setString(8, mem.getExperience());
preparedStatement.setString(9, mem.getNationality());
preparedStatement.setString(10, mem.getMother_language());
preparedStatement.setString(11, mem.getOther_language());
preparedStatement.setDouble(12, mem.getFamily_phone());
preparedStatement.setString(13, mem.getFamily_email());
preparedStatement.setString(14, mem.getDate_of_join());
preparedStatement.setString(15, mem.getSpecial_needs());
preparedStatement.setString(16, mem.getChronic_diseases());
preparedStatement.setString(17, mem.getOther_diseases());
preparedStatement.setString(18, mem.getAdmin());
st = preparedStatement.executeUpdate();
	
con.close();
			
} catch (SQLException e) {

e.printStackTrace();
}
		
	return st;
}	
	
	
	
	
	
	
public static int update_member(Member mem){
		
		int st = 0;
		try {
String sql = "UPDATE `member` SET `fname`=?, `name`=?, `age`=?,`department`=?,`date_of_birth`=?,`gender`=?, `education`=?, `experience`=?,`nationality`=?, `mother_language`=?, `other_language`=?,`family_phone`=?,`family_E-mail`=?,`date_of_join`=?,`special_needs`=?,`chronic_diseases`=?,`other_diseases`=?,`Modify By`=? WHERE id= ?";
Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
preparedStatement.setString(1, mem.getFname());
preparedStatement.setString(2, mem.getLname());
preparedStatement.setInt(3, mem.getAge());
preparedStatement.setString(4, mem.getDepartment());
preparedStatement.setString(5, mem.getDate_of_birth());
preparedStatement.setString(6, mem.getGender());
preparedStatement.setString(7, mem.getEducation());
preparedStatement.setString(8, mem.getExperience());
preparedStatement.setString(9, mem.getNationality());
preparedStatement.setString(10, mem.getMother_language());
preparedStatement.setString(11, mem.getOther_language());
preparedStatement.setDouble(12, mem.getFamily_phone());
preparedStatement.setString(13, mem.getFamily_email());
preparedStatement.setString(14, mem.getDate_of_join());
preparedStatement.setString(15, mem.getSpecial_needs());
preparedStatement.setString(16, mem.getChronic_diseases());
preparedStatement.setString(17, mem.getOther_diseases());
preparedStatement.setString(18, mem.getModify_By());
preparedStatement.setInt(19, mem.getId());

		
			st = preparedStatement.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return st;
		
	}



public static int update(Employee emp){
	
	int st = 0;
	
	try {
String sql = "UPDATE `employee` SET `fname`=?,`name`=?,`salary`=?,`age`=?,`department`=?,`address`=?,`date_of_birth`=?,`gender`=?,`education`=?,`experience`=?,`contract_start`=?,`contract_end`=?,`nationality`=?,`mother_language`=?,`other_language`=?,`email`=?,`phone`=?,`Modify By`=? WHERE id= ?";
	Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		preparedStatement.setString(1, emp.getFname());
		preparedStatement.setString(2, emp.getLname());
		preparedStatement.setFloat(3, emp.getSalary());
		preparedStatement.setInt(4, emp.getAge());
		preparedStatement.setString(5, emp.getDepartment());
		preparedStatement.setString(6, emp.getAddress());
		preparedStatement.setString(7, emp.getDate_of_birth());
		preparedStatement.setString(8, emp.getGender());
		preparedStatement.setString(9, emp.getEducation());
		preparedStatement.setString(10, emp.getExperience());
		preparedStatement.setString(11, emp.getContract_start());
		preparedStatement.setString(12, emp.getContract_end());
		preparedStatement.setString(13, emp.getNationality());
			preparedStatement.setString(14, emp.getMother_language());
		preparedStatement.setString(15, emp.getOther_language());
		preparedStatement.setString(16, emp.getemail());
		preparedStatement.setDouble(17, emp.getphone());
		preparedStatement.setString(18, emp.getModify_By());
		preparedStatement.setInt(19, emp.getId());
	
		st = preparedStatement.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return st;
	
}





	
public static int delete(int id){
	
	int st = 0;
	
	try {
		String sql = "DELETE FROM `employee` WHERE id=?";
		Connection con = DBInfo.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		 
		preparedStatement.setInt(1, id);
		
		st = preparedStatement.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return st;
	
}




public static int delete_member(int id){
	
	int st = 0;
	
	try {
		String sql = "DELETE FROM `member` WHERE id=?";
		Connection con = DBInfo.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		 
		preparedStatement.setInt(1, id);
		
		st = preparedStatement.executeUpdate();
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return st;
	
}






	
	
	
public static Employee  getEmployeeId(int id){
	
	Employee emp = new Employee();
	
	try {
		String sql = "SELECT * FROM `employee` WHERE id=?";
		Connection con = DBInfo.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
  			
			emp.setId(resultSet.getInt(1));
			emp.setFname(resultSet.getString(2));
			emp.setLname(resultSet.getString(3));
			emp.setSalary(resultSet.getFloat(4));
			emp.setAge(resultSet.getInt(5));
			emp.setDepartment(resultSet.getString(6));
			emp.setAddress(resultSet.getString(7));
			emp.setDate_of_birth(resultSet.getString(8));
			emp.setGender(resultSet.getString(9));
			emp.setEducation(resultSet.getString(10));
			emp.setExperience(resultSet.getString(11));
			emp.setContract_start(resultSet.getString(12));
			emp.setContract_end(resultSet.getString(13));
			emp.setNationality(resultSet.getString(14));
			emp.setMother_language(resultSet.getString(15));
			emp.setOther_language(resultSet.getString(16));
			emp.setemail(resultSet.getString(17));
			emp.setphone(resultSet.getLong(18));
  		}

			con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return emp;
	
}

public static  List<Employee> getEmployee(){
	
	List<Employee> list = new ArrayList<Employee>();
 
	
	try {
		String sql = "SELECT * FROM `employee` WHERE 1";
		Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
		ResultSet rs = preparedStatement.executeQuery();
				
		while (rs.next()) {
 			
list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), 
rs.getFloat(4), rs.getInt(5), rs.getString(6), rs.getString(7), 
rs.getString(8) , rs.getString(9),rs.getString(10) , 
rs.getString(11) , rs.getString(12),rs.getString(13) , 
rs.getString(14) , rs.getString(15),rs.getString(16),rs.getString(17),
rs.getLong(18),rs.getString(19),rs.getString(20) ));			
		}
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return list;	
}	




public static Member getMemberId(int id){
	
	Member mem = new Member();
	
	try {
		String sql = "SELECT * FROM `member` WHERE id=?";
		Connection con = DBInfo.getConnection();
		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {

			mem.setId(resultSet.getInt(1));
			mem.setFname(resultSet.getString(2));
			mem.setLname(resultSet.getString(3));
			mem.setAge(resultSet.getInt(4));
			mem.setDepartment(resultSet.getString(5));
			mem.setDate_of_birth(resultSet.getString(6));
			mem.setGender(resultSet.getString(7));
			mem.setEducation(resultSet.getString(8));
			mem.setExperience(resultSet.getString(9));
			mem.setNationality(resultSet.getString(10));
			mem.setMother_language(resultSet.getString(11));
			mem.setOther_language(resultSet.getString(12));
			mem.setFamily_phone(resultSet.getLong(13));
			mem.setFamily_email(resultSet.getString(14));
			mem.setDate_of_join(resultSet.getString(15));
			mem.setSpecial_needs(resultSet.getString(16));
			mem.setChronic_diseases(resultSet.getString(17));
			mem.setOther_diseases(resultSet.getString(18));
			
  		}

			con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return mem;
	
}




public static  List<Member> getMember(){
	
	List<Member> list = new ArrayList<Member>();
 
	
	try {
		String sql = "SELECT * FROM `member` WHERE 1";
		Connection con = DBInfo.getConnection();
PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
		
		ResultSet rs = preparedStatement.executeQuery();
				
		while (rs.next()) {
 			
list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3), 
rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), 
rs.getString(8) , rs.getString(9),rs.getString(10) , 
rs.getString(11) , rs.getString(12),rs.getLong(13) , 
rs.getString(14),rs.getString(15),
rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19),rs.getString(20)));			
}
		
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return list;	
}	




}

