package Filtro;
import java.util.*;

import Produto.Produto;

public class FiltragemTodos implements FiltragemStrategy {
    @Override
    public List<Produto> filtra(List<Produto> produtos, String argFiltro) {
        // Implementação para retornar todos os produtos
        return produtos;
    }
}