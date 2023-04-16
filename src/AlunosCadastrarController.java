import java.sql.SQLException;
import java.util.Scanner;

public class AlunosCadastrarController extends AlunosRepository {


    private Scanner teclado = new Scanner(System.in);

    AlunosCadastrarController()  throws SQLException {
        this.action() ;
    }

    public void action() throws SQLException {

        System.out.println("Insira o nome do aluno");

        String nome = this.teclado.next();

        System.out.println("Insira o registro do aluno");

        int num_registro = this.teclado.nextInt();

        System.out.println("Insira a idade do aluno");

        int idade = this.teclado.nextInt();

        this.cadastrar(new Alunos(nome, num_registro, idade));
    }
}
