package ExercisesHard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestaListas3 {

    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(10, 15, 6, 12, 90, 800, 1, 25, 400, 2, 9, 2);

        listDecrease(listNumbers);
        System.out.println(listNumbers);
    }
    public static List<Integer> listDecrease (List<Integer> content) {
        content.sort(Comparator.reverseOrder());
        return content;
    }
}
