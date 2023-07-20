import java.util.*;

public class FiltragemPorCategoria implements FiltragemStrategy {
    @Override
    public List<Produto> filtra(List<Produto> produtos, String argFiltro) {
        String categoriaFiltro = argFiltro.toLowerCase();
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoriaFiltro)) {
                produtosFiltrados.add(produto);
            }
        }

        return produtosFiltrados;
    }
}