/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1;

/**
 *
 * @author Enrique Moreno
 */
public class Persona implements Comparable<Persona> {

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = -1;
        if (this.tipoDocumento.equals(o.tipoDocumento) && this.numeroDocumento.equals(o.numeroDocumento)) {
            resultado = 0;
        }
        return resultado;
    }

}
