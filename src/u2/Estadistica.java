package u2;

public class Estadistica {

  public static double sumar(double[] datos) {
    double suma = 0;
    for (int i = 0; i < datos.length; i++) {
      suma += datos[i];
    }
    return suma;
  }

  public static double desviacionEstandar(double[] datos) {
    double media = 0;
    double suma = sumar(datos);
    media = suma / datos.length;
    double sumaCuadrados = 0;
    for (int i = 0; i < datos.length; i++) {
      sumaCuadrados += Math.pow(datos[i] - media, 2);
    }
    return Math.sqrt(sumaCuadrados / (datos.length - 1 ));
  }

  public static void main(String[] args) {
    // Entrada
    double[] datos = {4, 1, 11, 13, 2, 7};
    double media = 0;
    double desviacion = 0;

    // Proceso
    double suma = sumar(datos);
    System.out.println("Suma: " + suma);
    media = suma / datos.length;
    desviacion = desviacionEstandar(datos);

    // Salida
    System.out.println("Media: " + media);
    System.out.println("Desviación: " + desviacion);

    
    

  }
  
}
