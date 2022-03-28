package com.Alumnos;

public class Nodo {

    Alumno persona;
    Nodo enlace;

    public Nodo() {
    }

    public Nodo(Alumno persona) {
        this.persona = persona;
    }

    public Nodo(Alumno persona, Nodo enlace) {
        this.persona = persona;
        this.enlace = enlace;
    }

    public Alumno getPersona() {
        return persona;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}
