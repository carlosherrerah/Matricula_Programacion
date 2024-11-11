package u3;
public class Matrices {

  public static int aleatorio(int min, int max) {
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }

  // Metodo de impresion de matrices
  public static void imprimirMatriz(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int f = 3, c = 3;
    int [][] a = {{1, 2, 3}, 
                  {4, 5, 6}, 
                  {7, 8, 9}};
    int[][] b = new int [f][c];
    int[][] r = new int [f][c];

    // llenar b con valores aleatorios
    for (int i = 0; i < f; i++) {
      for (int j = 0; j < b[0].length; j++) {
        b[i][j] = aleatorio(-5, 9);
      }
    }


  // suma a + b
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        r[i][j] = a[i][j] + b[i][j];
      }
    }

    System.out.println("Matriz a");
    imprimirMatriz(a);
    System.out.println("\nMatriz b");
    imprimirMatriz(b);
    System.out.println("\nMatriz r");
    imprimirMatriz(r);

/*
    // imprimir a
    System.out.println("Matriz a");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    // imprimir b
    System.out.println("Matriz b");
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b[i].length; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }

    // imprimir r
    System.out.println("Matriz c");
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[i].length; j++) {
        System.out.print(r[i][j] + " ");
      }
      System.out.println();
    }
      */
  }
  
}
