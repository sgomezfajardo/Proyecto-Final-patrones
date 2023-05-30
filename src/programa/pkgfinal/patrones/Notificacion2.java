/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.pkgfinal.patrones;

/**
 *
 * @author TUF ASUS
 */
public class Notificacion2 extends DecoradorAbstracto {
    public void doJob() {
        System.out.println("");
        System.out.println("Notificacion de aplazamiento de entrega del libro");
        super.doJob();
//Add additional thing if necessary
        System.out.println("El plazo de prestamo de su libro ha sido extendido dos dias, Quede atento a la fecha de devolucion");
        System.out.println(":D");
    }
}
