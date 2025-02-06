/*
 * Crie uma calculadora que dados 2 numeros e uma operação retorne
 * o resultado da operação
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lendo o os numeros e a operação
        System.out.println("Digite dois numeros e a operação\nAdição: + \nSubtração: - \nDivisão: / \nMultiplicação: *\n");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        String op = scanner.next();

        //Switch para selecionar a opçao de operação
        switch(op){
            case "+" -> System.out.printf("%d + %d = %d", n1, n2, n1+n2);
            case "-" -> System.out.printf("%d - %d = %d", n1, n2, n1-n2);
            case "/" -> System.out.printf("%d/%d = %.2f", n1, n2, n1/n2);
            case "*" -> System.out.printf("%d*%d = %d", n1, n2, n1*n2);
            default -> System.out.println("opção invalida!");
        }
        scanner.close();
    }
}
