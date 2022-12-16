import javax.swing.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public Connection connection(){
Connection conn = null;


try {
String url = "jdbc:mysql://localhost:3306/alunos?user=root&password=";
conn = DriverManager.getConnection(url);

}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}

return conn;
    }
}
