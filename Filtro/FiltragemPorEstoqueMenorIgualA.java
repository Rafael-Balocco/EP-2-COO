package Filtro;
import java.util.*;

import Produto.Produto;

public class FiltragemPorEstoqueMenorIgualA implements FiltragemStrategy {
    @Override
    public List<Produto> filtra(List<Produto> produtos, String argFiltro) {
        int limiteEstoque = Integer.parseInt(argFiltro);
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getQtdEstoque() <= limiteEstoque) {
                produtosFiltrados.add(produto);
            }
        }

        return produtosFiltrados;
    }
}