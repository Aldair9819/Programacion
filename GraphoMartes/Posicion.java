public class Posicion {
    private String nombre;
    private String[] vecinos;
    private boolean visitado;

    public Posicion(String nombre, String[] vecinos) {
        this.nombre = nombre;
        this.vecinos = vecinos;
        this.visitado = false;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public boolean isVisitado() {
        return this.visitado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean isVecinos(){
        return this.vecinos.length > 0;
    }

    public String[] getVecinos(){
        return this.vecinos;
    }


    
}
