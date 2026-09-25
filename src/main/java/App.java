import com.nossaequipe.entity.Categoria;
import com.nossaequipe.entity.Funcionario;
import com.nossaequipe.repository.RepositoryFuncionario;

public class App {
    public static void main(String[] args){
        try {
            Categoria c = new Categoria("Gerente", "Financeiro");
            Funcionario f = new Funcionario("Julio", 2000, c, 26, 9, 2005);
            RepositoryFuncionario rf = new RepositoryFuncionario();
            rf.salvarFuncionario(f);

            System.out.println(f.getNome() + ": " + c.getCargo() + " | " + f.getDataString() + ", " + f.getIdade());
        } catch (Exception e){
            System.out.println("ERRO");
        }
    }
}
