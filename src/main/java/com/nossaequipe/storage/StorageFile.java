package com.nossaequipe.storage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class StorageFile {
    private final Path destination;

    public void salvar(AppData dados){
        try{
            if (destination.getParent() != null){
                Files.createDirectories(destination.getParent());
            }
            try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(destination))){
                out.writeObject(dados);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar dados", e);
        }
    }

    public Optional<AppData> carregar(){
        if (!Files.exists(destination)){
            return Optional.empty();
        } try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(destination))){
            AppData dados = (AppData) in.readObject();
            return Optional.of(dados);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Erro ao carregar dados", e);
        }
    }

    public StorageFile(String fileName) {
        this.destination = Paths.get(fileName);
    }
}
