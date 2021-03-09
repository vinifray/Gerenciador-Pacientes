package br.com.zup.App.DTOs;

import br.com.zup.App.models.Paciente;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;

public class CadastroPacienteDTO {
    
    @NotNull(message = "Nome é um campo obrigatorio")
    @NotEmpty(message = "nome não pode estar em branco")
    @Size(min = 3, message = "Nome muito pequeno, impossivel ser um nome")
    private String nome;

    @Email(message = "Email invalido")
    private String email;

    @Min(value = 18, message = "Apenas maiores de 18 podem se cadastrar")
    private int idade;

    @CPF(message = "CPF Invalido")
    private String cpf;

    public CadastroPacienteDTO() {
    }

    public CadastroPacienteDTO(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Paciente converterDTOParaPaciente(){
        Paciente paciente = new Paciente();
        paciente.setNome(this.nome);
        paciente.setCpf(this.cpf);
        paciente.setIdade(this.idade);
        paciente.setEmail(this.email);

        return paciente;
    }

    public static CadastroPacienteDTO converterPancienteParaDTO(Paciente paciente){
        return new CadastroPacienteDTO(paciente.getNome(), paciente.getIdade(),
                paciente.getCpf(), paciente.getEmail());
    }
}
