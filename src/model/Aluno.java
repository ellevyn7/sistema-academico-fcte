// src/model/Aluno.java
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Aluno implements Serializable {
    protected String nome;
    protected String matricula;
    protected String curso;
    protected List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    public abstract boolean podeMatricularMais();

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", disciplinasMatriculadas=" + disciplinasMatriculadas.size() +
                '}';
    }
}
