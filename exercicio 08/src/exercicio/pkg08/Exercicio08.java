package exercicio.pkg08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {

   public static void main(String[] args) {
        Scanner objNr = new Scanner(System.in);
        int[] nmrs = new int[3];

        System.out.println("Digite um número inteiro");
        nmrs[0] = objNr.nextInt();
        System.out.println("Digite um segundo número inteiro");
        nmrs[1] = objNr.nextInt();
        System.out.println("Digite um terceiro número inteiro");
        nmrs[2] = objNr.nextInt();

        int[] invertido = ElementoInverso(nmrs);
        System.out.println("Vetor invertido: " + Arrays.toString(invertido));
    }

    public static int[] ElementoInverso(int[] nmrsV) {
        int[] nmrsAtt = new int[nmrsV.length];
        
        for (int i = 0; i < nmrsV.length; i++) {
            nmrsAtt[i] = nmrsV[nmrsV.length - 1 - i];
        }
        return nmrsAtt;
    }
}