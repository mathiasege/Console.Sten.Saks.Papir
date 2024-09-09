import java.util.Scanner;

public class BMIBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double UNDER_WEIGHT = 18.5;
        final double NORMAL_WEIGHT = 25;
        final double OVER_WEIGHT = 30;

        System.out.println("Velkommen til BMI-beregner. Jeg hjælper med at finde din BMI");

        System.out.println("Indtast din højde i meter.");
        double height = input.nextDouble();

        System.out.println("indtast din vægt i kg.");
        double weight = input.nextDouble();

        double bmi = weight/Math.pow(height, 2);

        if(bmi <= UNDER_WEIGHT){
            System.out.println("Du er undervægtig: " + bmi);
        } else if (bmi > UNDER_WEIGHT && bmi <= NORMAL_WEIGHT) {
            System.out.println("Du er normalvægtig " + bmi);
        } else if (bmi > NORMAL_WEIGHT && bmi < OVER_WEIGHT) {
            System.out.println("Du er overvægtig " + bmi);
        } else{
            System.out.println("Du er svært overvægtig " + bmi);
        }

    }
}
