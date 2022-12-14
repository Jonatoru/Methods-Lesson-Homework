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
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int year = 2022;
        definitionOfLeapYear (year);
    }
}