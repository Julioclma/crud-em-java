import java.sql.*;

public class Database {
    private Connection connection;

    protected Connection connection() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alunos?user=root&password=admin");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return this.connection;
    }

}
