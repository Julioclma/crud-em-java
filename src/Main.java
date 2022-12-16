import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner teclado = new Scanner(System.in);
        Database conn = new Database();

     Connection connection = conn.connection();


Alunos aluno = new Alunos();

        System.out.println("Bem vindo!");
        boolean i = true;
        while(i){


            System.out.println("Escolha uma das opções abaixo!");
            System.out.println("1 - Listar alunos");
            System.out.println("2 - Cadastrar alunos");
            System.out.println("3 - Alterar registro do aluno");
            System.out.println("4 - Excluir aluno");
Integer opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    aluno.listar();
                    break;
                case 2:

                    System.out.println("Insira o nome do aluno");
                    String nome = teclado.next();
                    System.out.println("Insira o registro do aluno");
                    Integer registro = teclado.nextInt();
                    System.out.println("Insira a idade do aluno");
                    Integer idade = teclado.nextInt();
                    aluno.cadastrar(nome, registro, idade);
                    break;
                case 3:
                    System.out.println("Insira o Código do aluno");
                    Integer id_atualizar = teclado.nextInt();
                    System.out.println("Insira o nome do aluno");
                    String nome_atualizar = teclado.next();
                    System.out.println("Insira o registro do aluno");
                    Integer registro_atualizar = teclado.nextInt();
                    System.out.println("Insira a idade do aluno");
                    Integer idade_atualizar = teclado.nextInt();
                    aluno.atualizar(id_atualizar, nome_atualizar, registro_atualizar, idade_atualizar);
                    break;
                case 4:
                    System.out.println("Insira o Código do aluno que deseja excluir!");
                    Integer id_deletar = teclado.nextInt();
                    aluno.deletar(id_deletar);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
    }
}