package u1;

public class Metodos {
  // (int) (Math.random() * ((max - min) + 1)) + min;

  public static int aleatorio(int min, int max) {
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }

  public static void aleatorioSinReturn(int min, int max) {
    int r = (int) (Math.random() * ((max - min) + 1)) + min;
    System.out.println("El resultado sin Retorno es: " + r);
  }

  public static int posNeg(int num) {
    int r = 0;
    r = (num >= 0) ? 1 : -1;
    return r;
  }
  /*
   * public static int sumar(int a, int b ) {
   * return a + b;
   * }
   * 
   * public static int sumar(int a, int b, int c ) {
   * return a + b + c;
   * }
   */

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

  public static void main(String[] args) {

    int numero = -20, resultado = 0;
    String mensaje = "";

    if (numero >= 18) {
      mensaje = "Eres mayor de Edad";
    } else {
      mensaje = "Eres menor de Edad";
    }
    System.out.println(mensaje);

    mensaje = (numero >= 18) ? "Eres mayor de Edad" : "Eres menor de Edad";
    System.out.println(mensaje);

    resultado = (numero > 0) ? 1 : -1;
    System.out.println(resultado);

    resultado = posNeg(numero);
    System.out.println("El resultado es: " + resultado);

    System.out.println(sumar(5, 6));
    System.out.println(sumar(5, 6, -7));
    
    int r2 = aleatorio(5, 10);
    System.out.println(r2);
    aleatorioSinReturn(5, 10);

    System.out.println("Hecho");
  }

}

