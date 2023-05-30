/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.pkgfinal.patrones;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TUF ASUS
 */
public class ProgramaFinalPatrones {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Notificacion2 cd_2 = new Notificacion2();
       Scanner sc = new Scanner(System.in);
       Componenteconcreto cc = new Componenteconcreto();
       Proxy Metodos = new Proxy();
       Notificacion1decorador cd1 = new Notificacion1decorador();
       Observador observer = new Observador();
       List<Libros> ListLibros = new ArrayList<>();
       List<Usuario> ListUsuarios = new ArrayList<>();
       Usuario usu = new Usuario();
       Libros libr = new Libros();
       String direccion;
       int documento;
       String Nombre;
       int Serial;
       String Titulo;
       int opcion ;
       int Pos;
       
       do{
           System.out.println("Bienvenido, Digite la opcion que desea ejecutar");
           System.out.println("1: Ingresar libro al sistema");
           System.out.println("2: Eliminar libro del sistema");
           System.out.println("3: Buscar libro por posicion");
           System.out.println("4: Mostrar la lista de los libros");
           System.out.println("5: Ingresar nuevo usuario al sistema");
           System.out.println("6: Mostrar lista de socios");
           System.out.println("7: Eliminar registro de usuario");
           System.out.println("8: Hacer reserva de un libro");
           System.out.println("9: Extender la fecha de entrega de su libro");
           System.out.println("10: Devolver libro");
           opcion =sc.nextInt();
       switch(opcion){
           case 1:
               
               System.out.println("Digite el serial del libro:");
               Serial = sc.nextInt();
               libr.setSerial(Serial);
               sc.nextLine();
               System.out.println("Digite el titulo del libro");
               Titulo = sc.nextLine();
               libr.setTitulo(Titulo);
               ListLibros.add(libr);
               observer.update();
               
               break;
           case 2:
               
               System.out.println("Digite la posicion en la cual esta el libro que desea borrar: ");
               Pos=sc.nextInt();
               ListLibros.remove(Pos);
               observer.update();
               
               break;
           case 3:
               
               Metodos.VerInfoLibro();
               Pos=sc.nextInt();
               System.out.println("El libro en la psocion " + Pos + " es: " + ListLibros.get(Pos).getTitulo() + " # de Serial " + ListLibros.get(Pos).getSerial());
               
               break;
           case 4:
               
               Metodos.VerlistaDeLibros();
               for(Libros p : ListLibros){
                   System.out.println("Titulo: " + p.getTitulo());
                   System.out.println("Serial: " + p.getSerial());
               }
                  
               break;
               
           case 5:
               
               System.out.println("Digite el nombre del usuario a registrar: ");
               Nombre = sc.nextLine();
               usu.setNombre(Nombre);
               sc.nextLine();
               System.out.println("Digite la direccion del nuevo usuario a registrar: ");
               direccion = sc.nextLine();
               usu.setDireccion(direccion);
               System.out.println("Digite el documento del nuevo usuario a registrar: ");
               documento = sc.nextInt();
               usu.setDocumento(documento);
               observer.update();
               
              break;
              
           case 6:
               
               Metodos.VerListaDeSocios();
               for(Usuario p : ListUsuarios){
                   System.out.println("Nombre: " + p.getNombre());
                   System.out.println("Direccion: " + p.getDireccion());
                   System.out.println("Documento: " + p.getDocumento());
                    }
               break;
       
           case 7:
                              
               System.out.println("Digite la posicion en la cual se encuentra el usuario que desea eliminar del sistema..: ");
               Pos=sc.nextInt();
               ListUsuarios.remove(Pos);
               observer.update();
               
               break;
           case 8:
               
               cd1.SetTheComponent(cc);
               cd1.doJob();
               observer.update();
               
               break;
           case 9:
                
               cd_2.doJob(); 
               observer.update();
               
               break;
           case 10:
               
               System.out.println("Libro devuelto exitosamente :D");
               
               break;
       
    }}while(true);
        } }

               
               

