import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://mysql:3306/mydb";
        String username = "myuser";
        String password = "mypassword";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM data";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                long number = resultSet.getLong("number");
                String classValue = resultSet.getString("class");

                System.out.println("Name: " + name);
                System.out.println("Number: " + number);
                System.out.println("Class: " + classValue);
                System.out.println();
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
