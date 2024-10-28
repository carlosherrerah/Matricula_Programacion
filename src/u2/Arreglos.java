package u2;

import java.util.Scanner;

public class Arreglos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   // 0      1       2 
    String[] nombres = /* new String[] */ {"Hugo", "Paco", "Luis"};
    int edades [] = new int[3];
    
    String[] alumnos;
    alumnos = new String[3];
           
    //Se puede pedir el tamaño del arreglo, en la corrida
    //System.out.print("Ingrese el No de alumnos: ");
    //int noAlumnos = sc.nextInt();
    //alumnos = new String[noAlumnos];
    
    // captura de Edades
    for (int i = 0; i < nombres.length; i++) {
      System.out.print("Edad de " + nombres[i] + ": ");
      edades[i] = sc.nextInt();
    }
    System.out.println();

     
    // Imprimir los nombres y edades
    System.out.println("Nombre\tEdad");
    for (int i = 0; i < nombres.length; i++) {
      System.out.println(nombres[i] + "\t" + edades[i]);
    }

    // El mayor de edad es "Fulano" con x años
    
    



  }
  
}
