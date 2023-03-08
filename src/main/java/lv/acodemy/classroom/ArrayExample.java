package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // each number has its own index; 1 = 0, 10 = 9.
        System.out.println(numbers[4]); // if we ask for index 12, we will
        // have error - array has only 10 digits (indexes 0 - 9)

        int apples = numbers[6];
        System.out.println("I have " + apples + " apples");
        System.out.println("Number array contains of: " + numbers.length + " numbers");
        // .length - how many numbers in array (massiv)

        numbers[0] = 90; // we change digit in array
        numbers[9] = 50;
        System.out.println(Arrays.toString(numbers));

        int[] euribor = new int[10]; // empty array with slots for 10 digits
        euribor[0] = 3; // 1st digit
        euribor[1] = 5;
        System.out.println(Arrays.toString(euribor));

        String[] names = {"Krista", "Eva", "Anna", "Marija"};
        System.out.println(names.length);
        System.out.println("My name is: " + names[0]);

        names[3] = "Kate"; // we changed Marija to Kate
        System.out.println(Arrays.toString(names));
    }
}
