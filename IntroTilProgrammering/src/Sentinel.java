import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SENTINEL = -1;
        int input = 0;
        int sum = 0;

        while(input != SENTINEL) {
            System.out.println("Skriv et tal, som skal lægges til");
            input = scanner.nextInt();

            if(input != -1) {
                sum += input;
            }

            System.out.println("resultat: " + sum);
        }

        scanner.close();
    }
}
