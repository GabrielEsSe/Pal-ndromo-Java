import java.util.Scanner;

public class Lilith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        char[] palabra_original = new char[palabra.length()];
        char[] palabra_invertida = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            palabra_original[i] = palabra.charAt(i);
        }

        for (int i = 0; i < palabra.length(); i++) {
            palabra_invertida[i] = palabra.charAt(palabra.length() - 1 - i);
        }

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra_original[i] != palabra_invertida[i]) {
                System.err.println("Tu palabra no es un palíndromo :c");
                System.exit(0);
            }
        }

        System.out.println("Tu palabra \"" + palabra + "\" es un palíndromo ");
    }
}
