package facade;
import dao.LibroDAO;
import dto.LibroDTO;
import java.util.ArrayList;
import java.util.List;

public class LibroFacade {
    LibroDAO libroDAO;
    LibroDTO libro;
    int id;

    public LibroFacade() {
        libroDAO= new LibroDAO();
    }
    
    public LibroDTO buscarLibro(String nombre)throws Exception{
        try{
            return libro= libroDAO.buscarLibro(nombre);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return libro;
    }
    
    public void crearLibro(String titulo, String autor, int numPaginas, String categoria){
        id= libroDAO.listarLibros().size()+1;
        libro= new LibroDTO();
        libro.setId(id);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNumPaginas(numPaginas);
        libro.setCategoria(categoria);
        
        libroDAO.guardarLibro(libro);
          
    }
    
    public List<LibroDTO> imprimirListaDeLibros(){
        return libroDAO.listarLibros();
    }
    
    public List<LibroDTO> eliminarLibro(String titulo){
        return libroDAO.eliminarLibro(titulo);
    }
    
    public void actualizarLibro(int id, String titulo, String autor, int numPaginas, String categoria){
        LibroDTO libro=new LibroDTO();
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setNumPaginas(numPaginas);
        libro.setCategoria(categoria);
        
        libroDAO.actualizarLibro(libro);
    }
    
    public List<LibroDTO> obtenerLibrosPorCategoria(String categoria){
        List<LibroDTO> obtenerLibros = libroDAO.listarLibros();
        List<LibroDTO> librosFiltrados = new ArrayList<>();
        for(int i=0; i<obtenerLibros.size(); i++){
            if(categoria.equals(obtenerLibros.get(i).getCategoria())){
                librosFiltrados.add(obtenerLibros.get(i));
            }
        }
        return librosFiltrados;
    }
}
