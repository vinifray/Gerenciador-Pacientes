package br.com.zup.App.exceptions;

import java.util.List;

public class RespostaDeErro {
    private String tipoDeErro;
    private int codigo;
    private String status;
    private List<ObjetoDeErro> objetosDeErro;

    public RespostaDeErro(String tipoDeErro, int codigo, String status, List<ObjetoDeErro> objetosDeErro) {
        this.tipoDeErro = tipoDeErro;
        this.codigo = codigo;
        this.status = status;
        this.objetosDeErro = objetosDeErro;
    }

    public RespostaDeErro() {
    }

    public String getTipoDeErro() {
        return tipoDeErro;
    }

    public void setTipoDeErro(String tipoDeErro) {
        this.tipoDeErro = tipoDeErro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ObjetoDeErro> getObjetosDeErro() {
        return objetosDeErro;
    }

    public void setObjetosDeErro(List<ObjetoDeErro> objetosDeErro) {
        this.objetosDeErro = objetosDeErro;
    }
}
