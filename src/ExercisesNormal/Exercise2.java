package ExercisesNormal;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static List<Integer> calculateRange(int initialNumber, int finalNumber) {
        List<Integer> intervalo = new ArrayList<Integer>();

        if(initialNumber <= finalNumber) {
            while(initialNumber <= finalNumber){
                intervalo.add(initialNumber);
                initialNumber++;
            }
        } else {
            while(finalNumber <= initialNumber){
                intervalo.add(finalNumber);
                finalNumber++;
            }
        }
        return intervalo;
    }
}
