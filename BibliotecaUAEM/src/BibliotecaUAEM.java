import dto.LibroDTO;
import facade.LibroFacade;
import java.util.List;

public class BibliotecaUAEM {

    public static void main(String[] args) throws Exception {
        
        LibroFacade libroFacade = new LibroFacade();

        List<LibroDTO> listaDeLibros = libroFacade.imprimirListaDeLibros();
        System.out.println("Los libros guardados son:");
        for (int i = 0; i < listaDeLibros.size(); i++) {
            LibroDTO libro = listaDeLibros.get(i);
            System.out.println(libro);
        }
        
        /*libroFacade.crearLibro("Jinx", "mingwa", 100, "bl");
        
        listaDeLibros =libroFacade.imprimirListaDeLibros();
        System.out.println("Los libros guardados son:");
        for (int i = 0; i < listaDeLibros.size(); i++) {
            LibroDTO libro = listaDeLibros.get(i);
            System.out.println(libro);
        }*/
        
    //    LibroDTO nuevo = libroFacade.buscarLibro("Moonlight");
       // System.out.println(nuevo);
       // List<LibroDTO> nueva = libroFacade.buscarLibro("La sombra");
         /* libroFacade.eliminarLibro("El padrino");
        
        for (int i = 0; i < nueva.size(); i++) {
            LibroDTO libro = nueva.get(i);
            System.out.println(libro);
        }*/
        
    }
}
