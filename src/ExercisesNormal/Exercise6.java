package ExercisesNormal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise6 {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(23, 56, 77, 12, 2, 7, 4, 99, 45);

        removeOddNumbers(numberList);
    }

    public static List<Integer> removeOddNumbers(List<Integer> numberList) {
        List<Integer> pairNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numberList.size(); i++) {
            if(numberList.get(i) % 2 == 0) {
                pairNumbers.add(numberList.get(i));
            }
        }
        System.out.println(pairNumbers);
        return numberList;
    }
}
