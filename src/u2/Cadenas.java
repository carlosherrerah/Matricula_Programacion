package u2;

public class Cadenas {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String minusculas = cadena.toLowerCase();

        System.out.println(cadena.length());
        char letra = cadena.charAt(1);
        System.out.println(cadena.charAt(1));
        System.out.println(minusculas);

        if (cadena.charAt(1)== 'o') {
            System.out.println("La segunda letra es una o");
        } else {
            System.out.println("La segunda letra no es una o");
        }
        // Ejercicio 1
        // cuantas vocales tiene la cadena

        // Ejercicio 2
        // cuantas vocales hay de cada una, hacer en un arreglo de vocales
 
    }
  }
