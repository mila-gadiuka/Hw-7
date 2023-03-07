import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Первая задача");
        int salary = 15000;
        int bank = 0;
        int desiredAmountSavings = 2_459_000;
        int month = 0;
        while (bank<desiredAmountSavings) {
            month++;
            bank = bank + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + bank);
        }
    }
    public static void task2(){
        System.out.println("Вторая задача");
        byte i = 0;
        while (i<10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int e = 10; e>=1; e--){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Третья задача");
        int totalPerson = 12_000_000;
        double birth = (double) 17 / 1000;
        double death = (double) 8 / 1000;
        int years = 0;
        while (years < 10) {
            totalPerson = (int) (totalPerson + (totalPerson * birth) - (totalPerson * death));
            years+=1;
            System.out.println("Год " + years + ", численность населения составляет " + totalPerson);
        }
    }
    public static void task4(){
        System.out.println("Четвертая задача");
        int bank = 15000;
        int desiredAmountSavings = 12_000_000;
        int month = 0;
        double monthlyPercentage = 0.07;
        while (bank<desiredAmountSavings) {
            month++;
            bank = (int) (bank + (bank*monthlyPercentage));
            System.out.println("Месяц " + month + " сумма накоплений равна " + bank);
        }
    }
    public static void task5(){
        System.out.println("Пятая задача");
        int bank = 15000;
        int desiredAmountSavings = 12_000_000;
        int month = 0;
        double monthlyPercentage = 0.07;
        while (bank<desiredAmountSavings) {
            month++;
            bank = (int) (bank + (bank*monthlyPercentage));
            if (month%6==0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + bank);
            }
        }
    }
    public static void task6(){
        System.out.println("Шестая задача");
        int bank = 15000;
        int month = 0;
        int monthsAYear = 12;
        int timeToKeepMoneyInTheBank = 9;
        int timeToKeepMoneyInTheBankinMonths = monthsAYear*timeToKeepMoneyInTheBank;
        double monthlyPercentage = 0.07;
        while (timeToKeepMoneyInTheBankinMonths>month) {
            month++;
            bank = (int) (bank + (bank*monthlyPercentage));
            if (month%6==0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + bank);
            }
        }
    }
    public static void task7(){
        System.out.println("Седьмая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер пятницы на этой неделе от 1 до 7: ");
        int friday = in.nextInt();
        for (int day = friday; day <= 31; day+=7) {
            if (friday>=1 && friday<8) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            } else {
                System.out.println("Выберите число из приведенного вам списка вариантов ранее");
            }
        }
    }
    public static void task8(){
        System.out.println("Восьмая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий год: ");
        int currentYear= in.nextInt();
        int minusTwoHundredYearsFromOurTime = currentYear - 200;
        int plusAHundredYearsToOurTime = currentYear + 100;
        for (int year = 0; year<plusAHundredYearsToOurTime; year+=79) {
            if (year>minusTwoHundredYearsFromOurTime) {
                System.out.println(year);
            }
        }
    }
}