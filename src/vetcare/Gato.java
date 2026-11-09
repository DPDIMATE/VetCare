package vetcare;

import java.util.ArrayList;
import java.util.List;

// Clase Gato que hereda de Animal e implementa dos interfaces.
public class Gato extends Animal implements Vacunable, Asegurable {

    // Atributos propios de los gatos.
    private boolean esEsterilizado;
    private List<String> vacunas;

    // Constructor que inicializa los datos heredados y propios.
    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
        this.vacunas = new ArrayList<>();
    }

    // Calcula el costo fijo de consulta para los gatos.
    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    // Registra una vacuna en la lista.
    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    // Devuelve la cantidad de vacunas aplicadas.
    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    // Calcula la prima del seguro según el estado de esterilización.
    @Override
    public double calcularPrimaSeguro() {
        if (esEsterilizado) {
            return 120000;
        } else {
            return 200000;
        }
    }

    // Devuelve el número de póliza del gato.
    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GAT-" + nombre.toUpperCase();
    }
}


