package lse;

public class Nodo {
    private Object dato;
    private Nodo Siguiente;

    public Nodo(Object dato, Nodo Siguiente){
        this.dato = dato;
        this.Siguiente = Siguiente;
    }
    public Object getDato(){
        return dato;
    }
    public void setDato(Object dato){
        this.dato = dato;
    }
    public Nodo getSiguiente(){
        return Siguiente;
    }
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}