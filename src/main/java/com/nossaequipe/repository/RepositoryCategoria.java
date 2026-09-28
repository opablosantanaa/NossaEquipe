package com.nossaequipe.repository;

import com.nossaequipe.entity.Categoria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RepositoryCategoria implements InterfaceRepositoryCategoria{

    List<Categoria> listaDeCategorias = new ArrayList<Categoria>();

    @Override
    public boolean salvarCategoria(Categoria categoria) {
        boolean jaExiste = listaDeCategorias.stream()
                .anyMatch(categoriaCheck -> categoriaCheck.getId() == categoria.getId());

        if (jaExiste) {
            System.out.println("Registro já cadastrado.");
        }else {
            try{
                listaDeCategorias.add(categoria);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean deletarCategoria(long id) {
        Iterator<Categoria> iterator = listaDeCategorias.iterator();
        while(iterator.hasNext()) {
            Categoria categoria = iterator.next();

            if (categoria.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Categoria> listarCategoria() {
        return listaDeCategorias;
    }

    @Override
    public boolean editarCategoria(long id, Categoria novaCategoria) {
        if (novaCategoria == null){
            return false;
        }

        ListIterator<Categoria> iterator = listaDeCategorias.listIterator();
        while(iterator.hasNext()){
            Categoria categoria = iterator.next();

            if (categoria.getId() == id){
                novaCategoria.setId(id);
                iterator.set(novaCategoria);
                return true;
            }
        }
        return false;
    }

    public void substituir(List<Categoria> categorias){
        listaDeCategorias.clear();
        if (categorias != null){
            listaDeCategorias.addAll(categorias);
        }
    }
}
