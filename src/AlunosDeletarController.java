import java.sql.SQLException;
import java.util.Scanner;

public class AlunosDeletarController extends AlunosRepository {
    private Scanner teclado = new Scanner(System.in);

    AlunosDeletarController()  throws SQLException {
        this.action() ;
    }
    public void action() throws SQLException {

        System.out.println("Insira o Código do aluno que deseja excluir!");

        int id = this.teclado.nextInt();

        this.deletar(id);

    }
}
