

public class ClasePrimera{

    public static void main(String[] args){
    /* 
    Posicion ubicaciones[] = new Posicion[7];
    ubicaciones[0] = new Posicion("A", new String[]{"B", "F", "G"});
    ubicaciones[1] = new Posicion("B", new String[]{"D","E", "F"});
    ubicaciones[2] = new Posicion("C", new String[]{});
    ubicaciones[3] = new Posicion("D", new String[]{});
    ubicaciones[4] = new Posicion("E", new String[]{"C", "G"});
    ubicaciones[5] = new Posicion("F", new String[]{});
    ubicaciones[6] = new Posicion("G", new String[]{"A"});

    DFS dfs = new DFS(ubicaciones, "F", "A");
    //*/
    profe();

    }

    public static void profe(){
    Posicion ubicaciones[] = new Posicion[15];
    ubicaciones[0] = new Posicion("1", new String[]{"2"});
    ubicaciones[1] = new Posicion("2", new String[]{"1","4"});
    ubicaciones[2] = new Posicion("3", new String[]{"4", "6"});
    ubicaciones[3] = new Posicion("4", new String[]{"2", "3","5"});
    ubicaciones[4] = new Posicion("5", new String[]{"4","6"});
    ubicaciones[5] = new Posicion("6", new String[]{"3","5","8"});

    ubicaciones[6] = new Posicion("7", new String[]{"8","10"});
    ubicaciones[7] = new Posicion("8", new String[]{"6","7","9","10"});
    ubicaciones[8] = new Posicion("9", new String[]{"8","13","15"});
    ubicaciones[9] = new Posicion("10", new String[]{"7","8","11"});
    ubicaciones[10] = new Posicion("11", new String[]{"10","12"});
    ubicaciones[11] = new Posicion("12", new String[]{"11","15"});
    ubicaciones[12] = new Posicion("13", new String[]{"9"});
    ubicaciones[13] = new Posicion("14", new String[]{"15"});
    ubicaciones[14] = new Posicion("15", new String[]{"9","12","14"});

    DFS dfs = new DFS(ubicaciones, "1", "9");
    dfs.recorridoDado();
    }

}


