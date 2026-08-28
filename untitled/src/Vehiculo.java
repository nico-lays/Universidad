//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int kilometraje;
    private boolean operativo;

    public Vehiculo(String patente, String marca, String modelo, int kilometraje, boolean operativo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.setKilometraje(kilometraje);
        //this.kilometraje = kilometraje;
        this.operativo = operativo;
    }

    public Vehiculo() {
        this.patente = "WN-JW.68";
        this.marca = "Toyota";
        this.modelo = "Automatico";
        this.kilometraje = 130000;
        this.operativo = true;
    }

    public boolean isOperativo() {
        return this.operativo;
    }

    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }

    public int getKilometraje() {
        return this.kilometraje;
    }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }



    public void mostrarInformacion() {
        System.out.println("Patente " + this.patente + " Marca " + this.marca + " Modelo " + this.modelo + " Kilometraje " + this.kilometraje + " Operativo " + this.operativo + toString());
    }

    public void validarMantencion() {
        if (this.kilometraje > 100000) {
            System.out.println("Supera los 100.000 necesita mantencion");
        } else {
            System.out.println("No supera los 100.000 no necesita mantencion");
        }

    }

    public boolean cambiarEstadoOperativo() {
        if (this.operativo == true) {
            this.operativo = false;
            return this.operativo;
        } else {
            this.operativo = true;
            return this.operativo;
        }
    }

    public void setKilometraje(int kilometraje)
    {
        if (kilometraje > 0)
        {
            this.kilometraje = kilometraje;
        }
        else{
            System.out.println("Kilometraje no puede ser negativo");
        }
    }
    public int recorrerKilometraje(int cantidad){

        if(cantidad>0){
            this.kilometraje = this.kilometraje + cantidad;
        }
        else
        {   System.out.println("Kilometraje debe ser la cantidad mayor a 0");
        }
        return kilometraje;
    }

}
