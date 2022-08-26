package ExercisesHard;

import java.util.*;

public class TestaListas5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int number = scan.nextInt();
        number = number > 25 ? number % 25 : number;
        List<Character> alfabeto = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> alpha = createCipher(alfabeto, number);
        scan.nextLine();
        System.out.println("Digite seu texto:");
        String fraseCripto = scan.nextLine();
        criptografar2(fraseCripto, alpha, alfabeto);
    }

    public static List<Character> createCipher(List<Character> alfabeto, int number) {

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

    public static String criptografar(String palavraEscrita, List<Character> criptoAlfabeto, int number) {
        StringBuilder textoCripto = new StringBuilder();
        char letra;
        int index;
        for (int i = 0; i < palavraEscrita.length(); i++) {
            letra = palavraEscrita.charAt(i);
            index = criptoAlfabeto.indexOf(letra) + number;
            index = index > 25 ? index - 26 : index;
            textoCripto.append(criptoAlfabeto.get(index));
        }
        System.out.println(textoCripto);
        return textoCripto.toString();
    }
    public static String criptografar2(String palavraEscrita, List<Character> criptoAlfabeto, List<Character> alfabeto) {
        StringBuilder textoCripto = new StringBuilder();
        int index;
        for (int i = 0; i < palavraEscrita.length(); i++) {
            index = alfabeto.indexOf(palavraEscrita.charAt(i));
            textoCripto.append(criptoAlfabeto.get(index));
        }
        System.out.println(textoCripto);
        return textoCripto.toString();
    }
}

