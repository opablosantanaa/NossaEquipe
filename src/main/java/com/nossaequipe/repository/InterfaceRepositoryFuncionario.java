package com.nossaequipe.repository;

import com.nossaequipe.entity.Funcionario;

import java.util.ArrayList;
import java.util.UUID;

public interface InterfaceRepositoryFuncionario {
    public boolean salvarFuncionario(Funcionario funcionario);
    public boolean deletarFuncionario(UUID id);
    public ArrayList<Funcionario> listarFuncionarios();
    public boolean editarFuncionario(UUID id);
}
