package com.ArrayList;

import java.util.ArrayList;

public class ClsPilaArray {

    private static final int INICIAL = 19;
    private int cima;
    private ArrayList arrayListaPila;

    public ClsPilaArray() {
        cima = -1;
        arrayListaPila = new ArrayList();
    }

    public void insertarElemento(Object elemento) throws Exception {
        cima++;
        arrayListaPila.add(elemento);
    }

    public Object quitarCima() throws Exception {
        Object auxiliar;
        if (pilaVacia()) {
            throw new Exception("La Pila se encuentra Vacia");
        }
        auxiliar = arrayListaPila.get(cima);
        arrayListaPila.remove(cima);
        cima--;
        return auxiliar;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("La Pila se encuentra Vacia");
        }
        return arrayListaPila.get(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitarCima();
        }

    }
}
