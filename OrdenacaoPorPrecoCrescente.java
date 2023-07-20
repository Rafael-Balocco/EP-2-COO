import java.util.*;
public class OrdenacaoPorPrecoCrescente implements CriterioOrdenacaoStrategy {
    
    @Override
    public Comparator<Produto> getComparator() {
        return Comparator.comparing(Produto::getPreco);
    }
}