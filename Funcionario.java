public abstract class Funcionario{
    private String nome;
    private String matricula;

    Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;   
    }

    public abstract double ganhos();

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }
}



