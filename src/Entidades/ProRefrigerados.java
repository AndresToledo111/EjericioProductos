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
public class ProRefrigerados extends ProFrescos {
    int codSupervision;
            String tempRecomendada;

    public int getCodSupervision() {
        return codSupervision;
    }

    public void setCodSupervision(int codSupervision) {
        this.codSupervision = codSupervision;
    }

    public String getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(String tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public ProRefrigerados(int codSupervision, String tempRecomendada, String fechaEnvasado, String paisOrigen, String fechaCaducidad, String descripcionProducto, int numeroLote) throws Exception {
        super(fechaEnvasado, paisOrigen, fechaCaducidad, descripcionProducto, numeroLote);
        this.codSupervision = codSupervision;
        this.tempRecomendada = tempRecomendada;
    }

    
  

    @Override
    public String toString() {
       return "\nDATOS DE PRODUCTOS REFRIGERADOS\n"
                + "\nCodigo de supervision: " + codSupervision
                + "\nTemperatura recomendada: " + tempRecomendada
                + "\nFecha de envasado: " + fechaEnvasado
                + "\nPais de origen: " + paisOrigen
                + "\nFecha de caducidad del producto: " + fechaCaducidad
                + "\nDescripcion del producto: " + descripcionProducto
                + "\nNumero de lote: " + numeroLote
                + "\n-------------------------";
    }
  
    
    
    
}
