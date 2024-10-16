
package u1;
public class SwitchA {


    // (int) (Math.random() * ((max - min) + 1)) + min;
public static int aleatorio(int min, int max) { 
  return (int) (Math.random() * ((max - min) + 1)) + min;
}

public static void aleatorioSinReturn(int min, int max)  {
  int r = (int) (Math.random() * ((max - min) + 1)) + min;
  System.out.println("El resultado sin Retorno es: " + r);
}

public static double r2g(double radianes) {
  return radianes * 180 / Math.PI;
}


  public static void main(String[] args) {
    int r = (int) (Math.random()*10);
    System.out.println(r);

    r = aleatorio(1, 5);
    System.out.println(r);

    aleatorioSinReturn(5, 10);

    // tarea
    // operaciones basicas + - *

    int opcion = aleatorio(0, 4);
    //opcion = 1 es +, 2 es resta, 3 es multiplicacon
    switch (opcion) {
      case 1:
        System.out.println("Suma");
        
        break;
      
      case 2:
        System.out.println("Resta");
        break;

      default:
        System.out.println("Que opcion es ?????");
        break;

    }
  }
}
