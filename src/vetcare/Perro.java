package vetcare;

import java.util.ArrayList;
import java.util.List;

// Clase Perro que hereda de Animal e implementa dos interfaces.
public class Perro extends Animal implements Vacunable, Asegurable {

    // Atributos propios de los perros.
    private String raza;
    private List<String> vacunas;

    // Constructor que inicializa los datos heredados y propios.
    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }

    // Calcula el costo de consulta según la edad del perro.
    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000 * edad);
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

    // Calcula la prima del seguro según la edad del perro.
    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    // Devuelve el número de póliza del perro.
    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PER-" + nombre.toUpperCase();
    }
}
