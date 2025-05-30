import java.time.LocalDate;
public class Main {

    // task 1

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // task 2

    public static void isAppRecommended(int os, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (phoneYear < currentYear) {
            switch (os) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Для данной операционной системы нет приложения");
            }
        } else {
            switch (os) {
                case 0:
                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Для данной операционной системы нет приложения");
            }
        }
    }

    // task 3

    public static int calculateDeliveryDaysByDistance (int distance) {
        int deliveryDays = 0;
        if (distance <= 20) {
            deliveryDays += 1;
        } else if (distance <= 60) {
            deliveryDays += 2;
        } else if (distance <= 100) {
            deliveryDays += 3;
        } else {
            System.out.println("Доставки нет");
            return -1;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        isLeapYear(year);
        System.out.println("\nЗадача 2");
        int phoneYear = 2026;
        int ios = 0;
        int android = 1;
        isAppRecommended(ios, phoneYear);
        System.out.println("\nЗадача 3");
        int deliveryDistance = 101;
        System.out.println("Потребуется дней: " + calculateDeliveryDaysByDistance(deliveryDistance));
    }
}