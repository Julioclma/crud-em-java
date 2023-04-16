import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner teclado = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println("Bem vindo!");

            System.out.println("Escolha uma das opções abaixo!\n" +
                    "1 - Listar alunos\n" +
                    "2 - Cadastrar alunos\n" +
                    "3 - Alterar registro do aluno\n" +
                    "4 - Excluir aluno");


            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                  new AlunosListarController();

                    break;

                case 2:

                    new AlunosCadastrarController();

                    break;

                case 3:

                    new AlunosAlterarController();

                    break;

                case 4:

                    new AlunosDeletarController();

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;

            }
        }
    }
}