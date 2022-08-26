package ExercisesHard;

import java.util.*;

public class TestaListas4 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pedro", "Ana", "Lucas", "Maria", "Talita", "Jhonson",
                "Amanda", "Joice", "Mario", "Carlos", "Jenifer");
        alphabeticalOrder(names);
        System.out.println(names);
    }

    public static List<String> alphabeticalOrder(List<String> content) {
        Collections.sort(content);
        return content;
    }
}