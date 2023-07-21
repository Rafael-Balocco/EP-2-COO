package Ordenacao;

import java.util.Comparator;

import Produto.Produto;

public class OrdenacaoPorDescricaoCrescente implements CriterioOrdenacaoStrategy {
 
    @Override
    public Comparator<Produto> getComparator() {
        return Comparator.comparing(Produto::getDescricao);
    }
}