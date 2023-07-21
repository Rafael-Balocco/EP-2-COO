package Ordenacao;
import java.util.*;

import Produto.Produto;
public class OrdenacaoPorPrecoCrescente implements CriterioOrdenacaoStrategy {
    
    @Override
    public Comparator<Produto> getComparator() {
        return Comparator.comparing(Produto::getPreco);
    }
}