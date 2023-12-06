
import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class Vertice<T> {
    private final T data;

    private boolean visitado;
    
    @ToString.Exclude
    private List<Vertice<T>> vecinos = new LinkedList<>();
    
}
