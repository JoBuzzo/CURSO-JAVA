package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        System.out.println("Notas: "+Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println("Media Aluno A: "+total/ notasAlunoA.length+"\n");

        total = 0;
        double[] notasAlunoB = {9.2, 8.7, 7.3, 10};
        System.out.println("Notas: "+Arrays.toString(notasAlunoB));
        for (int i = 0; i <notasAlunoB.length; i++){
            total += notasAlunoB[i];
        }
        System.out.println("Media Aluno B: "+total/ notasAlunoB.length+"\n");






    }
}
