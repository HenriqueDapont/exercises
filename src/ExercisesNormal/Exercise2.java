package ExercisesNormal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva 2 números inteiros para calcular o intervalo entre eles:");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        calculateRange(number1, number2);
        System.out.println(calculateRange(number1, number2));
    }

    public static int calculateRange(int initialNumber, int finalNumber) {
        int finalResult;
        if (initialNumber <= finalNumber) {
            finalResult = finalNumber - initialNumber;
        } else {
            finalResult = initialNumber - finalNumber;
        }
        return finalResult;
    }
}
