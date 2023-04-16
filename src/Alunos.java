public class Alunos{

    private String nome;
    private int num_registro;
    private int idade;

    Alunos(String nome, int num_registro, int idade){
        this.nome = nome;
        this.num_registro = num_registro;
        this.idade = idade;
    }


    public String getNome(){
        return this.nome;
    }

    public int getNumRegistro(){
        return this.num_registro;
    }
    public int getIdade(){
        return this.idade;
    }
}
