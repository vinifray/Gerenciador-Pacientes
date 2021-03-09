package br.com.zup.App.exceptions;

public class PacienteNaoEncontradoException extends RuntimeException {
    private int Status = 400;
    private String campo = "CPF";
    private String razao = "Bad request";
    private String tipoErro = "Objeto Não Encontrado";

    public PacienteNaoEncontradoException(String message) {
        super(message);
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getTipoErro() {
        return tipoErro;
    }

    public void setTipoErro(String tipoErro) {
        this.tipoErro = tipoErro;
    }
}
