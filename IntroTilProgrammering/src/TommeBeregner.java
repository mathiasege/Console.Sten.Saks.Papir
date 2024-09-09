import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MAALESTOKFORHOLD = 2.54;

        System.out.println("Indtast hvor mange tommer, som skal beregnes til cm.");
        double omregn = input.nextDouble();

        double resultat = omregn*MAALESTOKFORHOLD;

        System.out.println("Tommer i Cm: " + resultat);
    }
}
