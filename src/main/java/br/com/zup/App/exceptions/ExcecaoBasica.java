package br.com.zup.App.exceptions;

public class ExcecaoBasica extends RuntimeException {
    private int Status;
    private String campo;
    private String razao;
    private String tipoErro;

    public ExcecaoBasica(String message, int status, String campo, String razao, String tipoErro) {
        super(message);
        Status = status;
        this.campo = campo;
        this.razao = razao;
        this.tipoErro = tipoErro;
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
