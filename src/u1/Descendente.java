package u1;

public class Descendente {
  public static void main(String[] args) {
/*
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println();

    for (int i = 10;  i >= 1    ; i--) {
        System.out.println(i);
    }
*/        

/*
    for (int i = 0; i <= 20 ; i=i+2) {  // pares
      System.out.println(i);
    }


    for (int i = 1; i <= 20; i=i+2) {
      System.out.println(i);
   }

   System.out.println("------>");
    int signo = -1;
    for (int i = 1; i <=10; i++) {
      signo = signo  * -1;
      System.out.println(signo);
    }
*/
    // Ecuaciones cuadraticas
    double resultado = Math.pow(2, 3);
    System.out.println(resultado);
    resultado =  Math.pow(25, 0.5);
    System.out.println(resultado);
    resultado = Math.sqrt(36);
    System.out.println(resultado);

    String r = 3 + "+" + resultado + "i";
    System.out.println(r);


  }  

}
