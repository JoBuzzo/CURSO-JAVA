package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Heitor");
        Aluno aluno4 = new Aluno("Laiza");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Spring");
        Curso curso3 = new Curso("Java mobile");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        aluno3.adicionarCurso(curso2);
        aluno4.adicionarCurso(curso3);


        System.out.println("("+curso1.nome+")"+" alunos:");
        for (Aluno aluno: curso1.alunos){
            System.out.println(aluno.nome);
        }

        System.out.println("\n("+curso2.nome+")"+" alunos:");
        for (Aluno aluno: curso2.alunos){
            System.out.println(aluno.nome);
        }

        System.out.println("\n("+curso3.nome+")"+" alunos:");
        for (Aluno aluno: curso3.alunos){
            System.out.println(aluno.nome);
        }

        System.out.println("\n");
        System.out.println(aluno1.cursos.get(0).alunos);
        System.out.println("\n");


        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
