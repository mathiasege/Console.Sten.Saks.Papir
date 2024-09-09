import java.util.Scanner;
public class ForLoopStars {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Hvor mange stjerner vil du udskrive?");
//        int antalStjerner = scan.nextInt();
//        int count = 0;
//        while (count < antalStjerner) {
//            System.out.print("*");
//            count++;
//        }

        /*OPGAVE
        Udkommenter al koden i main-metoden, og skriv programmet om
        sådan at det bruger et for-loop i stedet for et while-loop.

        Skriv din kode herunder: ----------------------------------------------------------------------------------------------------
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange stjerner vil du udskrive?");

        int antalStjerner = scanner.nextInt();

        for(int i = 0; i < antalStjerner; i++){
            System.out.println("print nr: " + (i + 1));
        }






        //-----------------------------------------------------------------------------------------------------------------------
    }
}
