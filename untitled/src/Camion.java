public class Camion extends Vehiculo {
    private double capacidadCarga;
    private String traccion;

    public Camion() {
    }

    public Camion(String patente, String marca, String modelo, int kilometraje, boolean operativo, double capacidadCarga, String traccion) {
        super(patente, marca, modelo, kilometraje, operativo);
        this.capacidadCarga = capacidadCarga;
        this.traccion = traccion;
    }

    public double getCapacidadCarga() {
        return this.capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTraccion() {
        return this.traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public boolean puedeTransportar(double peso) {
        return peso > (double)0.0F && peso == this.capacidadCarga;
    }

    public String toString() {
        return " Capacidad de carga: " + this.capacidadCarga + " Traccion: " + this.traccion;
    }
}
