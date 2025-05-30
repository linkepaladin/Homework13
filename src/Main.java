public class Main {

    // task 1

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        isLeapYear(year);
    }
}