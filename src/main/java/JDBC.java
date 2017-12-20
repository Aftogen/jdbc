
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws Exception {
        String user = "root";
        String pass = "root";
        String connectionURL = "jdbc:mysql://localhost:3306/mysql";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connectionURL,user,pass);
            Statement statement = connection.createStatement()){
            System.out.println("connected");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients.shop");
            while (resultSet.next()){
                System.out.print(resultSet.getString(1)+" ");
                System.out.print(resultSet.getString(2)+" ");
                System.out.print(resultSet.getString(3)+" ");
                System.out.print(resultSet.getString(4)+" ");
                System.out.print(resultSet.getString(5)+" ");
                System.out.println();
            }
        }
    }
}
