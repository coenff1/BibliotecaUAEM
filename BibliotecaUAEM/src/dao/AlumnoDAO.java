package dao;
import archivos.LeerArchivo;
import dto.AlumnoDTO;
import java.util.List;

public class AlumnoDAO {
    List<AlumnoDTO> alumnos;
    
    public List<AlumnoDTO> guardarAlumno(AlumnoDTO alumno){
        alumnos = LeerArchivo.leerArchivoAlumnos();
        alumnos.add(alumno);
        return alumnos;
    }
    
    public List<AlumnoDTO> listarAlumnos(){
        return alumnos = LeerArchivo.leerArchivoAlumnos();
    }
    
    public List<AlumnoDTO> eliminarAlumno(int numCuenta){
        alumnos = LeerArchivo.leerArchivoAlumnos();
        for(int i=0; i<alumnos.size(); i++){
            if(alumnos.get(i).getNumeroDeCuenta()==numCuenta){
                alumnos.remove(i);
            }
        }
        return alumnos;
    }
    
    public AlumnoDTO buscarAlumno(int numCuenta) throws Exception{
        alumnos = LeerArchivo.leerArchivoAlumnos();
        AlumnoDTO alumno= null;
        for(int i=0; i<alumnos.size(); i++){
            if(alumnos.get(i).getNumeroDeCuenta() == numCuenta){
                alumno=alumnos.get(i);
            }
        }
        if(alumno!=null){
            return alumno;
        } else{
            throw new Exception("Alumno no encontrado.");
        }
    }
    
    public List<AlumnoDTO> actualizarAlumno(AlumnoDTO alumno){
        alumnos = LeerArchivo.leerArchivoAlumnos();
        for(int i=0; i<alumnos.size(); i++){
            if(alumnos.get(i).getNumeroDeCuenta() == alumno.getNumeroDeCuenta()){
                alumnos.get(i).setId(alumno.getId());
                alumnos.get(i).setNumeroDeCuenta(alumno.getNumeroDeCuenta());
                alumnos.get(i).setNombre(alumno.getNombre());
                alumnos.get(i).setApellidoPaterno(alumno.getApellidoPaterno());
                alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
                alumnos.get(i).setEdad(alumno.getEdad());
                alumnos.get(i).setGenero(alumno.getGenero());
            }
        }
        return alumnos;
    }
    
}