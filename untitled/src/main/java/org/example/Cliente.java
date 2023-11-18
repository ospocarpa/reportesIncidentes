package org.example;

import java.util.List;

public class Cliente {
    private String cuit;
    private  String razonSocial;
     private Contacto contacto;
    private List<Servicio> serviciosContratados;

    public Cliente(String cuit, String razonSocial, Contacto contacto, List<Servicio> serviciosContratados) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.contacto = contacto;
        this.serviciosContratados = serviciosContratados;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public List<Servicio> getServiciosContratados() {
        return serviciosContratados;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public void setServiciosContratados(List<Servicio> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }
}
