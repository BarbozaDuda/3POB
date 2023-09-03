// 1. importando a classe Scanner
import java.util.Scanner;

public class Atv1 
{
    public static void main(String[] args) 
  {
      
      // 2. instanciando e criando um objeto Scanner
        Scanner scanner = new Scanner(System.in);

    //solicitando nome
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

    //solicitando matéria
        System.out.println("Digite a matéria do aluno:");
        String materia = scanner.nextLine();

    //solicitando sigla
        System.out.println("Digite a sigla da matéria:");
        String siglaMateria = scanner.nextLine();

    //solicitando período
        System.out.println("Digite o período que está cursando:");
        String periodo = scanner.nextLine();

    //solicitando idade
        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após a leitura de int

    //solicitando matrícula
        System.out.println("Digite a matrícula do aluno:");
        int matricula = scanner.nextInt();

       
        Aluno aluno = new Aluno(nome, materia, siglaMateria, periodo, idade, matricula);

        // Exibindo os dados do aluno
        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matéria: " + aluno.getMateria());
        System.out.println("Sigla da Matéria: " + aluno.getSiglaMateria());
        System.out.println("Período: " + aluno.getPeriodo());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());

        scanner.close();
    }
}