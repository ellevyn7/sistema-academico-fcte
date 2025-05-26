// src/Main.java
import java.util.Scanner;
import model.Aluno;
import model.AlunoNormal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Aluno aluno = null;

        do {
            System.out.println("\n=== Sistema Acadêmico FCTE ===");
            System.out.println("1. Criar Aluno");
            System.out.println("2. Ver informações do Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();

                    aluno = new AlunoNormal(nome, matricula, curso);
                    System.out.println("Aluno criado com sucesso!");
                    break;

                case 2:
                    if (aluno != null) {
                        System.out.println("\nInformações do Aluno:");
                        System.out.println(aluno.toString());
                    } else {
                        System.out.println("Nenhum aluno criado ainda.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
