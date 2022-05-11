package com.ListEnlazada;

public class ClsPilaListaE {

    private ClsNodoPila cima;

    public ClsPilaListaE() {
        cima = null;
    }

    public boolean pilaVacia() {
        return cima == null;
    }

    public void insertar(Object elemento) {
        ClsNodoPila nuevo;
        nuevo = new ClsNodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede leer cima.");
        }
        return cima.elemento;
    }

    public void limpiarPila() {
        ClsNodoPila t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
}
