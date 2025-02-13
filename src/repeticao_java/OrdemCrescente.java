package repeticao_java;
/*
 * Crie um algoritmo que leia 3 numeors e mostre na tela em ordem crescente
 */

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 numeros:");
        //Lendo os numeros
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        //Colocando-os em ordem crescente
        if(n1<n2 && n1<n3){
            System.out.println(n1);
            if(n2<n3){
                System.out.println(n2);
                System.out.println(n3);
            } else{
                System.out.println(n3);
                System.out.println(n2);
            }

        } else if(n2<n1 && n2<n3){
            System.out.println(n2);
            if(n1<n3){
                System.out.println(n1);
                System.out.println(n3);
            } else{
                System.out.println(n3);
                System.out.println(n1);
            }
        } else{
            System.out.println(n3);
            if(n1<n2){
                System.out.println(n1);
                System.out.println(n2);
            } else{
                System.out.println(n2);
                System.out.println(n1);
            }
        }
        scanner.close();

    }
    
}
