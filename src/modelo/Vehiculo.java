package modelo;

public class Vehiculo {
   private String id;
    private String marca;
    private String modelo;
    private int anio;
    private double tarifaDiaria;
    private boolean disponible;

    public Vehiculo(String id, String marca, String modelo, int anio, double tarifaDiaria, boolean disponible) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tarifaDiaria = tarifaDiaria;
        this.disponible = disponible;
    }

    
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tarifaDiaria=" + tarifaDiaria + ", disponible=" + disponible + '}';
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
