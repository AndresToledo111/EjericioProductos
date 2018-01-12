
import Entidades.ProFrescos;
import Entidades.ProRefrigerados;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;

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

        Producto p=new Producto("2012", "Papas fritas lays", 24);
        
        List<Producto> pro=new ArrayList<Producto>();
        pro.add(p);
        System.out.println(pro);
        
        
//        Lista de productos frescos
//        ProFrescos pf = new ProFrescos("2010", "Chile", "2012", "Doritos", 15);
////        System.out.println(pf.imprimir());
//        List<ProFrescos> pfr = new ArrayList<ProFrescos>();
//        pfr.add(pf);
//        
//        System.out.println(pfr);
//        
//        
//
//        ProRefrigerados pr = new ProRefrigerados(12, "15°C ", "12/12/2012", "Chile", "12/12/2014", "Cereal chocapic", 32);
//        ProRefrigerados pr1 = new ProRefrigerados(13, "-5°C ", "10/10/2014", "Argentina", "12/12/2018", "Camarones", 12);
//
//        //LISTA DE PRODCUTOS REFRIGERADOS
//        List<ProRefrigerados> pre = new ArrayList<ProRefrigerados>();
//        pre.add(pr);
//        pre.add(pr);
////        pre.add((ProRefrigerados) pf);Entidades.ProFrescos cannot be cast to Entidades.ProRefrigerados
//        // no se puede guardar en una lista un producto diferente
//
//        System.out.println(pre);

    }

}
