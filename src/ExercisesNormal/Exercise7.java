package ExercisesNormal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(45,66,23,12,2,3);
        List<String> nameList = Arrays.asList("Maria","Leonardo","Henrique","Juliana");
        List<Character> charList = Arrays.asList('x','s','a','t','r');

        sortList(numberList);
        sortList(nameList);
        sortList(charList);
    }
    public static List sortList(List list) {
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
}
