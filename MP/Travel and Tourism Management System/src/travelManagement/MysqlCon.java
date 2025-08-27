package travelManagement;
import java.sql.*;

public class MysqlCon {
	public static Connection con=null;
	public static Connection getCon()
	{
		if(con==null){
		try
		
			
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ttms_db","root","");
			}
			
		
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		}
		return con;
	}
}