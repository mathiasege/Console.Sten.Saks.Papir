import java.util.Random;

public class TerningKast {
    public static void main(String[] args) {
        Random rand = new Random();
        int diceTotal = 0;
        final int SUM_OF_TOTAL = 7;

        while(diceTotal != SUM_OF_TOTAL){
            int dice1 = rand.nextInt(1,7);
            int dice2 = rand.nextInt(1,7);

            diceTotal = dice1 + dice2;

            System.out.println("Dice one: " + dice1);
            System.out.println("Dice two: " + dice2);
            System.out.println("Dice total: " + dice1 + " + " + dice2 + " = " + diceTotal);
        }

        System.out.println("Færdig");

    }
}
