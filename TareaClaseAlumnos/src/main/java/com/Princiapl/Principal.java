package com.Princiapl;

import com.Alumnos.Alumno;
import com.Alumnos.ClsListaAlumno;
import com.Alumnos.Nodo;

public class Principal {

    public static void main(String[] args) {
        Nodo nodo = new Nodo();
        Alumno persona = new Alumno();
        ClsListaAlumno lAlumno = new ClsListaAlumno();

        persona.setCarnet("012");
        persona.setNombre("Edwar");
        persona.setPromedio(95.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("013");
        persona.setNombre("Angie");
        persona.setPromedio(90.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("014");
        persona.setNombre("Estela");
        persona.setPromedio(80.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("015");
        persona.setNombre("Raul");
        persona.setPromedio(70.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("016");
        persona.setNombre("Dulce");
        persona.setPromedio(97.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("017");
        persona.setNombre("Alan");
        persona.setPromedio(47.33);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("018");
        persona.setNombre("Kevin");
        persona.setPromedio(77.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("019");
        persona.setNombre("Oscar");
        persona.setPromedio(17.5);
        lAlumno.insertarCabezaLista(persona);
        persona = new Alumno();
        persona.setCarnet("020");
        persona.setNombre("Milagro");
        persona.setPromedio(61.5);
        lAlumno.insertarCabezaLista(persona);

        System.out.println("*********************LISTADO DE ALUMNOS**************************************");
        lAlumno.visualizar();
        System.out.println("\n");

        System.out.println("*********************LISTA BUSCAR POR VALOR - NUMERO DE CARNET****************");
        nodo = new Nodo();
        nodo = lAlumno.buscarLista("016");
        System.out.println("ESTUDIANTE ENCONTRADO");
        System.out.println(nodo.getPersona());
        System.out.println("\n");

        System.out.println("*********************LISTA INSERTAR A LA PAR DE OTRO REGISTRO******************");
        System.out.println("LISTA ACTUALIZADA");
        persona = new Alumno();
        persona.setCarnet("035");
        persona.setNombre("Victoria");
        persona.setPromedio(61.5);
        lAlumno.insertarListaAlumno("014", persona);
        lAlumno.visualizar();
        System.out.println("\n");

        System.out.println("************************LISTA BUSCAR POR POSICION*******************************");
        nodo = new Nodo();
        nodo = lAlumno.buscarPosicionAlumno(3);
        System.out.println("ESTUDIANTE ENCONTRADO");
        System.out.println(nodo.getPersona());
        System.out.println("\n");

        System.out.println("************************ELIMINAR REGISTRO**************************************");
        nodo = new Nodo();
        String carnet = "035";
        nodo = lAlumno.buscarLista(carnet);
        lAlumno.eliminar(carnet);
        System.out.println("ESTUDIANTE REMOVIDO ES --> \n" + nodo.getPersona() + "\n");
        System.out.println("NUEVA LISTA");
        lAlumno.visualizar();
        System.out.println("\n");

        System.out.println("************************LISTA INSERTAR DE ULTIMO*******************************");
        persona = new Alumno();
        persona.setCarnet("099");
        persona.setNombre("Alejandro");
        persona.setPromedio(99.5);
        lAlumno.insertarUltimo(nodo.getEnlace().getEnlace(), persona);
        lAlumno.visualizar();

    }
}
