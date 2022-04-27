public class FuncionarioAssalariado extends Funcionario{

    private double salarioMensal;

    FuncionarioAssalariado(String nome, String matricula, double salarioMensal){
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    public double ganhos(){
        return this.salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}