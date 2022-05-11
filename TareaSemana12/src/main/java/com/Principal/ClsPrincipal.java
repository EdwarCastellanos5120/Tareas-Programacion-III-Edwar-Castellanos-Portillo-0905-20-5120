package com.Principal;

import com.ArrayList.ClsPilaArray;
import com.ListEnlazada.ClsPilaListaE;
import java.io.*;

public class ClsPrincipal {

    static void arrayListPila() {
        ClsPilaArray arrayList = new ClsPilaArray();
        int numElementos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*** Numero de Elementos que Desea usar: ***");
        try {
            numElementos = Integer.parseInt(entrada.readLine());
            for (int i = 1; i <= numElementos; i++) {
                System.out.println("Elemento Numero" + i + ": ");
                Double numValor;
                numValor = Double.valueOf(entrada.readLine());
                arrayList.insertarElemento(numValor);
            }
            System.out.println("*** Los Elementos de la Pila son: ***");
            while (!arrayList.pilaVacia()) {
                Double numero;
                numero = (Double) arrayList.quitarCima();
                if (numero > 0.0) {
                    System.out.println(numero);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    static void listaEnlazadaPila() {
        ClsPilaListaE pila;
        int numElementos;
        final int CLAVE = -1;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("*** Numeros de ELementos que Desea usar(Termina con -1): ***");
        try {
            pila = new ClsPilaListaE();
            do {
                numElementos = Integer.parseInt(entrada.readLine());
                pila.insertar(numElementos);
            } while (numElementos != CLAVE);

            System.out.println("*** Elementos de Lista Enlazada ***");
            while (!pila.pilaVacia()) {
                numElementos = (Integer) (pila.quitar());
                System.out.println(numElementos + " ");
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        System.out.println("ARRAYLIST");
        arrayListPila();
        System.out.println("\nLISTA ENLAZADA");
        listaEnlazadaPila();
    }
}
