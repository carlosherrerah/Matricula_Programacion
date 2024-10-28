package mate;

public class Funciones {

  public static int aleatorio(int min, int max) {
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }

  public static double r2g(double radianes) {
    return radianes * 180 / Math.PI;
  }

  public static double g2r(double g) {
    return g*Math.PI/180;
  }

  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }
  
  public static int mayor(int arreglo[] ) {
    int mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if (arreglo[i] > mayor) {
        mayor = arreglo[i];
      }
    }
    return mayor;
  }
  
}
