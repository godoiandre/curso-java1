/*
 * A Sequência de Fibonacci é uma série matemática em que cada número subsequente é a soma 
 * dos dois números anteriores. Começando com 0 e 1, os primeiros termos da 
 * sequência são 0, 1, 1, 2, 3, 5, 8, 13, 21 e assim por diante. Por exemplo, dado o número 7, o termo fibonacci é 13.
 * Você deve criar um programa Java que permita ao usuário informar um número e calcule
 * o termo da Sequência de Fibonacci correspondente a esse número inteiro positivo
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if(num == 0){
            System.out.println("0");
            return;
        }
        if(num == 1){
            System.out.println("1");
            return;
        }
        int fibo = 0, a = 0, b = 1;
        for(int i=2; i<=num; i++){
            fibo = a + b;
            a = b;
            b = fibo;
        }
        System.out.println(fibo);
    }
}
