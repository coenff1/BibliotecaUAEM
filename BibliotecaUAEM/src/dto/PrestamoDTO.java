package dto;
import java.util.Date;
import java.util.List;

public class PrestamoDTO {
    private int id;
    private int folio;
    private Date fechaInicio;
    private Date fechaTermino;
    private List<LibroDTO> libros;
    private Persona persona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public List<LibroDTO> getLibros() {
        return libros;
    }

    public void setLibros(List<LibroDTO> libros) {
        this.libros = libros;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return  id + "," + 
                folio + "," + 
                fechaInicio + "," + 
                fechaTermino + "," + 
                libros + "," + 
                persona;
    }
    
}
