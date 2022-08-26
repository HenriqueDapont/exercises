package ExercisesHard;

public class TestaLacos2 {

    public static void main(String[] args) {

        sumFunction(0);
    }

    public static double sumFunction(double sum) {
        for (int i = 1; i <= 20; i++) {
            double function = ((Math.sqrt(i / 3)) * 4000 + (i / 2)) / 2;
            sum += function;
        }
        //System.out.printf("Soma: %.1f\n", sum);
        return sum;
    }
}