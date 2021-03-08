package br.com.zup.App.services;

import br.com.zup.App.models.Historico;
import br.com.zup.App.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService {

    @Autowired
    private PacienteService pacienteService;

    public Historico registrarHisorico(String cpf, Historico historico){
        Paciente paciente = pacienteService.pesquisarPacientePeloCPF(cpf);
        paciente.getHistorico().add(historico);

        return historico;
    }
}
