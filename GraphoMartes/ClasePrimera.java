import java.util.Arrays;

public class ClasePrimera{
    

    public static void main(String[] args){
    int numero[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int numero0[] = {0,1,0,0,0,1,1};
    int numero1[] = {0,0,0,1,1,1,0};
    int numero2[] = {0,0,0,0,0,0,0};
    int numero3[] = {0,0,0,0,0,0,0};
    int numero4[] = {0,0,1,0,0,0,0};
    int numero5[] = {0,0,0,0,0,0,0};
    int numero6[] = {1,0,0,0,0,0,0};
    

    int arreglo[][] = new int[7][7];
    boolean visitado[][] = new boolean[7][7];

    for(int i = 0; i < 7; i++) {
        for(int j = 0; j < 7; j++) {
            visitado[i][j] = false;
        }
    }

    for(int i = 0; i < 7; i++) {
        arreglo[0][i] = numero0[i];
        arreglo[1][i] = numero1[i];
        arreglo[2][i] = numero2[i];
        arreglo[3][i] = numero3[i];
        arreglo[4][i] = numero4[i];
        arreglo[5][i] = numero5[i];
        arreglo[6][i] = numero6[i];
    }

    for(int i=0; i<7; i++){
        for(int j=0; j<7; j++){
            System.out.print(arreglo[i][j]+"-");
        }
        System.out.println();
    }

    Posicion ubicaciones[] = new Posicion[7];
    ubicaciones[0] = new Posicion("A", new String[]{"B", "F", "G"});
    ubicaciones[1] = new Posicion("B", new String[]{"A", "C", "F"});
    ubicaciones[2] = new Posicion("C", new String[]{"B", "D", "F"});
    ubicaciones[3] = new Posicion("D", new String[]{"C", "E", "F"});
    ubicaciones[4] = new Posicion("E", new String[]{"D", "F", "G"});
    ubicaciones[5] = new Posicion("F", new String[]{"A", "B", "C", "D", "E", "G"});
    ubicaciones[6] = new Posicion("G", new String[]{"A"});
    }

    
}
