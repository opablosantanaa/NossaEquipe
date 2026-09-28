import com.nossaequipe.entity.Categoria;
import com.nossaequipe.entity.Funcionario;
import com.nossaequipe.menu.MenuConsole;
import com.nossaequipe.repository.RepositoryCategoria;
import com.nossaequipe.repository.RepositoryFuncionario;
import com.nossaequipe.storage.AppData;
import com.nossaequipe.storage.StorageFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        RepositoryFuncionario repositoryFuncionario = new RepositoryFuncionario();
        RepositoryCategoria repositoryCategoria = new RepositoryCategoria();
        StorageFile storage = new StorageFile("dados.app");

        carregarDados(repositoryCategoria, repositoryFuncionario, storage);
        Scanner scanner = new Scanner(System.in);
        MenuConsole menuConsole = new MenuConsole(repositoryCategoria, repositoryFuncionario, storage, scanner);

        menuConsole.iniciar();
        scanner.close();
    }
    private static void carregarDados(RepositoryCategoria repositoryCategoria,
                                      RepositoryFuncionario repositoryFuncionario,
                                      StorageFile storageFile){
            try{
                Optional<AppData> dados = storageFile.carregar();

                if (dados.isPresent()){
                    repositoryCategoria.substituir(dados.get().getCategorias());
                    repositoryFuncionario.substituir(dados.get().getFuncionarios());
                    System.out.println("Dados carregados com sucesso!");
                } else{
                    System.out.println("Nenhum dado encontrado!");
                }
            } catch (RuntimeException e){
                System.out.println("Erro ao carregar dados: " + e.getMessage());
            }
    }
}
