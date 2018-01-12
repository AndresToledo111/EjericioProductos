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

    public void setDescripcionProducto(String descripcionProducto) throws Exception {
        if (descripcionProducto.trim() !="") {
            if (descripcionProducto.length() >= 15 && descripcionProducto.length() < 100) {

                this.descripcionProducto = descripcionProducto;
            }
            else
            {
                
                throw new Exception("Descripcion debe estar entre los 15 y 100 caracteres");
            }
        }
        else
        {
            throw new Exception("No dejar campo vacio");
        }
            
        }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) throws Exception {
        
            if (numeroLote >0 && numeroLote < 500) {

                this.numeroLote = numeroLote;
            }
            else
            {
                
                throw new Exception("Numero de lote debe ser mayor a 0 y 500 ");
            }
        
        
    }

    public Producto(String fechaCaducidad, String descripcionProducto, int numeroLote) throws Exception {
        setFechaCaducidad(fechaCaducidad);
        setDescripcionProducto(descripcionProducto);        
        setNumeroLote(numeroLote);
    }

    @Override
    public String toString() {
        return "\nDATOS DE PRODUCTOS \n"
                + "\nFecha de caducidad del producto: " + fechaCaducidad
                + "\nDescripcion del producto: " + descripcionProducto
                + "\nNumero de lote: " + numeroLote
                + "\n-----------------";
    }

}
