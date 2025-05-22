package exercicio.pkg04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner objNr = new Scanner(System.in);

        String[] palavras = new String[3];

        System.out.println("Digite uma palavra:");
        palavras[0] = objNr.nextLine();

        System.out.println("Digite outra palavra:");
        palavras[1] = objNr.nextLine();

        System.out.println("Digite mais uma palavra:");
        palavras[2] = objNr.nextLine();


        String palavraComMaisVogais = "";
        int maxVogais = -1; //Dica para sempre atualizar, pois 0 é muito vazio 

        for (int i = 0; i < palavras.length; i++) {
            int vogaisAtual = contarVogal(palavras[i]);

            if (vogaisAtual > maxVogais) {
                maxVogais = vogaisAtual;
                palavraComMaisVogais = palavras[i];
            }

        } 
        System.out.println("Palavra com mais vogais: " + palavraComMaisVogais + " com " + maxVogais + " vogais.");
    }

    public static int contarVogal(String palavras) {

        int conta = 0;

        String palavrasAtt = palavras.toLowerCase();
        for (int i = 0; i < palavrasAtt.length(); i++) {
            char letra = palavrasAtt.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                conta++;

            } 
        }
         return conta;
    }
    } 