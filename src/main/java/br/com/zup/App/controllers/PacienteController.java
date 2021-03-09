package br.com.zup.App.controllers;

import br.com.zup.App.DTOs.CadastroPacienteDTO;
import br.com.zup.App.models.Paciente;
import br.com.zup.App.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("pacientes/")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Paciente cadastrarPaciente(@RequestBody @Valid CadastroPacienteDTO cadastroPacienteDTO){
        Paciente objetoPaciente = pacienteService.salvarPaciente(cadastroPacienteDTO.converterDTOParaPaciente());
        return objetoPaciente;
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
