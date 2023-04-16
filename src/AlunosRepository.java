import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunosRepository extends Database {

    public void listar() throws SQLException {

        String query = "SELECT * FROM alunos";

        PreparedStatement stmt = this.connection().prepareStatement(query);

        ResultSet rs = stmt.executeQuery();

        if(!rs.next()){
            System.out.println("Nenhum aluno cadastrado no Sistema!");
            return;
        }

        System.out.println("Código: "+rs.getString(1) +" | " +
                " Nome: "+ rs.getString(2) +" | " +
                "Cadastro: "+rs.getString(3) +" | " +
                "Idade: "+rs.getString(4));

        System.out.println("-------------------");

        while (rs.next()) {

            System.out.println("Código: "+rs.getString(1) +" | " +
                    " Nome: "+ rs.getString(2) +" | " +
                    "Cadastro: "+rs.getString(3) +" | " +
                    "Idade: "+rs.getString(4));

            System.out.println("-------------------");

        }


    }

    protected void cadastrar(Alunos aluno) throws SQLException{

        String query = "INSERT INTO `alunos`(`nome`, `num_registro`, `idade`) VALUES (?, ?, ?)";

        PreparedStatement stmt = this.connection().prepareStatement(query);

        stmt.setString(1, aluno.getNome());

        stmt.setInt(2, aluno.getNumRegistro());

        stmt.setInt(3, aluno.getIdade());

        boolean result = stmt.execute();

        if(result){

            System.out.println("Aluno cadastrado com sucesso!");

            return;

        }

        System.out.println("Não foi possivel cadastrar o aluno!");


    }

    public void atualizar(int id, Alunos aluno) throws SQLException {

        String query = "UPDATE `alunos` SET `nome`= ?,`num_registro`= ?,`idade`= ? WHERE id = ?";

        PreparedStatement stmt = this.connection().prepareStatement(query);

        stmt.setString(1, aluno.getNome());

        stmt.setInt(2, aluno.getNumRegistro());

        stmt.setInt(3, aluno.getIdade());

        stmt.setInt(4, id);

        boolean result = stmt.execute();

        if(result){

            System.out.println("Aluno alterado com sucesso!");

            return;

        }

        System.out.println("Não foi possivel alterar o aluno!");

    }

    public void deletar(int id) throws SQLException {

        String query = "DELETE FROM alunos WHERE id = ?";

        PreparedStatement stmt = this.connection().prepareStatement(query);

        stmt.setInt(1, id);

        boolean result = stmt.execute();

        if(result){

            System.out.println("Aluno excluido com sucesso!");

            return;

        }

         System.out.println("Não foi possivel deletar o aluno");

    }

}
