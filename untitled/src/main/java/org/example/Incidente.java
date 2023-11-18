package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Getter
@Setter
public class Incidente {

    private String nombre;
    private TipoDeProblema tipoDeProblema;
    private Servicio servicio;
    private String descripcion;
    private Cliente cliente;
    private Tecnico tecnicoAsignado;
    private LocalDate fechaApertura;
    private  int tiempoEstimado;
    private int tiempoMaximo;
    private  LocalDate FechaCierre;
    private EstadoIncidente estado;
    // constructores


    public Incidente(String nombre) {
        this.nombre = nombre;
    }

    public Incidente(TipoDeProblema tipoDeProblema) {
        this.tipoDeProblema = tipoDeProblema;
    }

    public Incidente(Servicio servicio) {
        this.servicio = servicio;
    }

    public Incidente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Incidente(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public Incidente(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Incidente(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Incidente(EstadoIncidente estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDeProblema getTipoDeProblema() {
        return tipoDeProblema;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public LocalDate getFechaCierre() {
        return FechaCierre;
    }

    public EstadoIncidente getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeProblema(TipoDeProblema tipoDeProblema) {
        this.tipoDeProblema = tipoDeProblema;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        FechaCierre = fechaCierre;
    }

    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }
}

