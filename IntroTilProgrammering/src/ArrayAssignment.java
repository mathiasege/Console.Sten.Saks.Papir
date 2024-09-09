import java.util.Arrays;
import java.util.stream.*;

public class ArrayAssignment {
    public static void main(String[] args) {
        int[] arrayInt = new int[8];

        for(int i = 0; i < arrayInt.length; i++){
            if(i == 0){
                arrayInt[i] = 34;
            }

            if(arrayInt.length - 1 == i){
                arrayInt[i] = 117 ;
            }
        }

        Arrays.stream(arrayInt).forEach(item -> System.out.println("item: " + item));


        String[] arrayString = {"hej", "med", "dig"};
        Arrays.stream(arrayString).forEach(item -> System.out.printf(item + " "));
        System.out.println();
//        for(String item : arrayString)
//            System.out.printf(item + " ");


        double[] arrayDouble = {3.4, 2.5, 1.2, 6.7};

        for (int i = 0; i < arrayDouble.length; i++){
            if(i == 1){
                System.out.println("index 2: " + arrayDouble[i]);
                System.out.println("array length " + arrayDouble.length);
            }
        }


    }
}
