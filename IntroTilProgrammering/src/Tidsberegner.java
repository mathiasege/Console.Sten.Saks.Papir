import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvor mange timer er der gået?");
        int timer = input.nextInt();

        System.out.println("Hvor mange minutter er der gået?");
        int minutter = input.nextInt();

        System.out.println("Hvor mange sekunder er der gået?");
        int sekunder = input.nextInt();

        final int REGNE_SEKUNDER = 60;
        int sekunderIAlt = timer * REGNE_SEKUNDER * REGNE_SEKUNDER + minutter * REGNE_SEKUNDER + sekunder;

        System.out.println("Der er gået: " + sekunderIAlt + " sekunder siden midnat");

    }
}
