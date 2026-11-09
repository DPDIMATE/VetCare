package vetcare;

// Interfaz que establece los comportamientos de los animales vacunables.
public interface Vacunable {

    // Registra una vacuna aplicada al animal.
    void registrarVacuna(String nombre);

    // Devuelve la cantidad de vacunas aplicadas.
    int getVacunasAplicadas();
}
