package Filtro;
import java.util.*;

import Produto.Produto;

public interface FiltragemStrategy {
    List<Produto> filtra(List<Produto> produtos, String argFiltro);
}
