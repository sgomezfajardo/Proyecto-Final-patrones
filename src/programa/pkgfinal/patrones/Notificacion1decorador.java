/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.pkgfinal.patrones;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TUF ASUS
 */
public class Notificacion1decorador  extends DecoradorAbstracto {
     public void doJob() {
        super.doJob();
             Date fechaActual = new Date();
             DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
             String fechaFormateada = formatoFecha.format(fechaActual);
        System.out.println("El prestamo de su libro adquirido en: " + fechaFormateada + "Tendra 10 dias de vigencia");
}}
