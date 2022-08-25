import java.util.ArrayList;
import java.util.List;

public class TestaLacos1 {

    public static void main(String[] args) {

        multipleOfFive(0);
    }

    public static List<Integer> multipleOfFive(int number){
        List<Integer> listOfFives = new ArrayList<>();
        while (number <= 5000) {
            if (number % 5 == 0)
                listOfFives.add(number);
            number++;
        }
        return listOfFives;
    }
}

