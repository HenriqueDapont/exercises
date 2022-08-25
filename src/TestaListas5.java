import java.util.*;

public class TestaListas5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número inteiro de 1 a 25:");
        int number = scan.nextInt();
        List<Character> alpha = createCipher(number);
        scan.nextLine();
        System.out.println("Digite seu texto:");
        String fraseCripto = scan.nextLine();
        criptografar(fraseCripto, alpha);
    }

    public static List<Character> createCipher(int number) {
        List<Character> alfabeto = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> alfabetoCifrado = new ArrayList<Character>();

        for (int i = number; i < alfabeto.toArray().length; i++) {
            char chave = alfabeto.get(i);
            alfabetoCifrado.add(chave);
        }
        for (int i = number; alfabetoCifrado.toArray().length <= 25; i++) {
            char chave = alfabeto.get(i - number);
            alfabetoCifrado.add(chave);
        }
        System.out.println(alfabetoCifrado);
        return alfabetoCifrado;
    }

    public static String criptografar(String s, List<Character> c) {
        StringBuilder textoCripto = new StringBuilder();
        List<Character> letraCifrada = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            letraCifrada.add(s.charAt(i));
            textoCripto.append(c.get(i));
        }
        System.out.println(letraCifrada);
        System.out.println(textoCripto);
        return textoCripto.toString();
    }
}

