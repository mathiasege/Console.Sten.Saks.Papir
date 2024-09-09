import java.util.Arrays;

public class IterateThroughArray {
    public static void main(String[] args) {
        double[] arrayDouble = {4.5, 25.3, 12.1, 34.0, 15.5 };

        for(int i = 0; i < arrayDouble.length; i++){
            System.out.println("opløftet i anden: " + Math.pow(arrayDouble[i], 2));
        }
        System.out.println();

        // ---------------------------------------------------------------------------------

        System.out.println("max: " + Arrays.stream(arrayDouble).max().getAsDouble());
        System.out.println("smallest " + Arrays.stream(arrayDouble).min().getAsDouble());

        double smallest = arrayDouble[0];
        double largest = arrayDouble[0];
        for(int i = 0; i < arrayDouble.length; i++){
            if(smallest > arrayDouble[i]){
                smallest = arrayDouble[i];
            }
            if(largest < arrayDouble[i]){
                largest = arrayDouble[i];
            }
        }

        System.out.println("smallest " + smallest + " largest " + largest);
        // -------------------------------------------------------------------------
        for(int i = 0; i < arrayDouble.length; i++){
            if(arrayDouble[i] == 12.1){
                System.out.println("Hurra! Jeg fandt 12.1. Det stod på index " + arrayDouble[i]);
            }
        }
    }
}
