package DisplayDonarColumns;
import java.sql.*;

public class DisplayDonarColumns {
    public static void main(String[] args) {
        try {
       
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

          
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DONAR");


            ResultSetMetaData rsmd = rs.getMetaData();

            int numColumns = rsmd.getColumnCount();

            for (int i = 1; i <= numColumns; i++) {
                System.out.println("Column " + i + ":");
                System.out.println("  Name: " + rsmd.getColumnName(i));
                System.out.println("  Type: " + rsmd.getColumnTypeName(i));
                System.out.println("  Size: " + rsmd.getColumnDisplaySize(i));
                System.out.println("  Nullable: " + (rsmd.isNullable(i) == ResultSetMetaData.columnNullable ? "YES" : "NO"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}