package Book;
import java.sql.*;
public class Book {
public static void main(String args[]) throws Exception
{
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb1","root","");
 Statement stmt= con.createStatement();
    String query = "CREATE TABLE book1 (id INT NOT NULL, name VARCHAR(255) NOT NULL,publication VARCHAR(255) NOT NULL, price DECIMAL(10,2) NOT NULL, PRIMARY KEY (id))";
  stmt.executeUpdate(query);
  String insert = "INSERT INTO book1 (id,name, publication, price) VALUES (1, 'Java','modern collage', 200)";
  System.out.println("table created");
  stmt.executeUpdate(insert);
  System.out.println("data added");
  con.close();
}
}