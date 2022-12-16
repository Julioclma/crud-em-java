
import javax.swing.*;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Alunos extends Database {

    public void listar() throws SQLException {
        Connection connection = this.connection();
    ResultSet rs = null;
    PreparedStatement stmt = null;
    String query = "SELECT * FROM alunos";
    stmt = connection.prepareStatement(query);
    rs = stmt.executeQuery();

    if(!rs.next()){
        System.out.println("Nenhum aluno cadastrado no Sistema!");
    }else{
        while (rs.next()) {
            System.out.println("Código: "+rs.getString(1) +" | " +
                    " Nome: "+ rs.getString(2) +" | " +
                    "Cadastro: "+rs.getString(3) +" | " +
                    "Idade: "+rs.getString(4));
            System.out.println("-------------------");
        }
    }

    }

    public void cadastrar(String nome, Integer registro, Integer idade) throws SQLException {
        Connection connection = this.connection();
        PreparedStatement stmt = null;
        String query = "INSERT INTO `alunos`(`nome`, `num_registro`, `idade`) VALUES (?, ?, ?)";
        stmt = connection.prepareStatement(query);
        stmt.setString (1, nome);
        stmt.setInt (2, registro);
        stmt.setInt   (3, idade);
   stmt.execute();
        System.out.println("Aluno cadastrado com sucesso!");

    }

    public void atualizar(Integer id, String nome, Integer registro, Integer idade) throws SQLException {
        Connection connection = this.connection();
        PreparedStatement stmt = null;
        String query = "UPDATE `alunos` SET `nome`= ?,`num_registro`= ?,`idade`= ? WHERE id = ?";
        stmt = connection.prepareStatement(query);
        stmt.setString (1, nome);
        stmt.setInt (2, registro);
        stmt.setInt   (3, idade);
        stmt.setInt   (4, id);
        stmt.execute();
        System.out.println("Aluno alterado com sucesso!");
    }

    public void deletar(Integer id) throws SQLException {
        Connection connection = this.connection();
        PreparedStatement stmt = null;
        String query = "DELETE FROM alunos WHERE id = ?";
        stmt = connection.prepareStatement(query);
        stmt.setInt (1, id);
        stmt.execute();
        System.out.println("Aluno excluido com sucesso!");
    }
}
