
package com.hitoindividual.hitoswing.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "productos")
public class Product implements Serializable{
 private static final long serialVersionUID = 8633415090390966715L;
 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 @Column(name = "nombre")
 private String nombre;
 @Column(name = "fechaEnvasado")
 private Date fecha;
 @Column(name = "unidades")
 private int unidades;
 @Column(name = "precio")
 private float precio;
 @Column(name = "disponible")
 private boolean disponible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
