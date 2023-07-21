package Ordenacao;
import java.util.*;

import Produto.Produto;

public interface CriterioOrdenacaoStrategy {
    Comparator<Produto> getComparator();
}

