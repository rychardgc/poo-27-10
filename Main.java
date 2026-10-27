
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProdutoRepository repo = null;

        try {
            repo = new ProdutoRepository();

            // CREATE
            Produto p = new Produto("Teclado", 120.00);
            repo.criar(p);
            System.out.println("CREATE: " + p);

            // READ por ID
            Produto encontrado = repo.buscarPorId(p.getId());
            System.out.println("READ por ID: " + encontrado);

            // UPDATE
            encontrado.setPreco(99.90);
            repo.atualizar(encontrado);
            System.out.println(
                "UPDATE: " + repo.buscarPorId(p.getId())
            );

            // READ: listar todos
            List<Produto> produtos = repo.listar();
            System.out.println("LISTAGEM:");
            for (Produto item : produtos) {
                System.out.println(item);
            }

            // DELETE
            repo.excluir(p.getId());
            System.out.println(
                "DELETE: " + repo.buscarPorId(p.getId())
            );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (repo != null) {
                try {
                    repo.fechar();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
