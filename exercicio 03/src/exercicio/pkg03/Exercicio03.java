package exercicio.pkg03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner objNr = new Scanner(System.in);

        int[] nmrs = new int[5];

        System.out.print("Digite um número inteiro: ");
        nmrs[0] = objNr.nextInt();

        System.out.print("Digite outro número inteiro: ");
        nmrs[1] = objNr.nextInt();

        System.out.print("Digite outro número inteiro: ");
        nmrs[2] = objNr.nextInt();

        System.out.print("Digite outro número inteiro: ");
        nmrs[3] = objNr.nextInt();

        System.out.print("Digite mais um número inteiro: ");
        nmrs[4] = objNr.nextInt();

        int maior = MaiorAb(nmrs);

        System.out.println("O maior valor absoluto é: " + maior);
    }

    public static int MaiorAb(int[] nmr) {

        int maior = 0;

        for (int i = 0; i < nmr.length; i++) {
            int valorAbs;

            if (nmr[i] < 0) {
                valorAbs = -nmr[i];
            } else {
                valorAbs = nmr[i];
            }
            if (valorAbs > maior) {
                maior = valorAbs;
            }
        }

        return maior;
    }

}
