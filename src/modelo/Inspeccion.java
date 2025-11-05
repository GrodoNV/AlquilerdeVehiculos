package modelo;
import java.util.Date;
public class Inspeccion {
    private String id;
    private String tipo;
    private Date fecha;
    private String observaciones; 
    private Vehiculo vehiculo;

    public Inspeccion(String id, String tipo, Date fecha, String observaciones, Vehiculo vehiculo) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.vehiculo = vehiculo;
    }

    public String toString() {
        return "Inspeccion{" + "id=" + id + ", tipo=" + tipo + ", fecha=" + fecha + ", observaciones=" + observaciones + ", vehiculo=" + vehiculo + '}';
    }
    public void mostrar(){
        System.out.println(toString());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
