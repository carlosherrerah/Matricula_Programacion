package u2B;
import static u2B.Funciones.*;
 
public class Trigonometricas {

  public static double g2r(double g) {
    return g*Math.PI/180;
  }
  
  public static void main(String[] args) {
    double r = Math.sin(45*Math.PI/180);
    System.out.printf("%.4f",r);

    r = Math.sin(g2r(45));
    System.out.printf("\n%.4f",r);

      double n=0.7071, result;
      result = r2g(Math.asin(n));
      System.out.println("Tu resultado es: " + result);   

  }
  
}
