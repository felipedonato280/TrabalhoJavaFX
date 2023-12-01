package com.example.cadastraall.model;

public class DisciplinaModel {
    private int idDisciplina;
    private String nomeDisciplina;

    // Getters and setters
    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    // Métodos para interação com o banco de dados
    // Ex: save(), update(), delete(), etc.
}
