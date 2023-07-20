import java.util.*;

public interface OrdenacaoStrategy {
    void ordena(List<Produto> produtos, Comparator<Produto> comparator);
}

