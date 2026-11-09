package vetcare;

// Interfaz que establece los comportamientos de los elementos asegurables.
public interface Asegurable {

    // Calcula el valor de la prima del seguro.
    double calcularPrimaSeguro();

    // Devuelve el número de póliza.
    String obtenerNumeroPoliza();
}
