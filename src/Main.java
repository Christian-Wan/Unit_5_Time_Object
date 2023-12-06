// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Time time4 = new Time(10, 14, 43);
        System.out.println(time4);
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.println(time4);
        System.out.println(time5);
        Time time6 = new Time(7, 20, 0);
        time4.add(time6);
        System.out.println(time4);

    }
}