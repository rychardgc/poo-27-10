
import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class ProdutoRepository {

    private ConnectionSource conexao;
    private Dao<Produto, Integer> dao;

    public ProdutoRepository() throws SQLException {
        String url = "jdbc:sqlite:produtos.db";

        conexao = new JdbcConnectionSource(url);

        TableUtils.createTableIfNotExists(
            conexao, Produto.class
        );

        dao = DaoManager.createDao(
            conexao, Produto.class
        );
    }

    // CREATE: cadastrar produto
    public void criar(Produto produto) throws SQLException {
        dao.create(produto);
    }

    // READ: buscar produto pelo ID
    public Produto buscarPorId(int id) throws SQLException {
        return dao.queryForId(id);
    }

    // READ: listar todos os produtos
    public List<Produto> listar() throws SQLException {
        return dao.queryForAll();
    }

    // UPDATE: atualizar produto existente
    public void atualizar(Produto produto) throws SQLException {
        dao.update(produto);
    }

    // DELETE: excluir produto
    public void excluir(int id) throws SQLException {
        dao.deleteById(id);
    }

    // Fechar a conexão com o banco
    public void fechar() throws Exception {
        conexao.close();
    }
}
