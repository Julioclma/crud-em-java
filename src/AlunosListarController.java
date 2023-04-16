import java.sql.SQLException;
import java.util.Scanner;

public class AlunosListarController extends AlunosRepository {

    AlunosListarController()  throws SQLException {
        this.action() ;
    }
    public void action() throws SQLException {

        this.listar();

    }
}
