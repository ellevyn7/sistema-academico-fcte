
package model;

public class AlunoEspecial extends Aluno {

    public AlunoEspecial(String nome, String matricula, String curso) {
        super(nome, matricula, curso);
    }

    @Override
    public boolean podeMatricularMais() {
        // Aluno especial só pode matricular até 2 disciplinas no maximo
        return disciplinasMatriculadas.size() < 2;
    }
}
