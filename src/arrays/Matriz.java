package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ocorreram quantas Provas? ");
        int qtdeNota = teclado.nextInt();

        System.out.print("Tiveram quantos alunos? ");
        int qtdeAluno = teclado.nextInt();

        System.out.println(" ");
        double[][] notas = new double[qtdeAluno][qtdeNota];


        for (int i = 0; i < qtdeAluno; i++){
            double soma = 0;
            for (int j = 0; j < qtdeNota; j++){
                System.out.printf("Aluno(%d) pontuou na prova(%d): ",(i+1), (j+1));
                notas[i][j] = teclado.nextDouble();

                soma+= notas[i][j];
            }
            double media = soma / qtdeNota;
            System.out.println("\nO aluno: "+(i+1)+" obteve a media: "+media+"\n");
        }

    }
}
