import java.sql.SQLException;
import java.util.Scanner;

public class AlunosAlterarController extends  AlunosRepository {

    private Scanner teclado = new Scanner(System.in);

    AlunosAlterarController()  throws SQLException {
        this.action() ;
    }

    public void action() throws SQLException {
        System.out.println("Insira o Código do aluno");
        int id = this.teclado.nextInt();

        System.out.println("Insira o nome do aluno");
        String nome = this.teclado.next();

        System.out.println("Insira o registro do aluno");
        int num_registro = this.teclado.nextInt();

        System.out.println("Insira a idade do aluno");
        int idade = this.teclado.nextInt();

        this.atualizar(id, new Alunos(nome, num_registro, idade));
    }
}
