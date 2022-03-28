package com.Alumnos;

import java.util.Scanner;

public class ClsListaAlumno {

    public Nodo numberOne;

    public ClsListaAlumno() {
        numberOne = null;
    }

    private int leerAlumno() {
        System.out.println("Ingrese valor, -1 para Terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    //CREAR LISTA DE ALUMNOS
    public ClsListaAlumno crearLista() {
        Alumno alumno = new Alumno();
        numberOne = null;
        int x;
        do {
            x = leerAlumno();
            if (x != -1) {
                numberOne = new Nodo(alumno, numberOne);
            }
        } while (x != -1);
        return this;
    }

    //INSERTAR DATOS EN LA CABEZA
    public ClsListaAlumno insertarCabezaLista(Alumno alumno) {
        Nodo nuevo;
        nuevo = new Nodo(alumno);
        nuevo.enlace = numberOne;
        numberOne = nuevo;
        return this;

    }

    //IMPRIMIR LISTA
    public void visualizar() {
        Nodo n;
        int k = 0;
        n = numberOne;
        while (n != null) {
            System.out.println(n.persona + "");
            n = n.enlace;
            k++;
            System.out.print((k % 15 != 0 ? "" : "\n"));
        }
    }

    //BUSCAR POR VALOR - NUMERO DE CARNET
    public Nodo buscarLista(String carnet) {
        Nodo indice;
        for (indice = numberOne; indice != null; indice = indice.enlace) {
            if ((carnet.equals(indice.persona.getCarnet()))) {//valorBuscar.equals(indice.dato)
                return indice;
            }
        }
        return null;
    }

    //INSERTAR ADELANTE DEL ALUMNO
    public ClsListaAlumno insertarListaAlumno(String carnetAnterior, Alumno alumno) {
        Nodo nuevo, anterior;
        anterior=buscarLista(carnetAnterior);
         if (anterior != null) {
            nuevo = new Nodo(alumno);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
        return this;
    }
    
    //BUSCAR POR POSICION
     public Nodo buscarPosicionAlumno(int posicion) {
        Nodo indice;
        int i;
        if (posicion < 0) {
            return null;
        }
        indice = numberOne;
        for (i = 1; (i < posicion) && (indice != null); i++) {
            indice = indice.enlace;
        }
        return indice;
    }
     
     //ELIMINAR
     public void eliminar(String carnet) {
        Nodo actual, anterior;
        boolean encontrado;
        //INICIALIZAR LOS APUNTADORES
        actual = numberOne;
        anterior = null;
        encontrado = false;
        //BUSCAR NODO
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.persona.getCarnet().equals(carnet)); //EQUALS
            if (!encontrado) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        //ENLAZAR DEL NODO ANTERIOR CON EL SIGUIENTE NODO
        if (actual != null) {
            //DISTINGUE QUE EL NODO NO SEA LA CABEZA
            if (actual == numberOne) {
                numberOne = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }
     
     
     
     //INSERTAR DE ULTIMO
     public ClsListaAlumno insertarUltimo(Nodo ultimo, Alumno alumno) {
        ultimo.enlace = new Nodo(alumno);
        ultimo = ultimo.enlace;
        return this;
    }
}
