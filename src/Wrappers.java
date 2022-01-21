import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        Integer numero2 = numero;

        System.out.println("Voce digitou = " + numero2);

        sc.close();
    }
}
