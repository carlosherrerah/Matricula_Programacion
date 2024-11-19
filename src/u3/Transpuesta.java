package u3;
public class Transpuesta {

    // Metodo de impresion de matrices
    public static void imprimirMatriz(int[][] m) {
      for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
          System.out.print(m[i][j] + "\t");
        }
        System.out.println();
      }
    }

    public static int[][] transpuesta(int[][] m) {
      int f = m.length;
      int c = m[0].length;
      int[][] t = new int[c][f];

      for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
          t[j][i] = m[i][j];
        }
      }
    
      return t;
    }

  public static void main(String[] args) {
    // matriz transpuesta
    int[][] a = {{1, 2, 3, 4}, 
                 {5, 6, 7, 8}, 
                 {9, 10, 11, 12}};
    int f = a.length;
    int c = a[0].length;             


    int[][] t = new int[c][f];

   /* 
    for (int i = 0; i < t.length; i++) {
      for (int j = 0; j < t[i].length; j++) {
        t[i][j] = a[j][i];
      }
    }
    */

    for (int i = 0; i < f; i++) {
      for (int j = 0; j < c; j++) {
        t[j][i] = a[i][j];
      }
    }
    System.out.println(t);
    imprimirMatriz(t);
    System.out.println("----------");
    System.out.println("que va a salir:");
    System.out.println(transpuesta(a));
    t = transpuesta(a);
    
    imprimirMatriz(a);
    System.out.println("Matriz transpuesta");
    imprimirMatriz(t);

  }

}
