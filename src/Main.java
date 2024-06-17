import java.util.Scanner;

/**
 * @author Anthony.Amaz3d
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira nota do aluno: ");
    float nota1 = sc.nextFloat();
    System.out.println("Digite a segunda nota do aluno: ");
    float nota2 = sc.nextFloat();
    System.out.println("Digite a terceira nota do aluno: ");
    float nota3 = sc.nextFloat();
    System.out.println("Digite a quarta nota do aluno: ");
    float nota4 = sc.nextFloat();
    sc.close();

    Aluno aluno = new Aluno(nota1, nota2, nota3, nota4);
    System.out.println(aluno);
    if (aluno.calcularMedia() >= 7 ) {
      System.out.println("Você está aprovado com sucesso! " + aluno.calcularMedia());
    } else if (aluno.calcularMedia() < 7 && aluno.calcularMedia() >= 5) {
      System.out.println("Você está de recuperação! " + aluno.calcularMedia());
    } else {
      System.out.println("Você está reprovado! :( " + aluno.calcularMedia());
    }
  }
}