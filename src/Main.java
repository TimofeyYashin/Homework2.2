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
    public static void task1() {
        System.out.println("Задача 1");
        int num = 1000000000;
        byte num1 = 126;
        short num2 = 32750;
        long num3 = 900000000;
        float num4 = 5.3245f;
        double num5 = 7.3456728d;
        {
            System.out.println("Значение переменной num с типом int равно " + num);
            System.out.println("Значение переменной num1 с типом byte равно " + num1);
            System.out.println("Значение переменной num2 с типом short равно " + num2);
            System.out.println("Значение переменной num3 с типом long равно " + num3);
            System.out.println("Значение переменной num4 с типом float равно " + num4);
            System.out.println("Значение переменной num5 с типом double равно " + num5);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        float num = 27.12f;
        long num1 = 987678965549L;
        double num2 = 2.786;
        short num3 = 569;
        short num4 = -159;
        int num5 = 27897;
        byte num6 = 67;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short paper = 480;
        int students = classLP + classAS + classEA;
        int sheets = paper/students;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte productivityIn2Minutes = 16;
        int minutes20 = productivityIn2Minutes * 10;
        int day1 = productivityIn2Minutes * 720;
        int day3 = day1 * 3;
        int month = day1 * 43800;
        System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок.");
        System.out.println("За 1 день машина произвела " + day1 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок.");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte dye = 120;
        byte white1Class = 2;
        byte brown1Class = 4;
        int class1 = white1Class + brown1Class;
        int numberOfClasses = dye / class1;
        int necessaryWhite = numberOfClasses * white1Class;
        int necessaryBrown = numberOfClasses * brown1Class;
        System.out.println("В школе, где " + dye + " классов, нужно " + necessaryWhite +
                " банок белой краски и " + necessaryBrown + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 5;
        byte banana1Weight = 100;
        int banana5Weight = banana * banana1Weight;
        // milkMl = 200;
        short weightMilk100Ml = 105;
        int weightMilk200Ml = weightMilk100Ml * 2;
        int plombirWeight = 200;
        int egg = 4;
        int eggWeight1 = 70;
        int eggWeight5 = eggWeight1 * egg;
        float totalWeightGramm = banana5Weight + weightMilk200Ml + plombirWeight + eggWeight5;
        System.out.println("Общий вес в граммах - равен " + totalWeightGramm);
        float weightKilo = totalWeightGramm / 1000;
        System.out.println("Общий вес в килограммах - равен " + weightKilo);
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weightKilo = 7;
        int weighnGramm = weightKilo * 1000;
        short option1 = 250;
        short option2 = 500;
        int option1Day = weighnGramm / option1;
        int option2Day = weighnGramm / option2;
        System.out.println(option1Day + " дней, если будет худеть каждй день на 250 грамм.");
        System.out.println(option2Day + " дней, если будет худеть каждый день на 500 грамм.");
        int average = (option1Day + option2Day) / 2;
        System.out.println(average + " день может потребоваться в среднем, чтобы добиться результата похудения.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        //Годовой доход до повышения ЗП
        int yearMasha = masha * 12;
        int yearDenis = denis *12;
        int yearCristina = cristina * 12;
        // 10% повышения в рублях
        int salaryIncreasePercentage = 10;
        int salaryIncreaseMasha = masha * 10 / 100;
        int salaryIncreaseDenis = denis * 10 / 100;
        int salaryIncreaseCristina = cristina * salaryIncreasePercentage / 100;
        //Месячная зарплата после повышения на 10%
        int salaryMasha = masha + salaryIncreaseMasha;
        int salaryDenis = denis + salaryIncreaseDenis;
        int salaryCristina = cristina + salaryIncreaseCristina;
        //Годовой доход после повышения ЗП
        int year1Masha = salaryMasha * 12;
        int year1Denis = salaryDenis * 12;
        int year1Cristina = salaryCristina * 12;
        // Разница между годовым доходом до и после повышения
        int differenceMasha = year1Masha - yearMasha;
        int differenceDenis = year1Denis - yearDenis;
        int differenceCristina = year1Cristina - yearCristina;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей." +
                "Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей." +
                "Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryCristina + " рублей." +
                "Годовой доход вырос на " + differenceCristina + " рублей.");

    }
}