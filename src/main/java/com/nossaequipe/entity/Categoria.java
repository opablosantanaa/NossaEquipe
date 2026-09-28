package com.nossaequipe.entity;

public class Categoria extends Universal{
    private static final long serialVersionUID = 1L;

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

    public Categoria(long id, String cargo, String funcao) {
        setId(id);
        setCargo(cargo);
        setFuncao(funcao);
    }
}
