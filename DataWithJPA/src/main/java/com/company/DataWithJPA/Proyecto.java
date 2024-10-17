package com.company.DataWithJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String proyecto;
    private String descripcion;

    protected Proyecto(){}

    public Proyecto(String proyecto, String descripcion) {
        this.proyecto = proyecto;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id=" + id +
                ", proyecto='" + proyecto + '\'' +
                ", descripcion=" + descripcion +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getProyecto() {
        return proyecto;
    }

    public String getId_descripcion() {
        return descripcion;
    }
}
