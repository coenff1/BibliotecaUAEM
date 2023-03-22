package utils;
import dao.LibroDAO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaArchivo {
    List<LibroDAO> libros;

    public ListaArchivo() {
        libros = new ArrayList<>();
    }
    
    
    public void leerArchivo(String ruta){
        String line;
        try {
            Scanner input = new Scanner(new File(ruta));
            while (input.hasNextLine()) {
                line = input.nextLine();
                if (!"".equals(line)) {
                    // Comparación en la que define si la cadena está vacía o no.
            //        libros.add(line);
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo.");
        }
    }
    
    
}
