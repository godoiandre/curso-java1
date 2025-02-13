package arrays_java;

import java.util.Scanner;

public class ComparandoArraysNumeros {
    public static void main(String[] args) {
        //inicializar o scanner
        Scanner scanner = new Scanner(System.in);
        //lendo o 2 numeros
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        //criando os arrays
        int array1[] = new int[n1];
        int array2[] = new int[n2];
        //preenchendo os arrays
        for(int i=0; i<array1.length; i++){
            array1[i] = scanner.nextInt();
        }
        for(int i=0; i<array2.length; i++){
            array2[i] = scanner.nextInt();
        }
        //verificando se tem entradas iguais
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
        scanner.close();
    }
}
