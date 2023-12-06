import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DFS<T> {
    private Deque<Vertice<T>> checar = new LinkedList<>();
    private Queue<Vertice<T>> checar2 = new LinkedList<>();

    public void transversar(Vertice<T> inicioVertice){
        Deque<Vertice<T>> stack = new LinkedList<>();
        stack.push(inicioVertice);
        while(!stack.isEmpty()){
            Vertice<T> actual = stack.pop();
            if(!actual.isVisitado()){
                actual.setVisitado(true);
                System.out.println(actual);
                checar.push(actual);
                stack.addAll(actual.getVecinos());
                actual.getVecinos().forEach(stack::push);
            }
        }
    }

    public void transversarRecursivo(Vertice<T> vertice) {
        vertice.setVisitado(true);
        System.out.println(vertice);
        checar2.offer(vertice); // Use offer() instead of push() for Queue
        vertice.getVecinos().stream()
                .filter(vecinos -> !vecinos.isVisitado())
                .forEach(this::transversarRecursivo);
    }

    public void transversarRecursivo(Vertice<T> vertice, Vertice<T> verticeGoal) {
        vertice.setVisitado(true);
        System.out.println(vertice +"-- compara con "+verticeGoal);
        checar2.offer(vertice); // Use offer() instead of push() for Queue
        if (vertice.equals(verticeGoal)) {
            return;
            
        }
        vertice.getVecinos().stream()
                .filter(vecinos -> !vecinos.isVisitado())
                .forEach(this::transversarRecursivo);
    }



    public Deque<Vertice<T>> getChecar() {
        return checar;
    }

    public Queue<Vertice<T>> getChecar2() {
        return checar2;
    }

}
