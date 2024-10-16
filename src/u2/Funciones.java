package u2;

public class Funciones {

  public static int aleatorio(int min, int max) {
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }

  public static double r2g(double radianes) {
    return radianes * 180 / Math.PI;
  }


  
}
