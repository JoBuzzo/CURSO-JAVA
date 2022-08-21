package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas provas ocorreram? ");
        int quantia = teclado.nextInt();

        double[] notas = new double[quantia];



        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            System.out.print("A nota do "+ (i+ 1) +" semestre: ");
            notas[i] = teclado.nextDouble();

            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("A media e: " + media);
    }
}
