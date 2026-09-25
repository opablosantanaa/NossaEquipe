import com.nossaequipe.entity.Categoria;
import com.nossaequipe.entity.Funcionario;
import com.nossaequipe.repository.RepositoryFuncionario;

public class App {
    public static void main(String[] args){
        Categoria c = new Categoria("Gerente", "Financeiro");
        Funcionario f = new Funcionario("Julio", 2000, c);
        RepositoryFuncionario rf = new RepositoryFuncionario();
        rf.salvarFuncionario(f);

        System.out.println(rf.listarFuncionarios());
    }
}
