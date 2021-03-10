package br.com.zup.App.exceptions;

public class PacienteJaCadastradoException extends ExcecaoBasica{

    public PacienteJaCadastradoException() {
        super("Paciente já cadastrado", 422, null, "Unprocesable Entity",
                "Objeto já cadastrado");
    }
}
