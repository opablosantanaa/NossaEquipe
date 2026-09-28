package com.nossaequipe.repository;

import com.nossaequipe.entity.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface InterfaceRepositoryFuncionario {
    public boolean salvarFuncionario(Funcionario funcionario);
    public boolean deletarFuncionario(long id);
    public List<Funcionario> listarFuncionarios();
    public List<Funcionario> listarFuncionariosById(long id);
    public boolean editarFuncionario(long id, Funcionario novoFuncionario);
}
