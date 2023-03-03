package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte date type - input of one line comment
        byte myCurrentAge = 27;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        // char short data type - available to input symbols
        char firstNameLetter = 75; // from java ASCII table means K
        char firstLastNameLetter = 'G';
        System.out.println(firstNameLetter);
        System.out.println(firstLastNameLetter);

        // int data type
        int dateOfBirth = 180595;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvia = 1887000;
        System.out.println(populationOfLatvia);

        // float data type - floating point
        float lapTime = 32.30F;
        System.out.println(lapTime);

        // double data type
        double weight = 71.5;
        System.out.println(weight);

        // boolean has prefix of is; has -> for logical expressions
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasBerries = true;
        System.out.println(isSpring);
        System.out.printf("%s %s %s\n", isSpring, isWinter, hasBerries);

        // String data type - text storage
        String name = "Krista"; // vsjo napisannoe interpretiruetsja kak tekst
        String lastName = "Gana"; // ctrl+d - copy same text to next line

        // Concatenation - skleivanie strok vmeste
        String fullName = name + " " + lastName;
        System.out.println(fullName); // if no space, will print without space

        String fullNameWithAge = fullName + myCurrentAge;
        System.out.println(fullNameWithAge); // print new line -> Krista Gana27

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.%n", fullName, myCurrentAge );
        // readable text; %s - znachenie iz peremennoj (tekst), %d - decimal integer
        // esli dobavitj \n ili %n v konce, to napechataetsja na dvuh strochkah

        // *
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("10 * 20"); // shows as text
        // will not work ("10" * 20)

        // division
        //c = a / b; - net int, t.k. vishe uzhe proinicializirovana; c = 0 t.k. integer
        //System.out.println(c);

        //preobrazuem iz celogo chisla v float, double - gde mogut bitj drobi
        double result = (double) a / b;
        System.out.println(result); // result 0.5

        // %
        int number = 10 % 4; // ostatok ot delenija
        System.out.println(number);

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // [] massiv
        System.out.println(Arrays.toString(numbers));




    }
}
