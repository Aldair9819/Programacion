import java.util.Stack;
import java.util.ArrayList;


public class DFS {
    private Posicion[] ubicaciones;
    private Stack<Posicion> F = new Stack<Posicion>();
    private int posicionFinal;
    private ArrayList<Posicion> recorrido = new ArrayList<Posicion>();

    public DFS(Posicion[] ubicaciones, String inicio, String fin) {
        this.ubicaciones = ubicaciones;
        for(int i=0;i<this.ubicaciones.length;i++){
            if(this.ubicaciones[i].getNombre().equals(inicio)){
                this.ubicaciones[i].setVisitado(true);
                F.push(this.ubicaciones[i]);
                System.out.println("Asignado");
                break;
            }
        }

        for(int i=0;i<this.ubicaciones.length;i++){
            if(this.ubicaciones[i].getNombre().equals(fin)){
                this.posicionFinal = i;
                System.out.println("Asignado");
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
            for(int j=0; j<this.ubicaciones.length; j++){
                if(vecinos[i].equals(this.ubicaciones[j].getNombre())&&!this.ubicaciones[j].isVisitado()){
                    vecinosPosicion.add(this.ubicaciones[j]);
                }
            }
        }
        return vecinosPosicion;
    }

    private Stack<Posicion> insertar(ArrayList<Posicion> vecinos){
        for(int i=0; i<vecinos.size(); i++){
            this.F.push(vecinos.get(i));
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
   
    private void metodoDFS(Stack<Posicion> F){
        Posicion EA; ArrayList<Posicion> OS;
        
        if(F.isEmpty()){
            System.out.println("Solucion no encontrada");
            return;
        }else{
            EA = F.pop();
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
