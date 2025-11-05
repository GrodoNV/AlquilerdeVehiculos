package modelo;
import java.util.Date;
public class Comprobante {
    private String id;
    private Date fechaEmision;
    private String detalle;
    private double monto;

    public Comprobante(String id, Date fechaEmision, String detalle, double monto) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.detalle = detalle;
        this.monto = monto;
    }

    
    public String toString() {
        return "Comprobante{" + "id=" + id + ", fechaEmision=" + fechaEmision + ", detalle=" + detalle + ", monto=" + monto + '}';
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

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
