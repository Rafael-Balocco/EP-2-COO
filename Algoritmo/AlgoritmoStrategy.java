package Algoritmo;

import java.util.*;

import Produto.Produto;

public interface AlgoritmoStrategy {
    void ordena(List<Produto> produtos, Comparator<Produto> comparator);
}

