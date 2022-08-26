package ExercisesNormal;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu peso em quilos:");
        double weight = scan.nextDouble();
        System.out.println("Digite sua altura em metros:");
        double height = scan.nextDouble();
        calculateImc(weight, height);
    }

    public static double calculateImc(double weight, double height) {
        double imc;
        imc = weight / Math.pow(height, 2);
        System.out.printf("%.1f\n", imc);
        return imc;
    }
}
