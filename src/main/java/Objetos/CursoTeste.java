package Objetos;

public class CursoTeste {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Tom");
    Aluno aluno2 = new Aluno("Rodrigo");

    Curso curso1 = new Curso("Java");
    Curso curso2 = new Curso("React Native");

    curso1.addAluno(aluno1);
    curso2.addAluno(aluno2);

    aluno1.addCurso(curso1);
    aluno2.addCurso(curso2);

    for(Aluno aluno: curso1.alunos) {
      System.out.println("Estou matriculado no curso de " + curso1.nome + " e meu nome é " + aluno.nome);
    }
  }
}
