import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionprovider {
    private static Connection con;

    public static Connection getCon() {
        try {
            if (con == null || con.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BloodBank", // your DB name
                    "root", // your MySQL username
                    "Garima@435" // your MySQL password
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Connection Error: " + e.getMessage());
        }
        return con;
    }
}
