package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class Especialidad {
    //Atributos
    @Getter
    @Setter
    private String nombre;
    private List<TipoDeProblema> tipoDeProblema;
    //Constuctor
    public Especialidad(String nombre) {
        this.nombre = nombre;
    }
    public Especialidad(String nombre, List<TipoDeProblema> tipoDeProblema) {
        this.tipoDeProblema = null;
        this.nombre=nombre;
    }

    //Metodos

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public List<TipoDeProblema> getTipoDeProblema() {
        return tipoDeProblema;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeProblema(List<TipoDeProblema> tipoDeProblema) {
        this.tipoDeProblema = tipoDeProblema;
    }



}
