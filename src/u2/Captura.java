package u2;

import java.util.Scanner;


public class Captura {
  public static void main(String[] args) {
       //int[] datos = {100, -2, 333, 0, 5};
    //System.out.println("El mayor es : " + mayor(datos));
   
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el No de datos: ");
    int noDatos = sc.nextInt();

    int[] datos = new int[noDatos];
    
    for (int i = 0; i < datos.length; i++) {
      System.out.println("Dato " + (i+1) + ": ");
      datos[i] = sc.nextInt();
    }
    //System.out.println("El mayor es : " + mayor(datos));
    

  }
  
}
