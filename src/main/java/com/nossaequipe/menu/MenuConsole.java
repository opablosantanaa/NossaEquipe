package com.nossaequipe.menu;

import com.nossaequipe.entity.Categoria;
import com.nossaequipe.entity.Funcionario;
import com.nossaequipe.repository.RepositoryCategoria;
import com.nossaequipe.repository.RepositoryFuncionario;
import com.nossaequipe.storage.StorageFile;
import com.nossaequipe.storage.AppData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConsole {
    private final RepositoryCategoria repositoryCategoria;
    private final RepositoryFuncionario repositoryFuncionario;
    private final StorageFile storageFile;
    private final Scanner scanner;

    private List<Categoria> listaDeCategorias = new ArrayList<>();
    private List<Funcionario> listaDeFuncionarios = new ArrayList<>();

    public void iniciar(){
        boolean decisao = true;
        String decisaoString = "s";
        while (decisao) {
            System.out.println();
            System.out.println("======= MENU =======");
            System.out.println("O que você deseja manipular?");
            System.out.println("1 - Categorias");
            System.out.println("2 - Funcionários");
            System.out.println("3 - Salvar dados e sair");
            System.out.println("0 - Sair sem salvar dados\n");

            int escolha01 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha01) {
                case 1:
                    System.out.println();
                    System.out.println("1 - Criar categoria");
                    System.out.println("2 - Listar categorias");
                    System.out.println("3 - Editar categoria");
                    System.out.println("4 - Remover categoria");
                    System.out.println("0 - Voltar atrás\n");

                    int escolhaMenuCategoria = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaMenuCategoria) {
                        case 1:
                            criarCategoria();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 2:
                            listarCategorias();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 3:
                            editarCategoria();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 4:
                            removerCategoria();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        default:
                            decisao = true;
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("1 - Criar funcionário");
                    System.out.println("2 - Listar funcionários");
                    System.out.println("3 - Buscar funcionário por ID");
                    System.out.println("4 - Editar funcionários");
                    System.out.println("5 - Remover funcionários");
                    System.out.println("0 - Voltar atrás\n");

                    int escolhaMenuFuncionario = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaMenuFuncionario) {
                        case 1:
                            criarFuncionario();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 2:
                            listarFuncionarios();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 3:
                            buscarFuncionarioById();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 4:
                            editarFuncionario();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        case 5:
                            removerFuncionario();
                            System.out.print("\nDeseja manipular outro dado (S/N)? ");
                            decisaoString = scanner.nextLine();
                            if (decisaoString.equalsIgnoreCase("s")){
                                decisao = true;
                            } else{
                                System.out.print("Deseja salvar os dados (S/N)? ");
                                String decisaoDados = scanner.nextLine();
                                if (decisaoDados.equalsIgnoreCase("s")){
                                    salvarDados();
                                    decisao = false;
                                } else {
                                    decisao = false;
                                }
                            }
                            break;
                        default:
                            decisao = true;
                            break;
                    }
                    break;
                case 3:
                    salvarDados();
                    decisao = false;
                    break;
                default:
                    System.out.println("Programa encerrando...");
                    decisao = false;
                    break;
            }
        }
    }

    public MenuConsole(RepositoryCategoria repositoryCategoria,
                       RepositoryFuncionario repositoryFuncionario,
                       StorageFile storageFile,
                       Scanner scanner) {
        this.repositoryCategoria = repositoryCategoria;
        this.repositoryFuncionario = repositoryFuncionario;
        this.storageFile = storageFile;
        this.scanner = scanner;
    }

    private void salvarDados(){
        try {
            sincronizarCategorias();

            AppData dados = new AppData(repositoryCategoria.listarCategoria(),
                    repositoryFuncionario.listarFuncionarios());
            storageFile.salvar(dados);
        } catch (RuntimeException e){
            System.out.println("Erro ao salvar dados" + e.getMessage());
        }
    }

    private void sincronizarCategorias(){
        List<Funcionario> funcionarios = repositoryFuncionario.listarFuncionarios();
        List<Categoria> categorias = repositoryCategoria.listarCategoria();

        for (Funcionario funcionario : funcionarios){
            if(funcionario.getCategoria() == null){
                continue;
            }

            long categoriaId = funcionario.getCategoria().getId();

            Categoria categoriaAtual = categorias.stream()
                    .filter(categoria -> categoria.getId() == categoriaId)
                    .findFirst()
                    .orElse(null);

            funcionario.setCategoria(categoriaAtual);
        }

    }

    private void criarCategoria(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {

            System.out.println("===== CRIADOR DE CATEGORIAS =====");
            Categoria categoria = new Categoria();

            System.out.print("\nID: ");
            categoria.setId(scanner.nextInt());

            scanner.nextLine();

            System.out.print("Cargo: ");
            categoria.setCargo(scanner.nextLine());

            System.out.print("Função: ");
            categoria.setFuncao(scanner.nextLine());

            repositoryCategoria.salvarCategoria(categoria);

            System.out.println("Categoria criada com sucesso!");
            System.out.println();
            System.out.println("Deseja criar mais uma categoria? (S/N)");
            escolha = scanner.nextLine();
        }
    }

    private void listarCategorias(){
        listaDeCategorias = repositoryCategoria.listarCategoria();

        System.out.println("===== LISTA DE CATEGORIAS =====");

        for (Categoria categoria : listaDeCategorias) {
            System.out.println("\n==== CATEGORIA " + (listaDeCategorias.indexOf(categoria) + 1) + " ====");
            System.out.println("ID: " + categoria.getId());
            System.out.println("Cargo: " + categoria.getCargo());
            System.out.println("Função: " + categoria.getFuncao());
            System.out.println("========================");
        }
    }

    private void editarCategoria(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {
            System.out.println("\n===== EDITOR DE CATEGORIAS =====");
            Categoria categoria = new Categoria();

            System.out.print("\nInsira o ID da categoria que deseja editar: ");
            long idNew = scanner.nextInt();
            categoria.setId(idNew);

            scanner.nextLine();

            System.out.print("Cargo: ");
            categoria.setCargo(scanner.nextLine());

            System.out.print("Função: ");
            categoria.setFuncao(scanner.nextLine());

            boolean atualizou = repositoryCategoria.editarCategoria(idNew, categoria);

            if (atualizou) {
                System.out.println("Categoria atualizada com sucesso!");
            } else{
                System.out.println("ID não encontrado");
            }
            System.out.println();
            System.out.println("Deseja atualizar outra categoria? (S/N)");
            escolha = scanner.nextLine();
        }
    }

    private void removerCategoria(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {
            System.out.println("===== REMOVEDOR DE CATEGORIAS =====");

            System.out.print("\nInsira o ID da categoria que deseja remover: ");
            long idRemove = scanner.nextInt();
            scanner.nextLine();

            boolean removeu = repositoryCategoria.deletarCategoria(idRemove);

            if (removeu){
                System.out.println("Categoria removida com sucesso!");
            } else{
                System.out.println("ID inválido!");
            }
            System.out.println();
            System.out.println("Deseja remover mais uma categoria? (S/N)");
            escolha = scanner.nextLine();
        }
    }

    private void criarFuncionario(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {
            System.out.println("===== CRIADOR DE FUNCIONÁRIOS =====");
            Funcionario funcionario = new Funcionario();

            System.out.print("\nID: ");
            funcionario.setId(scanner.nextInt());

            scanner.nextLine();

            System.out.print("Nome: ");
            funcionario.setNome(scanner.nextLine());

            System.out.print("Salário: ");
            funcionario.setSalario(scanner.nextFloat());

            scanner.nextLine();

            if(listaDeCategorias.isEmpty()){
                System.out.println("Nenhuma categoria registrada. Cadastre uma categoria primeiro");
            } else{
                System.out.println("Categorias disponiveis:");
                listarCategorias();
                System.out.println();
                System.out.print("Escolha uma categoria (" + 1 + "/" + listaDeCategorias.size() + "): ");
                int escolhaCategoria = scanner.nextInt();
                scanner.nextLine();
                int indiceCategoria = escolhaCategoria -1;
                if(indiceCategoria < 0 || indiceCategoria >= listaDeCategorias.size()){
                    System.out.println("Categoria inválida!");
                    continue;
                } else{
                    Categoria categoriaEscolhida = listaDeCategorias.get(indiceCategoria);
                    funcionario.setCategoria(categoriaEscolhida);
                }
            }

            System.out.print("Insira sua data de aniversário: ");
            funcionario.setData(scanner.nextInt());

            System.out.print("Insira seu mês de aniversário (SEM 0 ANTES DO NÚMERO. EX: 4 AO INVÉS DE 04): ");
            funcionario.setMes(scanner.nextInt());

            System.out.print("Insira seu ano de nascimento: ");
            funcionario.setAno(scanner.nextInt());

            LocalDate dataDeNascimento = LocalDate.of(funcionario.getAno(),
                    funcionario.getMes(), funcionario.getData());

            funcionario.setDataDeNascimento(dataDeNascimento);
            funcionario.setDataString(dataDeNascimento);

            scanner.nextLine();

            repositoryFuncionario.salvarFuncionario(funcionario);

            System.out.println("Funcionário criado com sucesso!");
            System.out.println();
            System.out.println("Deseja criar mais um funcionário? (S/N)");
            escolha = scanner.nextLine();
        }
    }

    private void listarFuncionarios(){
        listaDeFuncionarios = repositoryFuncionario.listarFuncionarios();

        System.out.println("===== LISTA DE FUNCIONÁRIOS =====");

        for(Funcionario funcionario : listaDeFuncionarios){
            System.out.println("ID: " + funcionario.getId());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo | Função: " + funcionario.getCategoria().getCargo() + " | "
                    + funcionario.getCategoria().getFuncao());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println();
        }
    }

    private void buscarFuncionarioById(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {

            System.out.println("===== BUSCA POR ID =====");

            System.out.print("\nInsira o ID do funcionário que deseja buscar: ");
            long idSearch = scanner.nextInt();
            scanner.nextLine();

            if (listaDeFuncionarios.stream().anyMatch(funcionarioExist -> funcionarioExist.getId() == idSearch)){
                System.out.println("Funcionário encontrado com sucesso!");
                List<Funcionario> encontrarFuncionario = repositoryFuncionario.listarFuncionariosById(idSearch);
                for(Funcionario funcionario : encontrarFuncionario){
                    System.out.println("ID: " + funcionario.getId());
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Cargo | Função: " + funcionario.getCategoria().getCargo() + " | "
                            + funcionario.getCategoria().getFuncao());
                    System.out.println("Salário: " + funcionario.getSalario());
                    System.out.println("Idade: " + funcionario.getIdade());
                    System.out.println();
                }
            } else{
                System.out.println("ID não encontrado!");
            }
            System.out.println();
            System.out.println("Deseja buscar outro funcionário? (S/N)");
            escolha = scanner.nextLine();
        }
    }

    private void editarFuncionario(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {

            System.out.println("\n===== EDITOR DE FUNCIONÁRIOS =====");
            listaDeFuncionarios = repositoryFuncionario.listarFuncionarios();

            System.out.print("\nInsira o ID do funcionário que deseja editar: ");
            long idNew = scanner.nextInt();
            scanner.nextLine();

            Funcionario funcionarioExistente = null;

            for (Funcionario funcionario : listaDeFuncionarios){
                if(funcionario.getId() == idNew){
                    funcionarioExistente = funcionario;
                    break;
                }
            }

            if(funcionarioExistente == null){
                System.out.println("ID não encontrado");
            } else {
                System.out.println("\nO que deseja atualizar?");
                System.out.println("1 - NOME");
                System.out.println("2 - SALÁRIO");
                System.out.println("3 - CATEGORIA");
                System.out.println("4 - DATA DE NASCIMENTO");
                System.out.println("0 - NÃO FAZER ALTERAÇÃO");

                int escolhaNumber = scanner.nextInt();
                scanner.nextLine();

                switch (escolhaNumber){
                    case 1:
                        System.out.print("Nome: ");
                        funcionarioExistente.setNome(scanner.nextLine());
                        break;

                    case 2:
                        System.out.print("Salário: ");
                        funcionarioExistente.setSalario(scanner.nextFloat());
                        scanner.nextLine();
                        break;

                    case 3:
                        System.out.println("Categorias disponiveis:");
                        listarCategorias();
                        System.out.println();
                        System.out.print("Escolha uma categoria (" + 1 + "/" + listaDeCategorias.size() + "): ");
                        int escolhaCategoria = scanner.nextInt();
                        scanner.nextLine();
                        int indiceCategoria = escolhaCategoria - 1;
                        if (indiceCategoria < 0 || indiceCategoria >= listaDeCategorias.size()) {
                            System.out.println("Categoria inválida!");
                            continue;
                        } else {
                            Categoria categoriaEscolhida = listaDeCategorias.get(indiceCategoria);
                            funcionarioExistente.setCategoria(categoriaEscolhida);
                        }
                        break;

                    case 4:
                        System.out.print("Insira sua data de aniversário: ");
                        funcionarioExistente.setData(scanner.nextInt());

                        System.out.print("Insira seu mês de aniversário (SEM 0 ANTES DO NÚMERO. EX: 4 AO INVÉS DE 04): ");
                        funcionarioExistente.setMes(scanner.nextInt());

                        System.out.print("Insira seu ano de nascimento: ");
                        funcionarioExistente.setAno(scanner.nextInt());
                        scanner.nextLine();

                        LocalDate dataDeNascimento = LocalDate.of(funcionarioExistente.getAno(),
                                funcionarioExistente.getMes(), funcionarioExistente.getData());

                        funcionarioExistente.setDataDeNascimento(dataDeNascimento);
                        funcionarioExistente.setDataString(dataDeNascimento);
                        break;

                    default:
                        System.out.println("Sem alterações");
                }

                repositoryFuncionario.editarFuncionario(idNew, funcionarioExistente);
                System.out.println("Funcionário atualizada com sucesso!");
            }
            System.out.println();
            System.out.println("Deseja atualizar outro funcionário? (S/N)");
            escolha = scanner.nextLine();
        }
    }

    private void removerFuncionario(){
        String escolha = "S";
        while(escolha.equalsIgnoreCase("s")) {
            listaDeFuncionarios = repositoryFuncionario.listarFuncionarios();

            System.out.println("===== REMOVEDOR DE FUNCIONÁRIOS =====");

            System.out.print("\nInsira o ID do funcionário que deseja remover: ");
            long idRemove = scanner.nextInt();
            scanner.nextLine();

            if (listaDeFuncionarios.stream().anyMatch(funcionarioExist -> funcionarioExist.getId() == idRemove)){
                System.out.println("Funcionário removida com sucesso!");
                repositoryFuncionario.deletarFuncionario(idRemove);
            } else{
                System.out.println("ID não encontrado!");
            }
            System.out.println();
            System.out.println("Deseja remover outro funcionário? (S/N)");
            escolha = scanner.nextLine();
        }
    }
}