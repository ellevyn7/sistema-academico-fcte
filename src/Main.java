import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = null;

        // Criando as disciplinas e turmas
        Disciplina poo = new Disciplina("Programacao Orientada a Objetos", "POO101", 60);
        Disciplina estruturaDados = new Disciplina("Estrutura de Dados", "ED102", 60);
        estruturaDados.adicionarPreRequisito(poo);

     Turma turmaPOO = new Turma(
    poo,
    "Prof. Lucas ",
    "2024.1",
    "Prova e Trabalho",
    true,
    "lab i-10",
    "Segunda e quarta  12h",
    30
);

Turma turmaED = new Turma(
    estruturaDados,
    "Prof, Jonh",
    "2024.1",
    "Trabalho",
    true,
    "Sala s9",
    "Terça e quinta as 10h",
    25
);


        int opcao;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Criar aluno");
            System.out.println("2. Ver dados do aluno");
            System.out.println("3. Matricular em POO");
            System.out.println("4. Matricular em Estrutura de Dados");
            System.out.println("5. Ver turmas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o enter

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matricula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    aluno = new AlunoNormal(nome, matricula, curso);
                    System.out.println(" Aluno criado com sucesso!");
                    break;

                case 2:
                    if (aluno == null) {
                        System.out.println(" Nenhum aluno criado ainda.");
                    } else {
                        System.out.println("\n Dados do aluno:");
                        System.out.println(aluno);
                    }
                    break;

                case 3:
                    if (aluno == null) {
                        System.out.println(" Crie um aluno primeiro.");
                    } else if (aluno.podeMatricularMais()) {
                        aluno.matricularDisciplina(poo);
                        if (turmaPOO.matricularAluno(aluno)) {
                            System.out.println(" Matriculado em POO.");
                        } else {
                            System.out.println(" Não foi possível matricular em POO.");
                        }
                    }
                    break;

                case 4:
                    if (aluno == null) {
                        System.out.println(" Crie um aluno primeiro.");
                    } else if (aluno.getDisciplinasMatriculadas().contains(poo)) {
                        aluno.matricularDisciplina(estruturaDados);
                        if (turmaED.matricularAluno(aluno)) {
                            System.out.println(" Matriculado em Estrutura de Dados.");
                        } else {
                            System.out.println(" Nao foi possível matricular em Estrutura de Dados.");
                        }
                    } else {
                        System.out.println(" Voce precisa estar matriculado em POO primeiro.");
                    }
                    break;

                case 5:
                    System.out.println("\n Informacoes das Turmas:");
                    System.out.println(turmaPOO);
                    System.out.println(turmaED);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println(" Opção invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
