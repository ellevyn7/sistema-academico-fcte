// src/model/Turma.java
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Turma implements Serializable {
    private Disciplina disciplina;
    private String professor;
    private String semestre;
    private String formaAvaliacao;
    private boolean presencial;
    private String sala; // null se for remota
    private String horario;
    private int capacidadeMaxima;
    private List<Aluno> alunosMatriculados;

    public Turma(Disciplina disciplina, String professor, String semestre, String formaAvaliacao,
                 boolean presencial, String sala, String horario, int capacidadeMaxima) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.semestre = semestre;
        this.formaAvaliacao = formaAvaliacao;
        this.presencial = presencial;
        this.sala = sala;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new ArrayList<>();
    }

    public boolean matricularAluno(Aluno aluno) {
        if (alunosMatriculados.size() < capacidadeMaxima) {
            alunosMatriculados.add(aluno);
            return true;
        }
        return false;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getFormaAvaliacao() {
        return formaAvaliacao;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public String getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "disciplina=" + disciplina.getNome() +
                ", professor='" + professor + '\'' +
                ", semestre='" + semestre + '\'' +
                ", formaAvaliacao='" + formaAvaliacao + '\'' +
                ", presencial=" + presencial +
                ", sala='" + sala + '\'' +
                ", horario='" + horario + '\'' +
                ", capacidadeMaxima=" + capacidadeMaxima +
                ", alunosMatriculados=" + alunosMatriculados.size() +
                '}';
    }
}
