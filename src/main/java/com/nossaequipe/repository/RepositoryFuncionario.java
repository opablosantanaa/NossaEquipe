package com.nossaequipe.repository;

import com.nossaequipe.entity.Categoria;
import com.nossaequipe.entity.Funcionario;

import java.util.*;

public class RepositoryFuncionario implements InterfaceRepositoryFuncionario{

    List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();

    @Override
    public boolean salvarFuncionario(Funcionario funcionario) {
        try{
            if(funcionario.getIdade() >= 16) {
                listaDeFuncionarios.add(funcionario);
            } else{
                System.out.println("\nFuncionário não registrado. Abaixo da idade mínima!");
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deletarFuncionario(long id) {
        Iterator<Funcionario> iterator = listaDeFuncionarios.iterator();
        while(iterator.hasNext()) {
            Funcionario funcionario = iterator.next();

            if (funcionario.getId() == id) {
                iterator.remove();
                return true;
            }
        }
       return false;
    }

    @Override
    public List<Funcionario> listarFuncionarios() {
            return listaDeFuncionarios;
    }

    @Override
    public List<Funcionario> listarFuncionariosById(long id) {
        for (Funcionario funcionario : listaDeFuncionarios){
            if(funcionario.getId() == id){
                return Collections.singletonList(funcionario);
            }
        }
            return Collections.emptyList();
    }

    @Override
    public boolean editarFuncionario(long id, Funcionario novoFuncionario) {
        if (novoFuncionario == null){
            return false;
        }

        ListIterator<Funcionario> iterator = listaDeFuncionarios.listIterator();
        while(iterator.hasNext()){
            Funcionario funcionario = iterator.next();

            if (funcionario.getId() == id){
                novoFuncionario.setId(id);
                iterator.set(novoFuncionario);
                return true;
            }
        }
        return false;
    }

    public void substituir(List<Funcionario> funcionarios){
        listaDeFuncionarios.clear();
        if (funcionarios != null){
            listaDeFuncionarios.addAll(funcionarios);
        }
    }
}
