package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {
	
	private static final String driver = "com.mysql.jdbc.Driver";
	
	private static final String url = "jdbc:mysql://localhost:3306/test";
	
	private static final String name = "root";
	
	private static final String pwd = "root"; 
	
	public static void test1(){
		
		Connection conn = null;
		
		CallableStatement callStmt = null;
		
		PreparedStatement pre = null;
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,name,pwd);
			conn.setAutoCommit(false);
			pre = conn.prepareStatement("insert into sm_dept values(?,?,?)");
			pre.setInt(1, 1);
			pre.setString(2, "name");
			pre.setString(3, "123242434");
			int results = pre.executeUpdate();
			System.out.println("≤Â»Î¡À"+results+"º«¬º");
		}catch(Exception e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(callStmt != null){
				try {
					callStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	public static void test2(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCTest.test1();

	}

}
