package br.com.zup.App.models;

import java.time.LocalDate;

public class Historico {
    private LocalDate dataDoRegistro;
    private String nota;

    public Historico() {
    }

    public LocalDate getDataDoRegistro() {
        return dataDoRegistro;
    }

    public void setDataDoRegistro(LocalDate dataDoRegistro) {
        this.dataDoRegistro = dataDoRegistro;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
