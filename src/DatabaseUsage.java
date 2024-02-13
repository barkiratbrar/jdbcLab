import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUsage {
    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();
        Connection connection = dbConnector.connect();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM StudentManagement");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("StudentName") + " " +
                        resultSet.getInt("age")); }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
