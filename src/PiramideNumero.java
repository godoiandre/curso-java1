import java.util.Scanner;

public class PiramideNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i, j;
        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}