package dto;

public class AlumnoDTO extends Persona {
    private int id;
    private int numeroDeCuenta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    @Override
    public String toString() {
        return id + "," + 
                numeroDeCuenta + "," + 
                this.nombre + "," + 
                this.apellidoPaterno + "," + 
                this.apellidoMaterno + "," + 
                this.edad + "," + 
                this.genero;
    }
}