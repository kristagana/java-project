package lv.acodemy.classroom;

public class Calculator {

    // Regular calculator: sum, divide, multiply, substract (4 methods)
    // return int
    // method should ask for 2 parameters ( two int)

    // metod kotorij vozvrashaet, dolzhen imetj tip dannih pered nazvaniem v nachale i kljuchevoe slovo return

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }


}
