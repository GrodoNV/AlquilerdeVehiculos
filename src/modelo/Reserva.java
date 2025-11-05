package modelo;
import java.util.Date;
public class Reserva{
   private String id;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private Vehiculo vehiculo;

    public Reserva(String id, Date fechaInicio, Date fechaFin, String estado, Vehiculo vehiculo) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public String toString() {
        return "Reserva{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + ", vehiculo=" + vehiculo + '}';
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
