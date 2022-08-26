package ExercisesNormal;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor entre 0 e 100 reais:");
        double wallet = scan.nextDouble();
        try {
            calculateChange(wallet);
        } catch (ArithmeticException e) {
            System.out.println("Dinheiro insuficiente");
        } catch (IllegalArgumentException e) {
            System.out.println("Valores acima de R$100 são proibidos");
        } catch (InputMismatchException e) {
            System.out.println("Não há troco para receber");
        }
        System.out.println(calculateChange(wallet));
    }

    public static String calculateChange(double money) {

        List<Integer> notes = Arrays.asList(50, 20, 10, 5, 2);
        List<Double> coins = Arrays.asList(1.0, 0.5, 0.25, 0.10, 0.5, 0.1);
        double toyPrice = 8.5;
        double change, changeRemain;
        int value, qtNotes, qtCoins;
        String result;

        if (money < toyPrice) {
            throw new ArithmeticException();
        } else if (money > 100) {
            throw new IllegalArgumentException();
        } else if (money == toyPrice) {
            throw new InputMismatchException();
        } else {
            change = money - toyPrice;
            result = "Troco = R$ " + change + "\n";
            value = (int) change;

            for (int i = 0; value != 0 && value != 1; i++) {
                qtNotes = value / notes.get(i);
                if (qtNotes != 0) {
                    result = result + (qtNotes + " nota(s) de R$" + notes.get(i) + "\n");
                    value = value % notes.get(i);
                }
            }
            result = result + "\n";
            changeRemain = (change - (int) change) + value;

            for (int i = 0; changeRemain != 0; i++) {
                qtCoins = (int) (changeRemain / coins.get(i));
                if (qtCoins != 0) {
                    result = result + (qtCoins + " moeda(s) de R$" + coins.get(i) + "\n");
                    changeRemain = changeRemain % coins.get(i);
                }
            }
        }
        return result;
    }
}
