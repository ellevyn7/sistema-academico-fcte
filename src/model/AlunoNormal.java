
package model;

public class AlunoNormal extends Aluno {

    public AlunoNormal(String nome, String matricula, String curso) {
        super(nome, matricula, curso);
    }

    @Override
    public boolean podeMatricularMais() {
        // Aluno normal pode se matricular em qualquer número de disciplinas 
        return true;
    }
}
