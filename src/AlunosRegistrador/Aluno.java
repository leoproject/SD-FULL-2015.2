package AlunosRegistrador;

import java.io.Serializable;

public class Aluno implements Serializable{
    private int matric;
    private String nome;
    private String curso;

    public int getMatric() {
        return matric;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Aluno (int m, String n, String c){
        this.matric = m;
        this.nome = n;
        this.curso = c;
    }
}
