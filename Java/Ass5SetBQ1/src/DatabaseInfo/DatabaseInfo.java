package DatabaseInfo;
import java.sql.*;
public class DatabaseInfo {

 public static void main(String args[])throws Exception
 {
  Class.forName("com.mysql.cj.jdbc.Driver"); 
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviebook","root","");
  DatabaseMetaData dbmd=(DatabaseMetaData)con.getMetaData();
  System.out.println("Database Name="+dbmd.getDatabaseProductName());
  System.out.println("Database Name="+dbmd.getDatabaseProductVersion());
  System.out.println("Database Name="+dbmd.getDriverName());
  System.out.println("URL of Database="+dbmd.getURL());
  System.out.println("Current UserName="+dbmd.getUserName());
  System.out.println("======Tables======");
  String t[]= {"TABLE"};
  ResultSet rs=dbmd.getTables(null, null, null, t);
  while(rs.next())
  {
   System.out.println(rs.getString("TABLE_NAME"));
  }
  con.close();
 }
	
	

}