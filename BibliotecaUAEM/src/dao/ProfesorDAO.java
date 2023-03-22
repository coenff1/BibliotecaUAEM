package dao;
import archivos.LeerArchivo;
import dto.ProfesorDTO;
import java.util.List;

public class ProfesorDAO {
    List<ProfesorDTO> profesores;

    public List<ProfesorDTO> guardarProfesor (ProfesorDTO profesor){
        profesores = LeerArchivo.leerArchivoProfesores();
        profesores.add(profesor);
        return profesores;
    }
    
    public List<ProfesorDTO> listarProfesores(){
        return profesores = LeerArchivo.leerArchivoProfesores();
    }
    
    public List<ProfesorDTO> eliminarProfesor(int claveEmpleado){
        profesores = LeerArchivo.leerArchivoProfesores();
        for(int i=0; i<profesores.size(); i++){
            if(profesores.get(i).getClaveEmpleado() == claveEmpleado){
                profesores.remove(i);
            }
        }
        return profesores;
    }
    
    public ProfesorDTO buscarProfesor (int claveEmpleado) throws Exception{
        profesores = LeerArchivo.leerArchivoProfesores();
        ProfesorDTO profesor = null;
        for(int i=0; i<profesores.size(); i++){
            if(profesores.get(i).getClaveEmpleado()==claveEmpleado){
                profesor=profesores.get(i);
            }
        }
        if(profesor!=null){
            return profesor;
        } else{
            throw new Exception("Profesor no encontrado.");
        }
    }
}
