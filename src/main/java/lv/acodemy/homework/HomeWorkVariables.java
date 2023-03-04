package lv.acodemy.homework;

import java.io.FilterOutputStream;

public class HomeWorkVariables {
    public static void main(String[] args) {

        // byte data type
        byte workingDaysPerWeek = 5;
        byte daysPerWeek = 7;
        System.out.println(workingDaysPerWeek);
        System.out.println(daysPerWeek);

        //short data type
        short stepsPerDay = 5467;
        short currentYear = 2023;
        System.out.println(stepsPerDay);
        System.out.println(currentYear);

        // char data type
        char firstNameLetter = 75;
        char firstLastNameLetter = 'G';
        System.out.println(firstNameLetter);
        System.out.println(firstLastNameLetter);

        // int data type
        int tomorrowsDate = 5032023;
        int todaysDate = 4032023;
        System.out.println(todaysDate);
        System.out.println(tomorrowsDate);

        // long data type
        long worldPopulation = 8020009;
        long birthsToday = 220000;
        System.out.println(worldPopulation + " " + birthsToday);

        // float data type
        float priceOfCake = 23.50F;
        float checkTotal = 56.86F;
        System.out.println(priceOfCake);
        System.out.println(checkTotal);

        // double data type
        double weight = 59.800;
        double preferedWeight = 52.700;

        // boolean data type
        boolean isLicence = true;
        boolean hasCar = false;
        System.out.printf("%s %s\n", isLicence, hasCar);

        // String data type
        String name = "Krista";
        String lastName = "Gana";
        String gender = "woman";
        String type = "young";

        // Concatenation
        String fullname = name + " " + lastName;
        String aboutMe = type + " " + gender;
        System.out.printf("Hello! Today is %d. And this is my first homework\n", todaysDate);
        System.out.printf("My fullname is %s. I am %s, who is learning coding %d days per week.\n", fullname,
                aboutMe, workingDaysPerWeek);

        // Arithmetic operators
        int a = 56;
        int b = 112;
        int c = 3;
        int d = a + b; // 168
        int e = b / a; // 2
        int result = (d * c) - e; // (168 * 3) - 2
        System.out.printf("The current result is %d.", result);

    }
}
