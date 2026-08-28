public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo("EFGH-34", "Hyundai", "Accent", 125000, true);
        Camion camion1 = new Camion("JKLM-56", "Mitsubishi", "L200", 98000, true, (double)1000.0F, "4x4");
        camion1.mostrarInformacion();
        vehiculo1.validarMantencion();
        System.out.println(vehiculo2.recorrerKilometraje(20));
    }
}