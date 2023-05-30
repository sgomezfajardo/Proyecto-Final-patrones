/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.pkgfinal.patrones;

/**
 *
 * @author TUF ASUS
 */
abstract class DecoradorAbstracto extends Componente {

    protected Componente com;

    public void SetTheComponent(Componente c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }

}