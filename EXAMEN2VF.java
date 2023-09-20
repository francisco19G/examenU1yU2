/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EXAMEN2VF{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Precio de venta de los instrumentos
        double PI1=1250.45;
        double PI2=3743.00;
        double PI3=2683.78;
        
      System.out.println("¿Cual es el instrumento comprado?");
      String instrumeto1=leer.nextLine();
      System.out.println("¿Cual es el precio del instrumetno?");
      double preciocompra1= leer.nextDouble();
      leer.nextLine();
      
     System.out.println("¿Cual es el instrumento comprado?");
     String Instrumeto2=leer.nextLine();
     System.out.println("¿Cual es el precio del instrumetno?");
     double preciocompra2=leer.nextDouble();
     leer.nextLine();
     
     
     System.out.println("¿Cual es el instrumento comprado?");
     String Instrumeto3=leer.nextLine();
     System.out.println("¿Cual es el precio del instrumetno?");
     double preciocompra3=leer.nextDouble();
   
        
    double ganancia = PI1-preciocompra1;
    double total= (ganancia/preciocompra1)*100;
    System.out.println("el porcentaje de ganancia de " + instrumeto1 + " es " + ganancia);
            
    
    double ganancia2 = PI2-preciocompra2;
    double total2 = (ganancia2/preciocompra2)*100;
    System.out.println("el porcentaje de ganancia de " + Instrumeto2 + " es " + ganancia2);
           
    double ganancia3 = PI3-preciocompra3;       
    double total3 = (ganancia3/preciocompra3)*100;
    System.out.println("el porcentaje de ganancia de " + Instrumeto3 + " es " + ganancia3);

     leer.close();
    }
    
}
