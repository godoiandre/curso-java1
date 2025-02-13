/*
 * 
 * Crie um programa que lê um número inteiro N que representa a quantidade de números
 * a serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.
 * Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve 
 * ser feita depois da leitura de todos os números, e não durante.
 * 
 */
package arrays_java;
import java.util.Scanner;

public class ImprimeArray {
    public static void main(String[] args) {
        //lendo o tamanho do array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        //gerando o array de tamanho n
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        //imprimindo os numeros do array
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
