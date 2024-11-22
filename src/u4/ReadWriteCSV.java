package u4;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

// https://datos.gob.mx/busca/dataset?res_format=CSV

class Dato {
  int id;
  String apellidos;
  LocalDate fecha;
}

public class ReadWriteCSV {

  public static void main(String[] args) {
    String filePathSource = "src/u4/Pacientes.csv";
    String filePathTarget = "src/u4/Enfermos200.csv";

    String PATRON = "dd/MM/yyyy"; // yyyy-MM-dd HH:mm:ss   yyyy-MM-dd'T'HH:mm:ss   
    DateTimeFormatter DTF = DateTimeFormatter.ofPattern(PATRON);

    List<Dato> leidos = new ArrayList<>();

    try {
      BufferedReader br = new BufferedReader(new FileReader(filePathSource));
      BufferedWriter bw = new BufferedWriter(new FileWriter(filePathTarget));

      String line = br.readLine(); // La primera línea es el encabezado
      bw.write(line);
      bw.newLine();

      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");

        if (Integer.parseInt(values[0]) >= 200 && Integer.parseInt(values[0]) < 300) { // elegir el filtro

          Dato dato = new Dato();
          dato.id = Integer.parseInt(values[0]);
          dato.apellidos = values[1];
          dato.fecha = LocalDate.parse(values[2], DTF);

          bw.write(dato.id + ", " + dato.apellidos + ", " + dato.fecha + "\n");
          leidos.add(dato);
        }
      }
      bw.flush();
      bw.close();
    } catch (IOException e) {
      System.err.println("IO Error");
      System.err.println(e.toString());
      e.printStackTrace();

    } finally {
      System.out.println("Total de registros Seleccionados: " + leidos.size());
    } // End try

    for (Dato elemento : leidos) {
      System.out.println(elemento.id + " : " + elemento.apellidos + " : " + elemento.fecha);
    }
    System.out.println("Fin del programa");

  }

}
