package archivos;
import dto.AlumnoDTO;
import dto.LibroDTO;
import dto.ProfesorDTO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.Rutas;

public class LeerArchivo {
    
    public static List<LibroDTO> leerArchivoLibros() {
        String line;
        List<LibroDTO> libros = new ArrayList<>();
        try {
            Scanner linea = new Scanner(new File(Rutas.RUTA_LIBROS));
            while (linea.hasNextLine()) {
                line = linea.nextLine();
                libros.add(LeerArchivo.convertirLineaALibro(line));
            }
            linea.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo.");
        }
        return libros;
    }
    
    public static LibroDTO convertirLineaALibro (String line){
        String libro[] = line.split(",");
        LibroDTO lineaALibro = new LibroDTO();
        
        lineaALibro.setId(Integer.parseInt(libro[0]));
        lineaALibro.setTitulo(libro[1]);
        lineaALibro.setAutor(libro[2]);
        lineaALibro.setNumPaginas(Integer.parseInt(libro[3]));
        lineaALibro.setCategoria(libro[4]);
        
        return lineaALibro;
    } 
    
    public static List<AlumnoDTO> leerArchivoAlumnos() {
        String line;
        List<AlumnoDTO> alumnos = new ArrayList<>();
        try {
            Scanner linea = new Scanner(new File(Rutas.RUTA_LIBROS));
            while (linea.hasNextLine()) {
                line = linea.nextLine();
                alumnos.add(LeerArchivo.convertirLineaAAlumno(line));
            }
            linea.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo.");
        }
        return alumnos;
    }
    
    public static AlumnoDTO convertirLineaAAlumno(String line){
        String lineaAlumno[] = line.split(",");
        AlumnoDTO alumno = new AlumnoDTO();
        alumno.setId(Integer.parseInt(lineaAlumno[0]));
        alumno.setNumeroDeCuenta(Integer.parseInt(lineaAlumno[1]));
        alumno.setNombre(lineaAlumno[2]);
        alumno.setApellidoPaterno(lineaAlumno[3]);
        alumno.setApellidoMaterno(lineaAlumno[4]);
        alumno.setEdad(Integer.parseInt(lineaAlumno[5]));
        alumno.setGenero(lineaAlumno[6]);
        return alumno;
    }
    
    public static List<ProfesorDTO> leerArchivoProfesores(){
        String line;
        List<ProfesorDTO> profesores = new ArrayList<>();
        try{
            Scanner linea = new Scanner(new File(Rutas.RUTA_PROFESORES));
            while(linea.hasNextLine()){
                line=linea.nextLine();
                profesores.add(LeerArchivo.convertirLineaAProfesor(line));
            }
            linea.close();
        } catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo");
        }
        return profesores;
    }
    
    public static ProfesorDTO convertirLineaAProfesor(String line){
        String lineaProfesor[]=line.split(",");
        ProfesorDTO profesor = new ProfesorDTO();
        profesor.setId(Integer.parseInt(lineaProfesor[0]));
        profesor.setClaveEmpleado(Integer.parseInt(lineaProfesor[1]));
        profesor.setNombre(lineaProfesor[2]);
        profesor.setApellidoPaterno(lineaProfesor[3]);
        profesor.setApellidoMaterno(lineaProfesor[4]);
        profesor.setEdad(Integer.parseInt(lineaProfesor[5]));
        profesor.setGenero(lineaProfesor[6]);
        return profesor;
    }
}