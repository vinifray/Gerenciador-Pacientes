package br.com.zup.App.controllers;

import br.com.zup.App.models.Paciente;
import br.com.zup.App.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("pacites/")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Paciente cadastrarPaciente(@RequestBody Paciente paciente){
        Paciente objetoPaciente = pacienteService.salvarPaciente(paciente);
        return paciente;
    }

    @GetMapping("{cpf}/")
    public Paciente pesquisarPaciente(@PathVariable String cpf){
        try{
            Paciente paciente = pacienteService.pesquisarPacientePeloCPF(cpf);
            return paciente;
        }catch (RuntimeException error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage());
        }
    }
}
