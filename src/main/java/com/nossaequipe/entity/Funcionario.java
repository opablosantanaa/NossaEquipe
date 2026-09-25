package com.nossaequipe.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Universal{

    DateTimeFormatter formatardata = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private double salario;
    private Categoria categoria;
    private int ano, mes, data;
    private LocalDate dataDeNascimento;
    private String dataString;

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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(LocalDate dataDeNascimento){
        this.dataString = this.dataDeNascimento.format(formatardata);
    }

    public final int idade(final LocalDate dataDeNascimento){
        final LocalDate dataAtual = LocalDate.now();
        final Period period = Period.between(dataDeNascimento, dataAtual);
        return period.getYears();
    }

    public int getIdade(){
        return idade(this.dataDeNascimento);
    }

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, Categoria categoria, int data, int mes, int ano) {
        setNome(nome);
        setSalario(salario);
        setCategoria(categoria);
        setDataDeNascimento(LocalDate.of(ano, mes, data));
        setDataString(this.dataDeNascimento);
    }
}
