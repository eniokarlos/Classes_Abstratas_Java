public class FuncionarioHora extends FuncionarioAssalariado{
    private int horas;
    private double valorDaHora; 

    FuncionarioHora(String nome, String matricula, double salarioMensal, int horas, double valorDaHora){
        super(nome, matricula, salarioMensal);
        this.horas = horas;
        this.valorDaHora = valorDaHora;
    }

    public double ganhos(){
        return horas * valorDaHora + super.ganhos();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }
    
}
