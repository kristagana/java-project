package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++) { // (sozdanie schjotchika);uslovie;novij cikl
            // schotchik nachinaetsja s nulja
            //kotoroe dolznho bitj true, inache zakanchivaetsja cikl
            //
            System.out.println("Hello World");
        }

        //numbers [0] = 1
        //numbers [1] = 2

        for (int i = 0; i < numbers.length; i++) { // i-- v obratnpm porjadke raspechatatj
            //uslovije = budet prohoditj po chislam massivam
            System.out.println(numbers[i] + " ");
            // System.out.println(numbers[i]);
        }

        // numbers [0];
        // numbers [1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { // esli chislo masiva [1] ne delitsja na 2 bez ostatka
                System.out.println(numbers[i]);
            }
        }
        System.out.println("----------");

        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("----------");

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("----------");

        //Creat String array with 10 names
        //Print all names using for & for each

        String[] names = {"Anna", "Olga", "Inna", "Kate", "Raitis", "Sofija", "Krista", "Arturs", "Liga", "Imants"};
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Kate")) {
                System.out.println(names[i]);
            }
        }

        System.out.println("----------");

        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("----------");

        System.out.println(Arrays.toString(names));

        System.out.println("----------");

        // do , do while
        /*
        do {
        // code to be executed
        } (while is true)
         */

        int i = 0; // sdelaet i potom proverit
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("----------");

        int x = 0; // proverjaet uslovie i delaet
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        // move numbers from arrayOfNum to emptyArray using loop
        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];
        }
        System.out.println(Arrays.toString(emptyArray));

        // i = 1
        //emptyArray[1] = 0
        //arrayOfNum[1] = 2

    }
}
