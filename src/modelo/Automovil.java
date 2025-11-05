package modelo;

public class Automovil {
  private int numPuertas;
    private String tipoCombi;

    public Automovil(int numPuertas, String tipoCombi) {
        this.numPuertas = numPuertas;
        this.tipoCombi = tipoCombi;
    }
    public String toString() {
        return "Automovil{" + "numPuertas=" + numPuertas + ", tipoCombi=" + tipoCombi + '}';
    }
    public void mostrar(){
        System.out.println(toString());
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombi() {
        return tipoCombi;
    }

    public void setTipoCombi(String tipoCombi) {
        this.tipoCombi = tipoCombi;
    }
}
