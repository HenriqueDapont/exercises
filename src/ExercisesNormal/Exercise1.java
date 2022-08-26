package ExercisesNormal;

public class Exercise1 {

    public static void main(String[] args) {
        showPairs(0);

    }
    public static void showPairs(int number) {
        while(number <= 10000) {
            if(number % 2 == 0){
                System.out.println(number);
            }
             number++;
        }
    }
}
