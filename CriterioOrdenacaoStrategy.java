import java.util.*;

public interface CriterioOrdenacaoStrategy {
    Comparator<Produto> getComparator();
}

