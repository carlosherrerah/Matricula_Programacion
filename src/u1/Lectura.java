package u1;
import java.util.Scanner;

public class Lectura {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int num = sc.nextInt();
    System.out.println("El número introducido es: " + num);
    System.out.printf( "El numero is %d\n", num );
  }

  
}
