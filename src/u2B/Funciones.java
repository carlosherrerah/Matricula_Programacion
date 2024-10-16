package u2B;

public class Funciones {


  public static double r2g(double r) {
    return r * 180 / Math.PI;
  }

  public static double g2r(double g) {
    return g*Math.PI/180;
  }

  public static int aleatorio(int min, int max) {
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }

  public static int sumar(int... datos) {
    int resultado = 0;
    for (int i = 0; i < datos.length; i++) {
      resultado += datos[i];
    }
    resultado = 0;
    for (int x : datos) {
      resultado += x;
    }
    return resultado;
  }

}
