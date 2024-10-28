package u2;

public class Matrices {

  public static void main(String[] args) {
    String[] nombre = { "hugo", "Paco", "Luis", "Batman", "Robin" };
    String materia[] = { "Mat", "Fis", "Qui" };

    int cal[][] = { { 10, 9, 8 }, 
                    { 7,  6, 8 }, 
                    { 4,  3, 2 }, 
                    { 10, 5, 7 }, 
                    { 9,  8, 7 }
                  }; // 5X3

    // Imprimir la matriz
    for (int i = 0; i < cal.length; i++) {
      for (int j = 0; j < cal[0].length; j++) {
        System.out.print(cal[i][j]+"\t");
      }
      System.out.println("");
    }
  
    
  }

}
