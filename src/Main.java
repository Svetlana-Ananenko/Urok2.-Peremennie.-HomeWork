public class Main {
    public static void main(String[] args) {
        System.out.println("   Задача 1");
        int nameOne = 574;
        byte nameTwo = 107;
        short nameThree = 250;
        long nameFour = 100000L;
        float nameFive = 0.1234567f;
        double nameSix = 0.1234567891011121;
        System.out.println("Значение переменной 'nameOne' с типом 'int' равно " + nameOne);
        System.out.println("Значение переменной 'nameTwo' с типом 'byte' равно " + nameTwo);
        System.out.println("Значение переменной 'nameThree' с типом 'short' равно " + nameThree);
        System.out.println("Значение переменной 'nameFour' с типом 'long' равно " + nameFour);
        System.out.println("Значение переменной 'nameFive' с типом 'float' равно " + nameFive);
        System.out.println("Значение переменной 'nameSix' с типом 'double' равно " + nameSix);

        System.out.println("   Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short f = -159;
        int g = 27897;
        byte h = 67;
        System.out.println("Значение переменной 'a' с типом 'float' равно " + a);
        System.out.println("Значение переменной 'b' с типом 'long' равно " + b);
        System.out.println("Значение переменной 'c' с типом 'double' равно " + c);
        System.out.println("Значение переменной 'd' с типом 'short' равно " + d);
        System.out.println("Значение переменной 'f' с типом 'short' равно " + f);
        System.out.println("Значение переменной 'g' с типом 'int' равно " + g);
        System.out.println("Значение переменной 'h' с типом 'byte' равно " + h);

        System.out.println("   Задача 3");
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        int students = classOne + classTwo + classThree;
        System.out.println("Всего учеников равно " + students);

        int totalSheets = 480;
        System.out.println("Всего листов бумаги " + totalSheets);

        int sheetsInOneClass = totalSheets / 3;
        System.out.println("На каждого ученика рассчитано " + sheetsInOneClass + " листов бумаги");

        System.out.println("   Задача 4");
        byte productivityIn2Minutes = 16;
        int productivityIn1Minutes = productivityIn2Minutes / 2;
        int productivityIn20Minutes = productivityIn1Minutes * 20;
        int productivityIn1Day = productivityIn1Minutes * 60 * 24;
        int productivityIn3Day = productivityIn1Day * 3;
        int productivityIn1Month = productivityIn1Day * 31;
        System.out.println("За '20 минут' машина произвела " + productivityIn20Minutes + " штук бутылок");
        System.out.println("За 'сутки' машина произвела " + productivityIn1Day + " штук бутылок");
        System.out.println("За '3 дня' машина произвела " + productivityIn3Day + " штук бутылок");
        System.out.println("За 'месяц' машина произвела " + productivityIn1Month + " штук бутылок");

        System.out.println("   Задача 5");
        byte wite = 2;
        byte brown = 4;
        byte paint = 120;
        int paintOn1Class = wite + brown;
        System.out.println("На один класс необходимо " + paintOn1Class + " банок краски");
        int totalClass = paint / paintOn1Class;
        System.out.println("В школе " + totalClass + " классов");
        int totalWite = wite * totalClass;
        System.out.println("Вcего потребуется " + totalWite + " банок белой краски");
        int totalBrown = brown * totalClass;
        System.out.println("Вcего потребуется " + totalBrown + " банок коричневой краски");
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        System.out.println("   Задача 6");
        byte Weigth1Banana = 80;
        int Weigth5Banana = Weigth1Banana * 5;
        byte Weigth100Milk = 105;
        int Weigth200Milk = Weigth100Milk * 2;
        byte Weigth1IceCream = 100;
        int Weigth2IceCream = Weigth1IceCream * 2;
        byte Weigth1Egg = 70;
        int Weigth4Egg = Weigth1Egg * 4;
        int WeigthBreakfast = Weigth5Banana + Weigth200Milk + Weigth2IceCream + Weigth4Egg;
        float BreakfastKg = WeigthBreakfast / 1000f;
        System.out.println("Вес спортзавтрака для спортсмена составляет " + WeigthBreakfast + " гр или " + BreakfastKg + " кг");

        System.out.println("   Задача 7");
        byte reset = 7;
        double resetOneDay = 0.25;
        double resetOneDayMax = 0.5;
        double distance1 = reset / resetOneDay;
        System.out.println(distance1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        double distance2 = reset / resetOneDayMax;
        System.out.println(distance2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        double distance3 = reset / ((resetOneDay + resetOneDayMax) / 2);
        String distance4 = String.format("%.2f", distance3);
        System.out.println(distance4 + " дней в среднем уйдет на похудение, если спортсмен будет терять каждый день по 375 грамм");


        System.out.println("   Задача 8");
        int Mariya = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        double Mariya2 = Mariya * 1.1;
        System.out.println("Зарплата Марии, после повышения на 10% будет составлять " + Mariya2 + " рублей в месяц");
        double Denis2 = Denis * 1.1;
        String Denis3 = String.format("%.1f", Denis2);
        System.out.println("Зарплата Дениса, после повышения на 10% будет составлять " + Denis3 + " рублей в месяц");
        double Kristina2 = Kristina * 1.1;
        System.out.println("Зарплата Кристины, после повышения на 10% будет составлять " + Kristina2 + " рублей в месяц");
        int totalMonth = 12;
        int MariyaToYear = Mariya * totalMonth;
        int DenisToYear = Denis * totalMonth;
        int KristinaToYear = Kristina * totalMonth;

        double MariyaToYearNow = Mariya2 * totalMonth;
        double DenisToYearNow = Denis2 * totalMonth;
        double kristinaToYearNow = Kristina2 * totalMonth;

        double MariyaDifference = MariyaToYearNow - MariyaToYear;
        double DenisDifference = DenisToYearNow - DenisToYear;
        String DenisDifference2 = String.format("%.1f", DenisDifference);
        double KristinaDifference = kristinaToYearNow - KristinaToYear;
        System.out.println("Годовой доход Марии вырос на " + MariyaDifference + " рублей");
        System.out.printf("Годовой доход Дениса вырос на %.1f рублей %n " , DenisDifference);
        System.out.println("Годовой доход Кристины вырос на  " + KristinaDifference + " рублей");


    }
}