import java.util.Scanner;

public class SomaAteN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n = scanner.nextInt();
        scanner.close();
        int soma = 0;
        int i;
        for(i=1; i<=n; i++){
            soma = soma + i;
        }
        System.out.printf("Soma de 1 até %d: %d\n", n, soma);
    }
}