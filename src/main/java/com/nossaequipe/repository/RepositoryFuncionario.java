package com.nossaequipe.repository;

import com.nossaequipe.entity.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RepositoryFuncionario implements InterfaceRepositoryFuncionario{

    ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();

    @Override
    public boolean salvarFuncionario(Funcionario funcionario) {
        try{
            listaDeFuncionarios.add(funcionario);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deletarFuncionario(UUID id) {
        return false;
    }

    @Override
    public ArrayList<Funcionario> listarFuncionarios() {
        return null;
    }

    @Override
    public boolean editarFuncionario(UUID id) {
        return false;
    }
}
