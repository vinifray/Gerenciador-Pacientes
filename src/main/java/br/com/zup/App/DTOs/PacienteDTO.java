package br.com.zup.App.DTOs;

import br.com.zup.App.models.Paciente;

public class PacienteDTO {
    private String nome;
    private int idade;
    private String cpf;

    public PacienteDTO() {
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

    public static Paciente converterDTOParaPaciente(PacienteDTO pacienteDTO){
        Paciente paciente = new Paciente();
        paciente.setNome(pacienteDTO.getNome());
        paciente.setCpf(pacienteDTO.getCpf());
        paciente.setIdade(pacienteDTO.getIdade());

        return paciente;
    }

}
