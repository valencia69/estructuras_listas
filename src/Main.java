import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args){
        ListaSimplementeEnlazada ListaSimplementeEnlazada = new ListaSimplementeEnlazada();


        //Insertar elementos a niestra lista.
        ListaSimplementeEnlazada.insertar(5);
        ListaSimplementeEnlazada.insertar(4);
        ListaSimplementeEnlazada.insertar(3);
        ListaSimplementeEnlazada.insertar(2);
        ListaSimplementeEnlazada.insertar(1);
        ListaSimplementeEnlazada.insertar(0);

        //Mostramos nuestra lista.
        ListaSimplementeEnlazada.mostrar();

        //Eliminar algunos elementos.
        ListaSimplementeEnlazada.eliminar();
        ListaSimplementeEnlazada.eliminar();

        //Motsrar nuestra lista.
        ListaSimplementeEnlazada.mostrar();
    }
}
