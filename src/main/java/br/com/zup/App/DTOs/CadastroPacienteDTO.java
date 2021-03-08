package br.com.zup.App.DTOs;

import br.com.zup.App.models.Paciente;

public class CadastroPacienteDTO {
    private String nome;
    private int idade;
    private String cpf;

    public CadastroPacienteDTO() {
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

    public Paciente converterDTOParaPaciente(){
        Paciente paciente = new Paciente();
        paciente.setNome(this.nome);
        paciente.setCpf(this.cpf);
        paciente.setIdade(this.idade);

        return paciente;
    }

}
