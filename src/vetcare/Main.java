package vetcare;

// Clase principal para ejecutar y probar el sistema.
public class Main {

    public static void main(String[] args) {

        // Crear objetos de cada especie.
        Perro perro = new Perro("Max", 5, "Carlos", "Labrador");
        Gato gato = new Gato("Michi", 3, "Laura", true);
        Ave ave = new Ave("Piolin", 2, "Andres", 150);
// Crear un objeto de tipo Conejo.
        Conejo conejo = new Conejo("Nube", 1, "Sofia");
        // Crear un objeto de la clínica.
        Clinica clinica = new Clinica("VetCare");

        // Registrar vacunas.
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        // Arreglo de animales para demostrar polimorfismo.
        Animal[] animales = {perro, gato, ave, conejo};
        System.out.println("===== FICHAS DE ANIMALES =====");

        for (Animal animal : animales) {
            animal.imprimirFicha();
            System.out.println("-----------------------------");
        }

        // Arreglo de elementos asegurables.
        Asegurable[] asegurables = {perro, gato, clinica};

        System.out.println("\n===== SEGUROS =====");

        for (Asegurable elemento : asegurables) {
            System.out.println("Prima del seguro: $" + elemento.calcularPrimaSeguro());
            System.out.println("Número de póliza: " + elemento.obtenerNumeroPoliza());
            System.out.println("-----------------------------");
        }

        // Mostrar cantidad de vacunas aplicadas.
        System.out.println("\n===== VACUNACIÓN =====");
        System.out.println("Vacunas de Max: " + perro.getVacunasAplicadas());
        System.out.println("Vacunas de Michi: " + gato.getVacunasAplicadas());
    }
}
