package Ordenacao;
import java.util.*;

import Produto.Produto;

public class OrdenacaoPorQuantidadeEstoqueCrescente implements CriterioOrdenacaoStrategy {
    @Override
    public Comparator<Produto> getComparator() {
        return Comparator.comparing(Produto::getQtdEstoque);
    }
}
