package com.nossaequipe.entity;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Funcionario extends Universal{

    private double salario;
    private Categoria categoria;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, Categoria categoria) {
        setNome(nome);
        setSalario(salario);
        setCategoria(categoria);
    }
}
