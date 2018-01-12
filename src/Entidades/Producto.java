/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author patri
 */
public class Producto {

    String fechaCaducidad, descripcionProducto;
    int numeroLote;

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) throws Exception {
        if (fechaCaducidad.trim() != "") {

            if (fechaCaducidad.length() <= 2020) {

                this.fechaCaducidad = fechaCaducidad;
            } else {
                throw new Exception("Fecha errónea!");
            }
        } else {
            throw new Exception("No puede dejar un campo vacio!");
        }
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Producto(String fechaCaducidad, String descripcionProducto, int numeroLote) throws Exception {
        setFechaCaducidad(fechaCaducidad);
        this.descripcionProducto = descripcionProducto;
        this.numeroLote = numeroLote;
    }

    public String Imprimir() {
        return "\nDATOS DE PRODUCTOS \n"
                + "\nFecha de caducidad del producto: " + fechaCaducidad
                + "\nDescripcion del producto: " + descripcionProducto
                + "\nNumero de lote: " + numeroLote
                +"\n-----------------";
        
        
    }

}
