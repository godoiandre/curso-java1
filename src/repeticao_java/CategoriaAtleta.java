package repeticao_java;
/*
 * Dada a idade do atleta, imprima sua categoria
 * Mirim: 10 a 12 anos
 * infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 * 
 */

import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        //inicializando o scanner
        Scanner scanner = new Scanner(System.in);
        //Lendo a idade do atleta]
        System.out.println("Digite a idade do atleta: ");
        int idade = scanner.nextInt();
        if(idade<10 || idade>18){
            System.out.println("Idade inválida");
        }else if(idade>=10 && idade<=12){
            System.out.println("Categoria do atleta: Mirim.");
        }else if(idade>=13 && idade<=15){
            System.out.println("Categoria do atleta: Infantil");
        }else{
            System.out.println("Categoria do atleta: Juvenil");
        }
        scanner.close();
    }
    
}
