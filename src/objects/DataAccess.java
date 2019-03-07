package objects;

import java.sql.*;

public class DataAccess
{
	private Connection conn;
	private PreparedStatement ps;
	private Statement stm;
	private ResultSet rs;
	
	public DataAccess() 
	{
		try {
			//Connects to the database
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/demo1", "demo1admin", "gP4vAJvGR");
		} 

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addMember(Member m)
	{
		String qry = "insert into members values(?, ?, ?, ?, ?, ?, ?, (select now()));";
		
		try 
		{
			ps = conn.prepareStatement(qry);
			
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getPhone());
			ps.setInt(4, m.getMonth());
			ps.setInt(5, m.getDay());
			ps.setString(6, m.getEmail());
			ps.setString(7, m.getPass());
			
			ps.executeUpdate();	
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean memberExists(String email)
	{
		String qry = "select email from members where email = '" + email + "';";
		
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(qry);
			
			if(rs.next()) {
				return true;
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean confirmPass(String email, String pass)
	{
		String qry = "select password from members where email = '" + email + "' and password = '" + pass + "'";
		
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(qry);
			
			if(rs.next() && rs.getString("password").contentEquals(pass)) {
				return true;
			}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Member getMember(String email)
	{
		Member m = new Member();
		
		String qry = "select * from members where email = '" + email + "'";
		
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(qry);
			
			rs.next();
			m.setFname(rs.getString("first_name"));
			m.setLname(rs.getString("last_name"));
			m.setPhone(rs.getString("phone"));
			m.setMonth(rs.getInt("birth_month"));
			m.setMonth(rs.getInt("birth_day"));
			m.setEmail(email);
			m.setPass(rs.getString("pass"));
			m.setJoined(rs.getDate("joined"));
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return m;
	}
}
