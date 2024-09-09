import java.util.Scanner;

public class PortoBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pris = 0;

        System.out.println("Hvor meget vejer dit brev?");
        double brevVaegt = input.nextDouble();
        if (brevVaegt > 0 && brevVaegt <= 2000) {
            if (brevVaegt > 0 && brevVaegt <= 100) {
                pris = 25;
            } else if (brevVaegt > 100 && brevVaegt <= 250) {
                pris = 50;
            } else {
                pris = 75;
            }
            System.out.println("Prisen for at sende dit brev: " + pris);
        }
        if (brevVaegt < 0) {
            System.out.println("Den indtastede vægt er ikke gyldig");
        }
        /*
        if(brevVaegt > 0 && brevVaegt <= 100) {
            pris = 25;
        }
        else if (brevVaegt > 100 && brevVaegt <= 250) {
            pris = 50;
        }
        else if (brevVaegt > 250 && brevVaegt <= 2000) {
            pris = 75;
        }
        else {
            throw new IllegalArgumentException("Den indtastede vægt er ikke gyldig");
        }

        System.out.println("Prisen for at sende dit brev: " + pris);*/
    }

}
