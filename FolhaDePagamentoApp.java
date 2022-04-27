import java.util.ArrayList;
import java.util.Scanner;

public class FolhaDePagamentoApp {
    public static void main(String args[]){
        ArrayList<FuncionarioAssalariado> funcionariosA = new ArrayList<FuncionarioAssalariado>();
        ArrayList<FuncionarioComissionado> funcionariosC = new ArrayList<FuncionarioComissionado>();
        ArrayList<FuncionarioHora> funcionariosH = new ArrayList<FuncionarioHora>();
        funcionariosA.add(new FuncionarioAssalariado("Joao", "12456", 1200.50));
        funcionariosC.add(new FuncionarioComissionado("Maria", "4536", 10, 60.0));
        funcionariosH.add(new FuncionarioHora("Jose", "5674", 2000, 8, 20.0));

        Scanner in = new Scanner(System.in);
        System.out.println("digite 1 para pesquisar um funcionario\n"+
        "digite 0 para sair\n");
        int input = in.nextInt();

        while(input != 0){
            switch(input){
                case 1:
                    System.out.printf("Digite o nome desejado: ");
                    String aux = in.next();
                    for(int i=0; i < 4; i++){
                        if(funcionariosA.get(i).getNome().equalsIgnoreCase(aux)){
                            System.out.printf("Funcionario Econtrado.\nNome: %s %s\n", funcionariosA.get(i).getNome(),
                            funcionariosA.get(i).getMatricula());
                            System.out.printf("Salario a ser pago: R$ %.2f\n\n", funcionariosA.get(i).ganhos());
                            break;
                        }
                        if(funcionariosC.get(i).getNome().equalsIgnoreCase(aux)){
                            System.out.printf("Funcionario Econtrado.\nNome: %s %s\n", funcionariosC.get(i).getNome(),
                            funcionariosC.get(i).getMatricula());
                            System.out.printf("Salario a ser pago + comissao: R$ %.2f\n\n", funcionariosC.get(i).ganhos());
                            break;
                        }
                        if(funcionariosH.get(i).getNome().equalsIgnoreCase(aux)){
                            System.out.printf("Funcionario Econtrado.\nNome: %s %s\n", funcionariosC.get(i).getNome(),
                            funcionariosH.get(i).getMatricula());
                            System.out.printf("Salario a ser pago + comissao: R$ %.2f\n\n", funcionariosC.get(i).ganhos());
                            break;
                        }
                        else{
                            System.out.println("funcionario não encontrado");
                            break;
                        } 
                    }
                break;
            }
        input = in.nextInt();
        }
    }
}
