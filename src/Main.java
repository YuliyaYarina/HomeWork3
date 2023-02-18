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
        byte pByte = 127;
        short pShort = 32_767;
        int pInt = 2_147_483_647;
        long pLong = -9_223_372_036_854_775_808L;
        float pFloat = 3.4E+38F;
        double pDouble = 1.7E+308;
        System.out.println("Значение переменной pByte с типом byte равно " + pByte);
        System.out.println("Значение переменной pShort с типом short равно " + pShort);
        System.out.println("Значение переменной pInt с типом int равно " + pInt);
        System.out.println("Значение переменной pLong с типом long равно " + pLong);
        System.out.println("Значение переменной pFloat с типом Float равно " + pFloat);
        System.out.println("Значение переменной pDouble с типом double равно " + pDouble);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float pFloat1 = 27.12F;
        long pLong = 987_678_965_549L;
        float pFloat2 = 2.786F;
        short pShort1 = 569;
        short pShort2 = -159;
        short pShort3 = 27_897;
        byte pByte = 67;
        System.out.println("Значение переменной pFloat1 с типом Float равно " + pFloat1);
        System.out.println("Значение переменной pLong с типом long равно " + pLong);
        System.out.println("Значение переменной pFloat2 с типом Float равно " + pFloat2);
        System.out.println("Значение переменной pShort1 с типом short равно " + pShort1);
        System.out.println("Значение переменной pShort2 с типом short равно " + pShort2);
        System.out.println("Значение переменной pShort3 с типом short равно " + pShort3);
        System.out.println("Значение переменной pByte с типом byte равно " + pByte);
    }

    public static void task3() {
        System.out.println("Задача 3");
        short teacherLyudmila = 23;
        short teacherAnna = 27;
        short teacherEkaterina = 30;
        short paper = 480;
        int students = teacherLyudmila + teacherAnna + teacherEkaterina;
        int paperStudent = paper / students;
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte car1M = 16/2;
        int car20M = car1M * 20;
        int car1day = car1M * 60 * 24;
        int car3day = car1day * 3;
        int car1Month = car1day * 30;
        System.out.println("За 20 минут машина произвела " + car20M + " шт бутылок");
        System.out.println("За 1 день машина произвела " + car1day + " шт бутылок");
        System.out.println("За 3 дня машина произвела " + car3day + " шт бутылок");
        System.out.println("За 1 месяц машина произвела " + car1Month + " шт бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte total = 120;
        byte class1 = 2+4;
        int schoolClass = total/class1;
        int white = schoolClass*2;
        int brown = schoolClass*4;
        System.out.println("В школе, где " + schoolClass + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana1 = 80;
        int banana5 = banana1*5;
        byte milk100 = 105;
        int milk200 = milk100*2;
        short iceCream = 2*100;
        byte egg1 = 70;
        int egg4 = egg1*4;
        int breakfast = banana5+milk200+iceCream+egg4;
        float kg = breakfast / 1000f;
        System.out.println("Вес спортзавтрака " + breakfast + " грамм");
        System.out.println("Вес спортзавтрака " + kg + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
       short lose = 7*1000;
       int lose250 = lose/250;
       int lose500 = lose/500;
        System.out.println("Если спортсемен будет терять каждый день по по 250 грамм, то уйдет на это " + lose250 + " дней.");
        System.out.println( "А если спортсмен будет терять каждый день по 500 грамм, то на похудение уйдет " + lose500 + " дней.");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 67230;
        double masha10 = masha*0.1;
        double denis10 = denis*0.1;
        double kristina10 = kristina*0.1;
        double generalM = masha+masha10;
        double generalD = denis+denis10;
        double generalK = kristina+kristina10;
        double yearM = masha10*12;
        double yearD = denis10*12;
        double yearK = kristina10*12;
        System.out.println("Маша теперь получает " + generalM + " рублей. Годовой доход вырос на " + yearM + " рублей.");
        System.out.println("Денис теперь получает " + generalD + " рублей. Годовой доход вырос на " + yearD + " рублей.");
        System.out.println("Маша теперь получает " + generalK + " рублей. Годовой доход вырос на " + yearK + " рублей.");
    }

}