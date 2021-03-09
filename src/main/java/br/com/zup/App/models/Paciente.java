package br.com.zup.App.models;

import java.util.List;

public class Paciente {
    private String nome;
    private String email;
    private int idade;
    private String cpf;
    private List<Historico> historico;

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
