package u2;

public class Importaciones {
  public static void main(String[] args) {

    Fn.factorial(4);  // dentro del mismo paquete no es necesario importar


    // Si esta en otro paquete es necesario importar

    //import mate.*;
    //Funciones.factorial(4);

    //import mate.Funciones;
    //Funciones.factorial(4); 

    //import mate.Funciones.*;
    //factorial(4);

    //import static mate.Funciones.*;
    //factorial(4);



  }
  
}
