package vetcare;

// Clase Ave que hereda de Animal.
public class Ave extends Animal {

    // Atributo propio de las aves.
    private double pesoGramos;

    // Constructor que inicializa los datos heredados y el peso.
    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    // Calcula el costo según el peso del ave.
    @Override
    public double calcularCostoConsulta() {
        return 28000 + (100 * pesoGramos);
    }
}
