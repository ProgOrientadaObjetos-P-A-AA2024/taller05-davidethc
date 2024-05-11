
package paquete3;

public class Automotor {
    
   private long cedulaDueño;
    private String marca;
    private int año;
    private float valorVehiculo;
    private float valorMatricula;

    public Automotor(long c, String m, int a, float b) {
        cedulaDueño = c;
        marca = m;
        año = a;
        valorVehiculo = b;
    }

    public Automotor(long c, String m, float b) {
        cedulaDueño = c;
        marca = m;
        año = 2010;
        valorVehiculo = b;
    }

    public void estabeleceCedulaDueño(long x) {
        cedulaDueño = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerAño(int x) {
        año = x;
    }

    public void establecerValorVehiculo(float x) {
        valorVehiculo = x;
    }

    public void establecerValorMatricula() {
        float porcentaje = 0.002f; // 0.002% como decimal
        int antiguedad = 2024 - año; // Calcula la antigüedad del vehículo
        valorMatricula = valorVehiculo * porcentaje * antiguedad;
    }

    public long obtenerCedulaDueño() {
        return cedulaDueño;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAño() {
        return año;
    }

    public float obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public float obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Características automotor\n"
                + "Cedula: %d\n"
                + "Marca: %s\n"
                + "Año: %d\n"
                + "Valor del vehiculo %.3f\n"
                + // Agrega un salto de línea para una mejor visualización
                "Valor de la matricula %.3f", cedulaDueño, marca, año, valorVehiculo, valorMatricula);
        return cadena;
    }

}

