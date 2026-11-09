package vetcare;

// Clase Conejo que hereda de Animal.
public class Conejo extends Animal {

    // Constructor que inicializa los datos heredados.
    public Conejo(String nombre, int edad, String nombreDueno) {
        super(nombre, edad, nombreDueno);
    }

    // Establece el costo fijo de consulta para los conejos.
    @Override
    public double calcularCostoConsulta() {
        return 35000;
    }
}
