import java.util.*;

public class TestaListas1 {

    public static void main(String[] args) {

        List<String> phrases = Arrays.asList("A base do teto desaba","A batata e o tabaco",
                "Acuda cadela da Leda caduca","Vida vivida","Anotaram a data da maratona",
                "A torre da derrota","A casa esta casada","O galo ama o lago","Oito Morros Altos");

        showPalindrome(phrases);
    }
    public static List<String> showPalindrome(List<String> content) {
        List<String> listOfPalindromes = new ArrayList<String>();
        for (String phrase : content) {
            String phraseWithNoEspace = phrase.replaceAll(" ", "");
            String palindrome = new StringBuilder(phraseWithNoEspace).reverse().toString();
            if (phraseWithNoEspace.equalsIgnoreCase(palindrome)) {
                listOfPalindromes.add(palindrome);
                System.out.println("Palíndromos: " + phrase);
            }
        }
        return listOfPalindromes;
    }
}
