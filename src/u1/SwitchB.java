package u1;

public class SwitchB {
public static void main(String[] args) {
  int opcion = (int) (Math.random()*10);
  System.out.println(opcion);
  switch (opcion) {
    case 1:
      System.out.println("Uno");
      break;
    case 2:
      System.out.println("Dos");
      break;
    case 3:
      System.out.println("Tres");
      break;
    case 4:
      System.out.println("Cuatro");
      break;
    default:
      System.out.println("Otro");
  
    }

 
}  
}
