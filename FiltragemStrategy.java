import java.util.*;

public interface FiltragemStrategy {
    List<Produto> filtra(List<Produto> produtos, String argFiltro);
}
