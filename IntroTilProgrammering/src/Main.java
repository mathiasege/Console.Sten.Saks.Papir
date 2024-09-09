import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cat";
        boolean test = a.charAt(2) == b.charAt(0);

        System.out.println("charAt() " + b.charAt(1));
        System.out.println("a sidste: " + a.substring(a.length() - 1) + " | b sidste: " + b.substring(1, 2));

        System.out.println("test: " + test);
    }

}
