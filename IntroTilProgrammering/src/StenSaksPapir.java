import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {
        // laver mine globale variabler
        final String[] STEN_SAKS_PAPIR = {"sten", "saks", "papir"};
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int pointFjende = 0;
        int pointMine = 0;
        final int POINT_FOR_AT_VINDE = 2;

        // Så længe, at points ikke er 2. Kør
        while(pointFjende != POINT_FOR_AT_VINDE && pointMine != POINT_FOR_AT_VINDE){
            // bruger vælger
            System.out.println("vælg sten, saks eller papir");
            String input = scanner.nextLine().toLowerCase();

            // sætter computer sten, saks, papir.
            String fjendeInput = STEN_SAKS_PAPIR[rand.nextInt(0,3)];

            // udfra brugerinput og computerens input. gør noget
            if(input.equals("sten") && fjendeInput.equals("saks")){
                System.out.println("Du vandt. fjenden fik: " + fjendeInput);
                pointMine++;
            }else if(input.equals("saks") && fjendeInput.equals("papir")) {
                System.out.println("Du vandt. fjenden fik: " + fjendeInput);
                pointMine++;
            }else if(input.equals("papir") && fjendeInput.equals("sten")){
                System.out.println("Du vandt. fjenden fik: " + fjendeInput);
                pointMine++;
            }else if(input.equals(fjendeInput)){
                System.out.println("Det blev uafgjort. Fjenden fik: " + fjendeInput);
                // søger i array og ser om de brugerinput matcher.
            } else if(!STEN_SAKS_PAPIR[0].equals(input) && !STEN_SAKS_PAPIR[1].equals(input) && !STEN_SAKS_PAPIR[2].equals(input)){
                System.out.println("Ugyldigt input.");
            }
//            else if(!Arrays.stream(STEN_SAKS_PAPIR).anyMatch(match -> match.contains(input))){
//                System.out.println("Ugyldigt input.");
//            }
            else{
                System.out.println("Du tabte. fjenden fik: " + fjendeInput);
                pointFjende++;
            }

            // Srkiver point
            System.out.println("Mine point: " + pointMine);
            System.out.println("Fjendens point " + pointFjende);
        }

        // skriv hvem der vinder.
        if(pointFjende == POINT_FOR_AT_VINDE) {
            System.out.println("Vinder er: Computeren.");
        }else{
            System.out.println("Vinder er: Dig.");
        }
        // skriv hvem der vinder.
        //System.out.println("Vinder er: " + (pointFjende == POINT_FOR_AT_VINDE ? "Computeren" : "Dig") + ".");
    }
}
