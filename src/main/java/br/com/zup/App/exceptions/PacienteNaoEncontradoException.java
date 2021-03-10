package br.com.zup.App.exceptions;

public class PacienteNaoEncontradoException extends ExcecaoBasica{

    public PacienteNaoEncontradoException() {
        super("Paciente não encontrado", 400, "CPF", "Bad Request",
                "Objeto não encontrado");
    }
}
