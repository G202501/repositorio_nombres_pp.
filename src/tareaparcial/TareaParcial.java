
package tareaparcial;
//Paquete de datos e/s datos por consola

import java.util.Scanner;
public class TareaParcial {
    //Metodo principal
    public static void main(String args []) {
        // Declaracion de variables
        
    String empleado;
    double ht, th, sb, d, sn, ts;
    //creando el objeto lectura
    Scanner lectura= new Scanner(System.in);
    //Entrada de datos
    System.out.print("Nombre de empleado: ");
    empleado=lectura.next();
    System.out.print("Horas trabajadas: ");
    ht = lectura.nextDouble();
    System.out.print("Tarifa por hora: ");
    th=lectura.nextDouble();
    System.out.print("Tarifa por minuto: ");
    ts=lectura.nextDouble();
    //Proceso de datos
    sb=ht*th;
    d=sb*0.13;
    sn=sb-d;
    //Salida de datos
    System.out.println("Sueldo bruto: "+sb);
    System.out.println("Descuento: "+d);
    System.out.println("Sueldo Neto: "+sn);
    
    }//Fin del método
    
}//Fin del programa
