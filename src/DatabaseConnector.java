//Barkirat Singh Brar
//200554052


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/JdbcLab";
    private static final String USER = "root";
    private static final String PASS = "";
    public Connection connect() {
        try {
        return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
        throw new RuntimeException("Error connecting to the database", e);
        }
    }
}
