package dao;
import archivos.LeerArchivo;
import dto.LibroDTO;
import java.util.List;

public class LibroDAO {
    List<LibroDTO> libros;

    public List<LibroDTO> guardarLibro(LibroDTO libro) {
        libros = LeerArchivo.leerArchivoLibros();
        libros.add(libro);
        return libros;
    }

    public List<LibroDTO> listarLibros() {
        return libros = LeerArchivo.leerArchivoLibros();
    }

    public List<LibroDTO> eliminarLibro(String titulo) {
        libros = LeerArchivo.leerArchivoLibros();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libros.remove(i);
            }
        }
        // regresa una lista de libros (con el libro eliminado) para reescribir en el archivo txt
        return libros;
    }

    public LibroDTO buscarLibro(String titulo) throws Exception {
        libros = LeerArchivo.leerArchivoLibros();
        LibroDTO libro = null;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libro = libros.get(i);
            }
        }
        if (libro != null) {
            return libro;
        } else {
            throw new Exception("Libro no encontrado");
        }
    }

    public List<LibroDTO> actualizarLibro(LibroDTO libro) {
        libros = LeerArchivo.leerArchivoLibros();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                libros.get(i).setTitulo(libro.getTitulo());
                libros.get(i).setAutor(libro.getAutor());
                libros.get(i).setNumPaginas(libro.getNumPaginas());
                libros.get(i).setCategoria(libro.getCategoria());
            }
        }
        return libros;
    }
}
