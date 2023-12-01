package com.example.cadastraall.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import com.example.cadastraall.model.DisciplinaModel;

public class HomeController {
    @FXML
    private TextField textFieldDisciplina;
    @FXML
    private ListView<DisciplinaModel> listViewDisciplinas;

    @FXML
    private void handleCadastrar() {
        String nomeDisciplina = textFieldDisciplina.getText();
        // Validar e criar uma nova disciplina
        DisciplinaModel disciplina = new DisciplinaModel();
        disciplina.setNomeDisciplina(nomeDisciplina);
        // Salvar no banco de dados
        // Adicionar na ListView
        listViewDisciplinas.getItems().add(disciplina);
    }

    // Método para inicializar a ListView com dados do banco de dados
}

