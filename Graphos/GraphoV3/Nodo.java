package GraphoV3;

public class Nodo <T>{
	T elemento;
	Nodo<T> enlace;
    boolean recorrido;
	
	public Nodo(T elemento) {
		this.elemento = elemento;
		this.enlace = null;
        this.recorrido = false;
	}
	
	public Nodo(T elemento, Nodo<T> enlace) {
		this.elemento = elemento;
		this.enlace = enlace;
	}
	
	public T getDato() {
		return this.elemento;
	}
	
	public Nodo<T> getEnlace(){
		return this.enlace;
	}
	
	public void setEnlace(Nodo<T> enlace) {
		this.enlace = enlace;
	}
}
