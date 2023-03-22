package dto;

public class ProfesorDTO extends Persona {
    protected int id;
    protected int claveEmpleado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    @Override
    public String toString() {
        return  id + "," + 
                claveEmpleado + ","+
                this.nombre + "," + 
                this.apellidoPaterno + "," + 
                this.apellidoMaterno + "," + 
                this.edad + "," + 
                this.genero;
    }
    
    
    
}
