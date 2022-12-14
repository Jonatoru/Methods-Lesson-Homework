public class Main {
    public static void definitionOfLeapYear(int year){
        int leapYear = 4;
        int noLeapYear = 100;
        int leapYear400 = 400;
        if (year % noLeapYear == 0 && year % leapYear400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % leapYear == 0 && year % noLeapYear != 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % noLeapYear == 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void phoneLinkSelection(int clientOS, int clientDeviceYearCurrent){
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYearCurrent > clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYearCurrent <= clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYearCurrent > clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if(clientOS == 1 && clientDeviceYearCurrent <= clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }
    public static void deliveryDaysCalculation(int deliveryDistance){
        int timeOfDelivery = 1 + (deliveryDistance + 19) / 40;
        System.out.println("Потребуется дней для доставки: " + timeOfDelivery);
    }
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int year = 2022;
        definitionOfLeapYear (year);

        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYearCurrent = 2016;
        phoneLinkSelection(clientOS, clientDeviceYearCurrent);

        System.out.println("Задача 3");

        int deliveryDistance = 95;
        deliveryDaysCalculation(deliveryDistance);
    }
}