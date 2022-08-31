package ExercisesNormal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor entre 0 e 100 reais:");
        double wallet = scan.nextDouble();
        try {
            calculateChange(wallet);
        } catch (IllegalArgumentException e) {
            System.out.println("Valores acima de R$100 são proibidos");
        }
        System.out.println(calculateChange(wallet));
    }

    public static String calculateChange(double money) {
        List<Integer> notes = Arrays.asList(50, 20, 10, 5, 2);
        List<Integer> coins = Arrays.asList(1, 50, 25, 10, 5);
        double toyPrice = 8.50;
        double change;
        int value, qtNotes, qtCoins, changeRemain;
        String result;

        if (money < toyPrice) {
            result = "Dinheiro insuficiente";
            return result;
        } else if (money > 100) {
            throw new IllegalArgumentException();
        } else if (money == toyPrice) {
            result = "Não há troco";
            return result;
        } else {
            change = money - toyPrice;
            result = "Troco = R$ " + String.format("%.2f",change) + "\n";
            value = (int) change;

            for (int i = 0; value != 0 && value != 1; i++) {
                qtNotes = value / notes.get(i);
                if (qtNotes != 0) {
                    result = result + (qtNotes + " nota(s) de R$" + notes.get(i) + ",00.\n");
                    value = value % notes.get(i);
                }
            }
            result = result + "\n";
            if(value == 1){
                result = result + ("1 moeda de R$" + coins.get(0) + "\n");
            }
            changeRemain = (int)Math.round((change - (int) change) * 100);
            System.out.println(changeRemain);

            for (int i = 1; changeRemain != 0 && changeRemain >= 5; i++) {
                qtCoins = changeRemain / coins.get(i);
                if (qtCoins != 0) {
                    result = result + (qtCoins + " moeda(s) de " + coins.get(i) + " centavos.\n");
                    changeRemain = changeRemain % coins.get(i);
                }
            }
        }
        return result;
    }
}
