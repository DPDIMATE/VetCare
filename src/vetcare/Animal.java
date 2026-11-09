package vetcare;

/**
 * Clase abstracta que representa los datos y comportamientos
 * comunes de todos los animales de la clínica.
 */
public abstract class Animal {

    // Atributos compartidos por todas las especies.
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    // Constructor que inicializa los datos del animal.
    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    // Cada especie implementa su propio cálculo del costo.
    public abstract double calcularCostoConsulta();

    // Muestra la información del animal y el costo de su consulta.
    public void imprimirFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
    }
}



