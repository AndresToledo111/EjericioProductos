
import Entidades.ProFrescos;
import Entidades.Producto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class TestProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Producto p=new Producto("2012", "Papas", 24);
        System.out.println(p.Imprimir());
        
        ProFrescos pf= new ProFrescos("2010", "Chile", "2012", "Doritos", 15);
        System.out.println(pf.imprimir());
    }
    
}
