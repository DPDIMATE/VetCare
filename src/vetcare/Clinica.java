package vetcare;

// Clase Clinica que implementa la interfaz Asegurable.
public class Clinica implements Asegurable {

    // Atributo propio de la clínica.
    private String nombre;

    // Constructor que inicializa el nombre de la clínica.
    public Clinica(String nombre) {
        this.nombre = nombre;
    }

    // Calcula la prima anual fija del seguro de la clínica.
    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    // Devuelve el número de póliza de la clínica.
    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLI-" + nombre.toUpperCase();
    }
}
