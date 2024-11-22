package u3;

public class FactoriaR {

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static void main(String[] args) {
    int n = 4;
    int r = factorial(n);
    
    System.out.println("Factorial de " + n + " = " + r);

  }
}
