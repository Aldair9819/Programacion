public class Ubicacion {
    private String nombre;
    private String[] vecinos;
    private boolean visitado;
    private double distanciaGoal;

    public Ubicacion(String nombre, double distanciaGoal) {
        this.nombre = nombre;
        this.distanciaGoal = distanciaGoal;
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

    public String toString(){
        return "Hola. Yo soy "+this.nombre+" y mi distancia a la meta es:"+this.distanciaGoal;
    }

    
}
