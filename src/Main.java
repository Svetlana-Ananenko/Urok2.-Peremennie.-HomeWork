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
        System.out.println("Значение переменной 'nameOne' с типом 'byte' равно " + nameTwo);
        System.out.println("Значение переменной 'nameOne' с типом 'short' равно " + nameThree);
        System.out.println("Значение переменной 'nameOne' с типом 'long' равно " + nameFour);
        System.out.println("Значение переменной 'nameOne' с типом 'float' равно " + nameFive);
        System.out.println("Значение переменной 'nameOne' с типом 'double' равно " + nameSix);

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

        byte totalSheets = 120;
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



    }
}