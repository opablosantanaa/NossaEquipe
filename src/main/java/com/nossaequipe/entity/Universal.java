package com.nossaequipe.entity;
import java.time.LocalDateTime;
import java.util.UUID;

public class Universal {
    private String nome;
    private UUID uuid;
    private LocalDateTime dataTime;
    public enum status{
        ativo("Ativo"),
        inativo("Inativo");

        String descricao;

        status (String descricao){
            this.descricao = descricao;
        }

        public String getDescricao(){
            return descricao;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }

    public Universal(){
    }
}
