package u1;
public class DescendenteA {

  public static void main(String[] args) {
 
    int n = 5;
/*
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println();

    for (int i = n;   i >= 1; i--) {
      System.out.println(i);
    }
    System.out.println();

    for (int i = 1; i <= n*2   ; i=i+2) {
        System.out.println(i);
    }

    int signo = -1;
    for (int i = 1; i <= n; i++) {
      signo = signo * (-1);
      System.out.print(signo + "\t");
    }
    System.out.println();

*/

    // Cuadratica
    double r = Math.pow(2, 3);
    System.out.println(r);

    r = Math.pow(25, 0.5);
    r = Math.sqrt(36);
    System.out.println(r);

    System.out.println(2 + "i");
    int  real = 3;
    int  imag = 2;
    String res = real + "+" + imag + "i";
    System.out.println(res); 


  }


}
