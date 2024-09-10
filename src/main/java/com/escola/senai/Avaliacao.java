package com.escola.senai;

public class Avaliacao{

    private double nota1;
    private double nota2;
    private Aluno aluno;
    private Disciplina disciplina;
    private Professor professor;
    private double media;

    public Avaliacao(double nota1, double nota2, Aluno aluno, Disciplina disciplina, Professor professor) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public double getNota1(){
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double mediaCalculo (){
        media = (this.nota1 + this.nota2) / 2.0;
        return media;
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() +", ficou com a média: " + String.format("%.2f", mediaCalculo()) + " em " + disciplina.getNome();
    }
    
}
