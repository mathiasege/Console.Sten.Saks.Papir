import java.util.Arrays;

public class Tid {
    public static void main(String[] args) {
        int sekunderPaaEnTime = 3600;
        int sekunder = 25;
        double minut = 57.0;
        int time = 9;
        // final gør en variabel konstant
        final int SEKUNDER_PER_MINUT = 60;
        final int MINUTTER_PER_TIME = 60;

        System.out.println("Tid: " + time + ":" + minut + ":" + sekunder);
        System.out.println("sekunder siden midnat: " + (time*sekunderPaaEnTime + minut*SEKUNDER_PER_MINUT + sekunder));

        final int SEKUNDER_PAA_EN_DAG = 86400;
        System.out.println("sekunder til midnat: " + (SEKUNDER_PAA_EN_DAG-35845));

        int slutSekunder = 25;
        int slutMinut = 26;
        int slutTime = 10;

        System.out.println("sekunder fra midnat til slut af opgave: " + (slutTime*sekunderPaaEnTime + slutMinut*SEKUNDER_PER_MINUT + slutSekunder));
        System.out.println("Sekunder brugt i alt: " + (37585 - 35845));
        //------------------------------------------------------------------------------------------------------

        // Opgave 1 - Udskriv hvor mange procentdele af en time din minutvariabel er.

        System.out.println("Procentdel af timen der er gået: " + (minut * 100 / MINUTTER_PER_TIME));

        // OPGAVE 2: Lav dine minut-variabel om til typen double som beskrevet i eksemplet,
        // så du får et kommatal der viser hvor mange brøkdele af en time din minut-variabel er.

        System.out.println("Brøkdel af timen, der er gået: " + (minut / MINUTTER_PER_TIME));

        //OPGAVE 3: Lav dine minut-variablen om til typen double som beskrevet i eksemplet,
        // ved at type caste variablen inde i selve beregningen.
        System.out.println("Typecast af slutminut.");
        System.out.println("Brøkdel af timen, der er gået: " + ((double)slutMinut / MINUTTER_PER_TIME));
    }
}
