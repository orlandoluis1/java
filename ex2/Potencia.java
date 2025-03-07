import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        int x , y;        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x (inteiro e positivo): ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y (inteiro e positivo): ");
        y = sc.nextInt();
        

        if (x < 0 || y < 0) {
            System.out.println("Os valores devem ser inteiros e positivos.");
            return;
        }

        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }

        System.out.println("O resultado de " + x + "^" + y + " é: " + res);

    }
}
