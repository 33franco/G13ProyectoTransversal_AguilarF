/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadGP13.entidades;

/**
 *
 * @author Franco
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int anioMateria, boolean estado) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int anioMateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre + " - Año: " + anioMateria;
    }
    
    
}
