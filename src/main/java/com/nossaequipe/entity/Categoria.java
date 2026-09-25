package com.nossaequipe.entity;

public class Categoria {
    private String cargo;
    private String funcao;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Categoria(){

    }

    public Categoria(String cargo, String funcao) {
        this.cargo = cargo;
        this.funcao = funcao;
    }
}
