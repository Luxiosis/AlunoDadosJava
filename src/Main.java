/*
Construir uma aplicação de cálculo de notas de uma aluno, sabendo que ele pode ser aluno da Univille
ou aluno da UFSC, que possuem formas de avaliação diferente. Mostrar os dados e a média do aluno.

HERANÇA = possibilidade de se reutilizar os atributos e os métodos em outra classe. É possível fazer herança única,
mas não existe herança múlitpla no Java, mas uma classe pode gerar várias outras classes-filhas.

SUPERCLASSE: PESSOA -> aluno    ->estagiario
                    -> funcionario
*/

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlunoUFSC aluno1 = new AlunoUFSC();
        AlunoUFSC aluno2 = new AlunoUFSC("Albertino Neves","5367-23249715",9.5, 1.5, 6.4);
        AlunoUniville aluno3 = new AlunoUniville(5.5, 7.5, 8.9);
        //Scanner sc = new Scanner(System.in);

        aluno1.setNomeAluno("Lucas Eduardo Ferreira");
        aluno1.setMatricula("3423-43334343");
        aluno1.setProva1(7.5);
        aluno1.setProva2(8.5);
        System.out.println(aluno1.getNomeAluno());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        System.out.println("");

        aluno2.setNomeAluno("Jairo Jairo");
        aluno2.setMatricula("3433-87564099");
        System.out.println(aluno2.getNomeAluno());
        System.out.println(aluno2.getMatricula());
        System.out.println(aluno2.toString());
        aluno2.calcMedia();

        System.out.println("");

        aluno3.setNomeAluno("Eustácio");
        aluno3.setMatricula("8438-746324233");
        System.out.println(aluno3.getNomeAluno());
        System.out.println(aluno3.getMatricula());
        System.out.println(aluno3.toString());
        aluno3.calcMedia();
    }
}