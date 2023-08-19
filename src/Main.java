public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " +total+ " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int one = 1 ;
        while (  one < 10 ) {
            System.out.print ( one + " " );
            one++ ;  }
        System.out.printf(" \n ");

        for ( int ten = 10 ; ten >= 1 ; ten = ten - 1 ){
            System.out.print ( ten + " " );
        }
    }
    public static void task3 () {
        System.out.println("\nЗадача 3");
        int totalLesidents= 12_000_000 ;
        int birthRate = 17; //1000
        int mortality = 8;
        int dif = birthRate - mortality;
        for(int i = 1; i <= 10; i++){
            totalLesidents += totalLesidents * dif / 1000;
        System.out.println("Год " + i +  " численность населения составляет " + totalLesidents);}

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total < 12_000_000) {
            total = total + contribution;
            total = total + total/ 100 * 7;
            i++;

        System.out.println("Месяц " + i + " Накопления " +total);}

    }


     public static void task5() {
        System.out.println("Задача 5");
         int contribution = 15000;
         int total = 0;
         int i = 0;
         while (total < 12_000_000) {
             total = total + contribution;
             total = total + total/ 100 * 7;

             i++;
             if (i % 6 == 0)
             System.out.println("Месяц " + i + " Накопления " +total);}
    }
    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15000;
        int total = 0;
        int period = 9 * 12 ;
        int i = 0;
        while ( i <= period) {
            total = total + contribution;
            total = total + total/ 100 * 7;

             i++;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " Накопления " +total);}}
    public static void task7() {
        System.out.println("Задача 7");

        for (int friday = 7; friday <= 31;friday = friday + 7) {

                System.out.println("Сегодня пятница,"+ friday + " число. Необходимо подготовить отчет " );}


    }
    public static void task8() {
        System.out.println("Задача 8");
        int t = 2023;
        int lastYear = t -200 ;
        int futureYear =t+ 100;
        for (int i = lastYear; i < futureYear;i++) {
            if (i % 79==0)


            System.out.println(  " " + i);
        }


    }













}
