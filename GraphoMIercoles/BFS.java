
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BFS {
    private Posicion[] ubicaciones;
    private LinkedList<Posicion> F = new LinkedList<Posicion>();
    private int posicionFinal;
    private ArrayList<Posicion> recorrido = new ArrayList<Posicion>();
    private Scanner sc = new Scanner(System.in);

    public BFS(Posicion[] ubicaciones, String inicio, String fin) {
        this.ubicaciones = ubicaciones;
        for(int i=0;i<this.ubicaciones.length;i++){
            if(this.ubicaciones[i].getNombre().equals(inicio)){
                this.ubicaciones[i].setVisitado(true);
                F.addLast(this.ubicaciones[i]);
                System.out.println("Asignado el inicio");
                break;
            }
        }

        for(int i=0;i<this.ubicaciones.length;i++){
            if(this.ubicaciones[i].getNombre().equals(fin)){
                this.posicionFinal = i;
                System.out.println("Asignado la ruta final");
                break;
            }
        }
        metodoDFS(this.F);
        
    }

    private boolean goalTest(Posicion EA){
        return EA.getNombre().equals(this.ubicaciones[this.posicionFinal].getNombre());
    }

    private ArrayList<Posicion> expand(Posicion EA){
        String[] vecinos = EA.getVecinos();
        ArrayList<Posicion> vecinosPosicion = new ArrayList<Posicion>();
        for(int i=0; i<vecinos.length; i++){
            if(!getPosicion(vecinos[i]).isVisitado() && !isEnLista(vecinos[i])){
                vecinosPosicion.add(getPosicion(vecinos[i]));
            }
        }

        return vecinosPosicion;
    }

    private Posicion getPosicion(String nommbre){
        for(int i=0; i<this.ubicaciones.length; i++){
            if(this.ubicaciones[i].getNombre().equals(nommbre)){
                return this.ubicaciones[i];
            }
        }
        return null;
    }

    private boolean isEnLista(String nombre){
        for(int i=0; i<this.F.size(); i++){
            if(this.F.get(i).getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }




    private LinkedList<Posicion> insertar(ArrayList<Posicion> vecinos){
        System.out.println("Vecinos:");
        for(int i=0; i<vecinos.size(); i++){
            this.F.addLast(vecinos.get(i));
            System.out.println(vecinos.get(i).getNombre());
        }
        return this.F;
    }

    private void yaVisitado(Posicion posicion){ 
        for(int i=0; i<this.ubicaciones.length; i++){
            if(this.ubicaciones[i].getNombre().equals(posicion.getNombre())){
                this.ubicaciones[i].setVisitado(true);
                return;
            }
        }
        System.out.println("No encontrado");
    }
   
    private void metodoDFS(LinkedList<Posicion> F){
        Posicion EA; ArrayList<Posicion> OS;

        if(F.isEmpty()){
            System.out.println("Solucion no encontrada");
            return;
        }else{
            EA = F.poll();
            this.recorrido.add(EA);
            yaVisitado(EA);
            if(goalTest(EA)){
                System.out.println("Llegaste a tu destino");
                return;
            }else{
                OS = expand(EA);
                F = insertar(OS);
                metodoDFS(F);
                }
            }
            
        }

    public void recorridoDado(){
        System.out.println("Camino recorrido:");
        for(int i=0; i<this.recorrido.size(); i++){
            System.out.println(this.recorrido.get(i).getNombre());
        }
    }
}
