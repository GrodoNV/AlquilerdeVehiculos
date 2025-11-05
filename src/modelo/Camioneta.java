package modelo;

public class Camioneta extends Vehiculo{
  private double capCarga;
    private boolean dobleCabina;

    
    public String toString() {
        return "Camioneta{" + "capCarga=" + capCarga + ", dobleCabina=" + dobleCabina + '}';
    }

    public Camioneta(double capCarga, boolean dobleCabina) {
        this.capCarga = capCarga;
        this.dobleCabina = dobleCabina;
    }
    public void mostrar(){
        System.out.println(toString());
    }

    public double getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }

    public boolean isDobleCabina() {
        return dobleCabina;
    }

    public void setDobleCabina(boolean dobleCabina) {
        this.dobleCabina = dobleCabina;
    }
}
