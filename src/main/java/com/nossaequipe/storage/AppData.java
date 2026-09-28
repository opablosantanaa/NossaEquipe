package com.nossaequipe.storage;

import com.nossaequipe.entity.Categoria;
import com.nossaequipe.entity.Funcionario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppData implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Categoria> categorias;
    private List<Funcionario> funcionarios;

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public AppData() {
    }

    public AppData(List<Categoria> categorias, List<Funcionario> funcionarios) {
        setCategorias(categorias == null
            ? new ArrayList<>()
                : new ArrayList<>(categorias));
        setFuncionarios(funcionarios == null
            ? new ArrayList<>()
                : new ArrayList<>(funcionarios));
    }
}
