package com.nossaequipe.repository;

import com.nossaequipe.entity.Categoria;

import java.util.List;

public interface InterfaceRepositoryCategoria {
    public boolean salvarCategoria(Categoria categoria);
    public boolean deletarCategoria(long id);
    public List<Categoria> listarCategoria();
    public boolean editarCategoria(long id, Categoria novaCategoria);
}
