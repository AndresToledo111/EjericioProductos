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
public class ProFrescos extends Producto {

    String fechaEnvasado, paisOrigen;

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public ProFrescos(String fechaEnvasado, String paisOrigen, String fechaCaducidad, String descripcionProducto, int numeroLote) throws Exception {
        super(fechaCaducidad, descripcionProducto, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String imprimir() {
        return "\nDATOS DE PRODUCTOS FRESCOS\n"
                + "\nFecha de envasado: " + fechaEnvasado
                + "\nPais de origen: " + paisOrigen
                + "\nFecha de caducidad del producto: " + fechaCaducidad
                + "\nDescripcion del producto: " + descripcionProducto
                + "\nNumero de lote: " + numeroLote
                + "\n-----------------";

    }

}
