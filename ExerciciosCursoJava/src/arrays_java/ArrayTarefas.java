package arrays_java;

import java.util.Scanner;

public class ArrayTarefas {
    public static void main(String[] args) {
        String[] tarefas = new String[] {
            "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };
     
        Scanner scanner = new Scanner(System.in);
        while (true) {
          // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
          System.out.println("\nOpções:");
          System.out.println("1. Cadastrar tarefa");
          System.out.println("2. Listar tarefas");
          System.out.println("3. Sair");
          
          int opcao = scanner.nextInt();
          scanner.nextLine(); // Limpar o buffer do teclado
    
          switch (opcao) {
            case 1 ->{
                int n = scanner.nextInt();
                scanner.nextLine();
                if(n<=0 || n>10){
                    System.out.println("Número da tarefa inválido.");
                    continue;
                }
                System.out.println("Digite a tarefa:");
                tarefas[n-1] = scanner.nextLine();
            }
            case 2 ->{
                //imprimindo o array tarefas
                for(int i=0; i<tarefas.length; i++){
                    System.out.printf("Tarefa %d - %s%n", i+1, tarefas[i]);
                }
            }
            case 3 ->{
                System.out.println("Encerrando programa...");
                scanner.close();
                return;
            }
            default -> {
              System.out.println("Encerrando programa...");
              scanner.close();
              return;
            }
          }
        }
    }
}
