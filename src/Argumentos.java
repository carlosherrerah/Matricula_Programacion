public class Argumentos {

  public static void main(String... args) {
  //public static void main(String[] args) {


    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    
    for (String elemento : args) {             // for each
      System.out.println("--> " + elemento);
    }
    System.out.println(". . . Hecho");
    
  }
  
}
