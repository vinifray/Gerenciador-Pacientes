package br.com.zup.App.services;

import br.com.zup.App.exceptions.PacienteNaoEncontradoException;
import br.com.zup.App.models.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {
    private static List<Paciente> pacientes = new ArrayList<>();

    public Paciente salvarPaciente(Paciente paciente){
        pacientes.add(paciente);
        paciente.setHistorico(new ArrayList<>());
        
        return paciente;
    }

    public Paciente pesquisarPacientePeloCPF(String cpf){
        for(Paciente paciente : pacientes){
            if (paciente.getCpf().equals(cpf)){
                return paciente;
            }
        }
        throw new PacienteNaoEncontradoException("Paciente não encontrado pelo CPF indicado");
    }
}
