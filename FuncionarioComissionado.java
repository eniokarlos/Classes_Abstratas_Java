public class FuncionarioComissionado extends Funcionario{
    private int quantidadeVendas;
    private double valorPorVenda;

    FuncionarioComissionado(String nome, String matricula,int quantidadeVendas, double valorPorVenda){
        super(nome,matricula);
        this.quantidadeVendas = quantidadeVendas;
        this.valorPorVenda = valorPorVenda;
    }

    public double ganhos(){
        return quantidadeVendas * valorPorVenda;
    }
    
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public double getValorPorVenda() {
        return valorPorVenda;
    }

    public void setValorPorVenda(double valorPorVenda) {
        this.valorPorVenda = valorPorVenda;
    }
}
