public class Dato {
    public static void main(String[] args) {
        int year = 2020;
        String month = "may";
        int date = 12;
        String day = "Monday";

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);

        System.out.println("American: " + day + ", " + month + " " + date + " " + year);
        System.out.println("Dansk: " + date + " " + month + " " + day + " " + year);
    }
}
