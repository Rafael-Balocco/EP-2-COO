import java.util.*;

public class OrdenacaoPorQuantidadeEstoqueCrescente implements CriterioOrdenacaoStrategy {
    @Override
    public Comparator<Produto> getComparator() {
        return Comparator.comparing(Produto::getQtdEstoque);
    }
}
