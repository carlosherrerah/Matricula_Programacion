package u3;

public class AxB {

   public static void main(String[] args) {
      int matrizA[][] = {{1, 3}, {2, 4}};
      int matrizB[][] = {{2, 0, -4}, {3, 2, 6}};

//      int matrizA[][] = {{1, -2, 3}, {1, 0, -1}};
//      int matrizB[][] = {{4}, {5},{6}};

      int m = matrizA.length;
      int n = matrizB[0].length;
      int p = matrizB.length;
      int matrizC[][] = new int[m][n];

      if (matrizA[0].length != matrizB.length) {
		 System.out.println("Matrices Incompatibles"); 
//       throw new RuntimeException("Dimensiones Incompatibles");
      }

// Calculo de la matriz      
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            for (int k = 0; k < p; k++) {
               matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
            }
         }
      }

// Impresion de la matriz
      System.out.println("Matriz C");
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(matrizC[i][j] + "\t");
         }
         System.out.println(" ");
      }

   }  // main

}  // class

