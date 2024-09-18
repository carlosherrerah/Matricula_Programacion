public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        System.out.println("Bye, World!");

        System.out.println("Welcome\nto\nJava\tProgramming!");

        String nombres[] = { "hola", "adios", "1000" };
        // Argumentos.main(nombres);
        Argumentos.main("hola", "adios", "100");

        System.out.println(". . . Hecho");
    }
}
