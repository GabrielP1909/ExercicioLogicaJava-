package exercicio.pkg03;

import java.util.Scanner;

public class Exercicio03 {

 public static void main(String[] args) {
        
       Scanner objNr = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = objNr.nextLine();  

        String resultado = VogaisPorAsterisco(palavra);

        System.out.println("Resultado: " + resultado);
    }

    public static String VogaisPorAsterisco(String palavra) {
       
        String palavraAtt = "";

        for (int i = 0; i < palavra.length(); i++) {
            char trocador = palavra.charAt(i);
            char letraMinuscula = Character.toLowerCase(trocador);

            if (letraMinuscula == 'a' || letraMinuscula == 'e' ||
                letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
                palavraAtt += '*';
            } else {
                palavraAtt += trocador;
            }
        }

        return palavraAtt;
    }
}
