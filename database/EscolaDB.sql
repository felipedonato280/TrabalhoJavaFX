CREATE DATABASE EscolaDB;
USE EscolaDB;

CREATE TABLE Alunos (
    idAluno INT AUTO_INCREMENT,
    nome VARCHAR(255),
    curso VARCHAR(255),
    ano INT,
    numeroMatricula VARCHAR(255),
    PRIMARY KEY (idAluno)
);

CREATE TABLE Disciplinas (
    idDisciplina INT AUTO_INCREMENT,
    nomeDisciplina VARCHAR(255),
    PRIMARY KEY (idDisciplina)
);

CREATE TABLE Avaliacoes (
    idAvaliacao INT AUTO_INCREMENT,
    nomeAvaliacao VARCHAR(255),
    idDisciplina INT,
    FOREIGN KEY (idDisciplina) REFERENCES Disciplinas(idDisciplina),
    PRIMARY KEY (idAvaliacao)
);

CREATE TABLE Notas (
    idNota INT AUTO_INCREMENT,
    nota DECIMAL(5,2),
    idAluno INT,
    idAvaliacao INT,
    FOREIGN KEY (idAluno) REFERENCES Alunos(idAluno),
    FOREIGN KEY (idAvaliacao) REFERENCES Avaliacoes(idAvaliacao),
    PRIMARY KEY (idNota)
);