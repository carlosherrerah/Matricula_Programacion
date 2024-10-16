package u1;
import java.util.Scanner;

public class Estrellas {

  public static void main(String[] args) {
    int n = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Programa de Estrellas");
    System.out.print("Dame el numero de Estrellas: ");
    n = input.nextInt();
    // primera parte de la estrella
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // segunda parte de la estrella
    


  }  // main
}  // class


