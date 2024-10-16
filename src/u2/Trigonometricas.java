package u2;
import static u2.Funciones.*;

public class Trigonometricas {

  public static double g2r(double grados) {
    return grados * Math.PI / 180;
  }


  public static void main(String[] args) {
    double r = 0;
    r = Math.sin(45*Math.PI/180);
    System.out.println(r);

    r = Math.sin(g2r(45));
    System.out.println(r);

    r = Math.acos(r2g(0.7071));
  }

  
}
