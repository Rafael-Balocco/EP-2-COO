package Algoritmo;

import java.util.*;

import Produto.Produto;

public class QuickSortStrategy implements AlgoritmoStrategy {
    @Override
    public void ordena(List<Produto> produtos, Comparator<Produto> comparator) {
        ordenaRecursivo(produtos, 0, produtos.size() - 1, comparator);
    }

    private void ordenaRecursivo(List<Produto> produtos, int ini, int fim, Comparator<Produto> comparator) {
        if (ini < fim) {
            int q = particiona(produtos, ini, fim, comparator);
            ordenaRecursivo(produtos, ini, q, comparator);
            ordenaRecursivo(produtos, q + 1, fim, comparator);
        }
    }

    private int particiona(List<Produto> produtos, int ini, int fim, Comparator<Produto> comparator) {
        Produto x = produtos.get(ini);
        int i = ini - 1;
        int j = fim + 1;

        while (true) {
            do {
                j--;
            } while (comparator.compare(produtos.get(j), x) > 0);

            do {
                i++;
            } while (comparator.compare(produtos.get(i), x) < 0);

            if (i < j) {
                Collections.swap(produtos, i, j);
            } else {
                return j;
            }
        }
    }
}
