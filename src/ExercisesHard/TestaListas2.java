package ExercisesHard;

import java.util.*;

public class TestaListas2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pedro","Ana","Lucas","Maria","Talita","Jhonson",
                "Amanda","Joice","Mario","Carlos","Jenifer");

        startsVowel(names);
        System.out.println(" ");
        startsConsonant(names);
    }
    public static List<String> startsVowel (List<String> content) {
        List<String> startsWithVowel = new ArrayList<String>();

        for (String name: content) {
            char firstLetter = Character.toLowerCase(name.charAt(0));
            switch (firstLetter) {
                case 'a', 'e', 'i', 'o', 'u':
                    startsWithVowel.add(name);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Nomes que iniciam com vogal:");
        startsWithVowel.forEach(System.out::println);
        return startsWithVowel;
    }
    public static List<String> startsConsonant (List<String> content) {
        List<String> startsWithConsonant = new ArrayList<String>();

        for (String name: content) {
            char firstLetter = Character.toLowerCase(name.charAt(0));
            switch (firstLetter) {
                case 'a', 'e', 'i', 'o', 'u':
                    break;
                default:
                    startsWithConsonant.add(name);
                    break;
            }
        }
        System.out.println("Nomes que iniciam com consoante:");
        startsWithConsonant.forEach(System.out::println);
        return startsWithConsonant;
    }
}