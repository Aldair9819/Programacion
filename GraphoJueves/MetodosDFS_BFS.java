import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class MetodosDFS_BFS {
    private int[][] arreglo ;
    private Stack<Integer> listaVisitados = new Stack<Integer>();

    public MetodosDFS_BFS(int[][] arreglo) {
        this.arreglo = arreglo;
    }

    public void metodoDFS(int inicio, int fin){
        LinkedList<Integer> F = new LinkedList<Integer>();
        F.addLast(inicio);
        busquedaRecursivaDFS(F, fin);
        imprimeRecorrido("DFS");
    }

    public void metodoBFS(int inicio, int fin){
        Stack<Integer> F = new Stack<Integer>();
        F.push(inicio);
        busquedaRecursivaBFS(F, fin);
        imprimeRecorrido("BFS");
    }

    private boolean goalTest(int numero, int fin){
        return numero == fin;
    }

    private ArrayList<Integer> expand(int numero){
        ArrayList<Integer> listaNueva = new ArrayList<Integer>();
        for(int i=0; i<this.arreglo.length; i++){
            int numeroLista = this.arreglo[numero][i];
            if(!listaVisitados.contains(i) && numeroLista != 0){
                listaNueva.add(i);
            }
        }
       
        return listaNueva;
    }

    private LinkedList<Integer> insertar(LinkedList<Integer> F,ArrayList<Integer> OS){
        for(int i=0; i<OS.size(); i++){
            if(!F.contains(OS.get(i)))
            F.addLast(OS.get(i));
        }

        return F;
    }

    private Stack<Integer> insertar(Stack<Integer> F,ArrayList<Integer> OS){
        for(int i=0; i<OS.size(); i++){
            if(!F.contains(OS.get(i)))
            F.push(OS.get(i));
        }

        return F;
    }

     private void busquedaRecursivaBFS(Stack<Integer> F, int fin){
        if(F.isEmpty()){
            System.out.println("No se encontro el caso");
            return;
        }else{
            int numero = F.pop();
            this.listaVisitados.push(numero);
            if(goalTest(numero,fin)){
                System.out.println("Llegaste a tu destino");
                return;
            }else{
                ArrayList<Integer> OS = expand(numero);
                F = insertar(F,OS);
                busquedaRecursivaBFS(F,fin);
                }
            }
        }

    

    private void busquedaRecursivaDFS(LinkedList<Integer> F, int fin){
        if(F.isEmpty()){
            System.out.println("No se encontro el caso");
            return;
        }else{
            int numero = F.poll();
            this.listaVisitados.push(numero);
            if(goalTest(numero,fin)){
                System.out.println("Llegaste a tu destino");
                return;
            }else{
                ArrayList<Integer> OS = expand(numero);
                F = insertar(F,OS);
                busquedaRecursivaDFS(F,fin);
                }
            }
        }

    private void imprimeRecorrido(String tipo){
        System.out.println("\nEl recorrido "+tipo+" es: ");


        this.listaVisitados.sort(Collections.reverseOrder());
        while(!this.listaVisitados.isEmpty()){
            System.out.println(this.listaVisitados.pop());
        }
    }

    
   


}

