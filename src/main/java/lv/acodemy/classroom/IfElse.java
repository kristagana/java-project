package lv.acodemy.classroom;

public class IfElse {
    public static void main(String[] args) {
        //IF
        /*
        if(condition) {
        code to be executed
        }
         */

        boolean x = 5 > 2;
        System.out.println(x);

        if(x) { // if x = true, below mentioned comment will be displayed;
            // if x = false (5>6), below mentioned comment will NOT be displayed;
            System.out.println("Yes, 5 is more than 2");
        }

        int number = 19;
        if(number % 2 == 0) {
            System.out.println("Number: " + number + " is even number.");
        } else {
            System.out.println("Number: " + number + " is NOT even number.");
        }

        int age = 17;
        if(age < 18) {
            System.out.println("You are not allowed to buy here!");
        } else {
            System.out.println("Welcome to our shop!");
        }

        boolean isSummer = false;
        if(isSummer) {
            System.out.println("Summer months: June, July, August");
        }

        // IF-ELSE-IF
        /*
        if(condition) {
        code to be executed
        } else if(condition) {
        code to be executed
        } else {
        code to be executed
        }
         */

        int currentAge = 17;
        if(currentAge < 18) {
            System.out.println("You are not allowed to buy here!"); // true
        } else if (currentAge <= 0) {
            System.out.println("Who are you?");
        } else {
            System.out.println("Welcome to our shop!");
        }

        int enterAge = 23;
        if(enterAge <= 0) {
            System.out.println("Age 0 or less is not allowed"); // false
        } else if (currentAge <= 0) {
            System.out.println("You are not allowed to buy here!"); // false
        } else {
            System.out.println("Welcome to our shop!"); // true
        }

        // IF Anna = Hello Anna!
        // IF Zina = You are not invited!
        // All others = Welcome!

        String name = "Zina";
        if (name.equals("Anna")) {
            System.out.println("Hello Anna!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not invited!");
        } else {
            System.out.println("Welcome!");
        }

        // switch case;
        int currentMonth = 3;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is winter");
                break;
//            case 0: // above is short way how to write.
//                System.out.println("This is winter");
//                break; exit!
//            case 1:
//                System.out.println("This is winter");
//                break;
//            case 2:
//                System.out.println("This is winter");

            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autums");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentMonth);

        }

        // switch case
        // option + enter replace switch to IF;
        // || means OR
        // && AND - at the same time month should be 12 and 1 and 2; it is not real.
        int currentMonth2 = 12;
        if (currentMonth2 == 12 || currentMonth2 == 1 || currentMonth2 == 2) {
            System.out.println("This is winter");
        } else if (currentMonth2 == 3 || currentMonth2 == 4 || currentMonth2 == 5) {
            System.out.println("This is spring");
        } else if (currentMonth2 == 6 || currentMonth2 == 7 || currentMonth2 == 8) {
            System.out.println("This is summer");
        } else if (currentMonth2 == 9 || currentMonth2 == 10 || currentMonth2 == 11) {
            System.out.println("This is autumn");
        } else {
            throw new IllegalStateException("Unexpected value: " + currentMonth);
        }

        // IF student1 = "Kate" and student2 = "Jane"
        // Print: they will work together
        // &&;

        String student1 = "Kate";
        String student2 = "Jane";
        if (student1.equals("Kate") && student2.equals("Jane")) {
            System.out.println("They will work together");
        } else {
                System.out.println("They will work separately");
            }
        }
}