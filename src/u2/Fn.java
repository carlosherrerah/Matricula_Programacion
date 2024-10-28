package u2;

public class Fn {

  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }
 
  
}
