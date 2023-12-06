import java.util.LinkedList;
import java.util.Queue;

public record BFS<T>(Vertice<T> inicioVertice) {

    public void transversar(){
        Queue<Vertice<T>> cola = new LinkedList<>();
        cola.add(inicioVertice);
        while(!cola.isEmpty()){
            Vertice<T> actual = cola.poll();
            if(!actual.isVisitado()){
                actual.setVisitado(true);
                System.out.println(actual);
                cola.addAll(actual.getVecinos());
            }
        }
    }

}
