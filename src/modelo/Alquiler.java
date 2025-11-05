package modelo;
import java.util.Date;
public class Alquiler {
   private String id;
    private Date fechaEntrega;
    private Date fechaDevolucion;
    private double importeTotal;
    private String estado;
    private Reserva reservaasociada;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Inspeccion inspeccion;
    private Comprobante comprobante;

    public Alquiler(String id, Date fechaEntrega, Date fechaDevolucion, double importeTotal, String estado, Reserva reservaasociada, Vehiculo vehiculo, Cliente cliente) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.importeTotal = importeTotal;
        this.estado = estado;
        this.reservaasociada = reservaasociada;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.comprobante=new Comprobante();
        this.inspeccion=new Inspeccion();
    }

    

    
    public String toString() {
        return "Alquiler{" + "id=" + id + ", fechaEntrega=" + fechaEntrega + ", fechaDevolucion=" + fechaDevolucion + ", importeTotal=" + importeTotal + ", estado=" + estado + ", reservaasociada=" + reservaasociada + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", inspeccion=" + inspeccion + ", comprobante=" + comprobante + '}';
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

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Reserva getReservaasociada() {
        return reservaasociada;
    }

    public void setReservaasociada(Reserva reservaasociada) {
        this.reservaasociada = reservaasociada;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Inspeccion getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(Inspeccion inspeccion) {
        this.inspeccion = inspeccion;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }
}
