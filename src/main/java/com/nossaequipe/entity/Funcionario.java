package com.nossaequipe.entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Universal{
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FORMATAR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private float salario;
    private Categoria categoria;
    private int ano, mes, data;
    private LocalDate dataDeNascimento;
    private String dataString;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        dataDeNascimento = LocalDate.of(ano, mes, data);
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataString() {
        return dataString;
    }

    public void setDataString(LocalDate dataDeNascimento){
        this.dataString = this.dataDeNascimento.format(FORMATAR_DATA);
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

    public Funcionario(long id, String nome, float salario, Categoria categoria, int data, int mes, int ano) {
        setId(id);
        setNome(nome);
        setSalario(salario);
        setCategoria(categoria);
        setDataDeNascimento(LocalDate.of(ano, mes, data));
        setDataString(this.dataDeNascimento);
    }
}
