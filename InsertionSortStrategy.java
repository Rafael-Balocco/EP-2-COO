import java.util.*;

public class InsertionSortStrategy implements OrdenacaoStrategy {
    
    @Override
    public void ordena(List<Produto> produtos, Comparator<Produto> comparator) {
        for (int i = 1; i < produtos.size(); i++) {
            Produto x = produtos.get(i);
            int j = i - 1;

            while (j >= 0 && comparator.compare(x, produtos.get(j)) < 0) {
                produtos.set(j + 1, produtos.get(j));
                j--;
            }

            produtos.set(j + 1, x);
        }
    }
}