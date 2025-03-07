package exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario fi = new Funcionario();
        System.out.print("Informe o salario: ");
        fi.setSalario(sc.nextInt());
        sc.nextLine();
        System.out.print("Informe a prestaçao: ");
        fi.setPrestacao(sc.nextInt());
        sc.nextLine();

        int x , y;

        x = fi.getPrestacao();
        y = fi.getSalario();

        if (x > (y * 0.3)){
            System.out.print("A prestaçao nao pode ultrapassar 30% do salario para o emprestimo!");
        }
        else{
            System.out.print("O emprestimo pode ser condedido!");
        }
    }
}
