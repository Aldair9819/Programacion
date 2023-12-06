
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class appV2 {
    public static void main(String[] args) {
        Vertice<Integer> v0 = new Vertice<>(0);
        Vertice<Integer> v1 = new Vertice<>(1);
        Vertice<Integer> v2 = new Vertice<>(2);
        Vertice<Integer> v3 = new Vertice<>(3);
        Vertice<Integer> v4 = new Vertice<>(4);
        Vertice<Integer> v5 = new Vertice<>(5);
        Vertice<Integer> v6 = new Vertice<>(6);

        v0.setVecinos(List.of(v1, v5, v6));
        v1.setVecinos(List.of(v3, v4, v5));
        v4.setVecinos(List.of(v2, v6));
        v6.setVecinos(List.of(v0));

        DFS<Integer> dfs = new DFS<>();
        //dfs.transversar(v0);
        dfs.transversarRecursivo(v0, v4);

        Deque<Vertice<Integer>> revisar = dfs.getChecar();
        System.out.println("\nRevisando que diablos agarre:\n");
        while(!revisar.isEmpty()){
            System.out.println(revisar.pop());
        }

        Queue<Vertice<Integer>> revisar2 = dfs.getChecar2();
        System.out.println("\nRevisando que diablos agarre:\n");
        while(!revisar2.isEmpty()){
            System.out.println(revisar2.poll());
        }
    }
}
