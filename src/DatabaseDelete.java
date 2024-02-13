import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDelete {
    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();
        Connection connection = dbConnector.connect();
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate("DELETE FROM StudentManagement WHERE id = 1");
                    System.out.println("Deleted " + rowsAffected + " row(s) from the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
// Don't forget to close your connections when you're done
        try {
            if(connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace(); }
        }

    }
}
